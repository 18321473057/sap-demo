package com.line.demo.sapdemo.po;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 14:47
 * @Description: 组织架构同步接口-岗位表
 */
public class ZhrZzjgtbDdEtPsPo {

    //人员编码
    private String zhrPernr;
    //岗位编码
    private String sobid;
    //主岗标识
    private String zmain;
    //有效标识
    private String opera;

    public String getZhrPernr() {
        return zhrPernr;
    }

    public void setZhrPernr(String zhrPernr) {
        this.zhrPernr = zhrPernr;
    }

    public String getSobid() {
        return sobid;
    }

    public void setSobid(String sobid) {
        this.sobid = sobid;
    }

    public String getZmain() {
        return zmain;
    }

    public void setZmain(String zmain) {
        this.zmain = zmain;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    @Override
    public String toString() {
        return "ZhrZzjgzltbDdEtPsPo{" +
                "zhrPernr='" + zhrPernr + '\'' +
                ", sobid='" + sobid + '\'' +
                ", zmain='" + zmain + '\'' +
                ", opera='" + opera + '\'' +
                '}';
    }
}