package com.line.demo.sapdemo.client;

import com.sap.conn.jco.ext.DataProviderException;
import com.sap.conn.jco.ext.DestinationDataEventListener;
import com.sap.conn.jco.ext.DestinationDataProvider;

import java.util.HashMap;
import java.util.Properties;

/**
 * Each application using Java Connector 3 deals with destinations. A destination represents a logical address
 * of an ABAP system and thus separates the destination configuration from application logic. JCo retrieves
 * the destination parameters required at runtime from DestinationDataProvider and ServerDataProvider registered
 * in the runtime environment. If no provider is registered, JCo uses the default implementation that reads the
 * configuration from a properties file. It is expected that each environment provides a suitable
 * implementation that meets security and other requirements. Furthermore, only one DestinationDataProvider
 * and only one ServerDataProvider can be registered per process. The reason behind this design decision
 * is the following: the provider implementations are part of the environment infrastructure.
 * The implementation should not be application specific, and in particular must be separated from
 * application logic.
 * <p>
 * This example demonstrates a simple implementation of the DestinationDataProvider interface and shows how
 * to register it. A real world implementation should save the configuration data in a secure way.
 */
public class CustomDestinationDataProvider {
    //The custom destination data provider implements DestinationDataProvider and
    //provides an implementation for at least getDestinationProperties(String).
    //Whenever possible the implementation should support events and notify the JCo runtime
    //if a destination is being created, changed, or deleted. Otherwise JCo runtime
    //will check regularly if a cached destination configuration is still valid which incurs
    //a performance penalty.
    static class TnDestinationDataProvider implements DestinationDataProvider {
        private DestinationDataEventListener eL;
        private HashMap<String, Properties> secureDBStorage = new HashMap<String, Properties>();
        private static TnDestinationDataProvider provider = new TnDestinationDataProvider();

        private TnDestinationDataProvider() {// ����ģʽ
            if (provider == null) {
                secureDBStorage = new HashMap<String, Properties>();
            }
        }

        public static TnDestinationDataProvider getInstance() {
            return provider;
        }

        public Properties getDestinationProperties(String destinationName) {
            try {
                //read the destination from DB
                Properties properties = secureDBStorage.get(destinationName);
                if (properties != null) {
                    //check if all is correct, for example
                    if (properties.isEmpty())
                        throw new DataProviderException(DataProviderException.Reason.INVALID_CONFIGURATION, "destination configuration is incorrect", null);
                    return properties;
                }
                return null;
            } catch (RuntimeException re) {
                throw new DataProviderException(DataProviderException.Reason.INTERNAL_ERROR, re);
            }
        }

        //An implementation supporting events has to retain the eventListener instance provided
        //by the JCo runtime. This listener instance shall be used to notify the JCo runtime
        //about all changes in destination configurations.
        public void setDestinationDataEventListener(DestinationDataEventListener eventListener) {
            this.eL = eventListener;
        }

        public boolean supportsEvents() {
            return true;
        }

        //implementation that saves the properties in a very secure way
        void changeProperties(String destName, Properties properties) {
            synchronized (secureDBStorage) {
                if (properties == null) {
                    if (secureDBStorage.remove(destName) != null)
                        eL.deleted(destName);
                } else {
                    secureDBStorage.put(destName, properties);
                    eL.updated(destName); // create or updated
                }
            }
        }
    } // end of MyDestinationDataProvider
}
