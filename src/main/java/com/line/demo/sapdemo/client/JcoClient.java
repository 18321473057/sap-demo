package com.line.demo.sapdemo.client;

import com.line.demo.sapdemo.client.CustomDestinationDataProvider.TnDestinationDataProvider;
import com.line.demo.sapdemo.dto.SapTableRsutDto;
import com.line.demo.sapdemo.properties.SapProperties;
import com.sap.conn.jco.*;
import com.sap.conn.jco.ext.DestinationDataProvider;
import com.sap.conn.jco.ext.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class JcoClient implements InitializingBean {

    @Autowired
    private SapProperties sapProperties;

    private static final Logger logger = LogManager.getLogger(JcoClient.class);
    public final static String ABAP_AS_POOLED = "ABAP_AS_WITH_POOL";

    //根据输入的字符串返回一个连接池的JcoDestination
    public JCoDestination getPoolDestination() throws Exception {
        return JCoDestinationManager.getDestination(ABAP_AS_POOLED);
    }


    /**
     * @param funcNo  接口编号
     * @param tableNo 表单编号
     * @Description 获取表单
     */
    public SapTableRsutDto getJocTable(String funcNo, String tableNo) throws Exception {
        //获取function
        JCoDestination destination = this.getPoolDestination();
        JCoFunction function = destination.getRepository().getFunction(funcNo);
        if (function == null) {
            throw new RuntimeException("BAPI_COMPANYCODE_GETLIST not found in SAP.");
        }
        function.execute(destination);
        //获取表单
        JCoTable table = function.getTableParameterList().getTable(tableNo);
        if (table == null) {
            throw new RuntimeException("JCoTable is not  found");
        }

        //组装表单返回对象
        JCoParameterList parameterList = function.getExportParameterList();
        SapTableRsutDto rsutDto = new SapTableRsutDto((String) parameterList.getValue("RTMSG"), (String) parameterList.getValue("RTYPE"), table);
        return rsutDto;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        TnDestinationDataProvider tnProvider = TnDestinationDataProvider.getInstance();
        try {
            Environment.registerDestinationDataProvider(tnProvider);
        } catch (IllegalStateException exception) {
            logger.error("tnProvider is already Registered..." + exception);
        }

        Properties properties = new Properties();
        properties.setProperty(DestinationDataProvider.JCO_ASHOST, sapProperties.getJcoAshost());
        properties.setProperty(DestinationDataProvider.JCO_SYSNR, sapProperties.getJcoSysnr());
        properties.setProperty(DestinationDataProvider.JCO_CLIENT, sapProperties.getJcoClient());
        properties.setProperty(DestinationDataProvider.JCO_USER, sapProperties.getJcoUser());
        properties.setProperty(DestinationDataProvider.JCO_PASSWD, sapProperties.getJcoPasswd());
        properties.setProperty(DestinationDataProvider.JCO_LANG, sapProperties.getJcoLang());
        properties.setProperty(DestinationDataProvider.JCO_POOL_CAPACITY, sapProperties.getPoolCapacity());
        properties.setProperty(DestinationDataProvider.JCO_PEAK_LIMIT, sapProperties.getPeakLimit());
        tnProvider.changeProperties(ABAP_AS_POOLED, properties);
    }
}
