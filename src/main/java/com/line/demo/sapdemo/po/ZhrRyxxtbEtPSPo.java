package com.line.demo.sapdemo.po;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 14:47
 * @Description: 人员信息同步接口 -> 组织表
 */
public class ZhrRyxxtbEtPSPo {


    // 人员编码
    private String zhrPernr;
    //  岗位编码
    private String sobid;
    //  所属组织编码
    private String zsszz;
    // 主岗标识
    private String zmain;
    // 有效标识
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

    public String getZsszz() {
        return zsszz;
    }

    public void setZsszz(String zsszz) {
        this.zsszz = zsszz;
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
        return "ZhrRyxxtbEtPSPo{" +
                "zhrPernr='" + zhrPernr + '\'' +
                ", sobid='" + sobid + '\'' +
                ", zsszz='" + zsszz + '\'' +
                ", zmain='" + zmain + '\'' +
                ", opera='" + opera + '\'' +
                '}';
    }
}
