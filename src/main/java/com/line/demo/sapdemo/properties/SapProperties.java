package com.line.demo.sapdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 9:06
 * @Description:  sap 连接信息配置
 */
@ConfigurationProperties(prefix = "sap.client")
@Component
public class SapProperties {
    private String jcoAshost;
    private String jcoSysnr;
    private String jcoClient;
    private String jcoUser;
    private String jcoPasswd;
    private String jcoLang;
    private String poolCapacity ;
    private String  peakLimit;

    public String getJcoAshost() {
        return jcoAshost;
    }

    public void setJcoAshost(String jcoAshost) {
        this.jcoAshost = jcoAshost;
    }

    public String getJcoSysnr() {
        return jcoSysnr;
    }

    public void setJcoSysnr(String jcoSysnr) {
        this.jcoSysnr = jcoSysnr;
    }

    public String getJcoClient() {
        return jcoClient;
    }

    public void setJcoClient(String jcoClient) {
        this.jcoClient = jcoClient;
    }

    public String getJcoUser() {
        return jcoUser;
    }

    public void setJcoUser(String jcoUser) {
        this.jcoUser = jcoUser;
    }

    public String getJcoPasswd() {
        return jcoPasswd;
    }

    public void setJcoPasswd(String jcoPasswd) {
        this.jcoPasswd = jcoPasswd;
    }

    public String getJcoLang() {
        return jcoLang;
    }

    public void setJcoLang(String jcoLang) {
        this.jcoLang = jcoLang;
    }

    public String getPoolCapacity() {
        return poolCapacity;
    }

    public void setPoolCapacity(String poolCapacity) {
        this.poolCapacity = poolCapacity;
    }

    public String getPeakLimit() {
        return peakLimit;
    }

    public void setPeakLimit(String peakLimit) {
        this.peakLimit = peakLimit;
    }
}


