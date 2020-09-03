package com.line.demo.sapdemo.po;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 14:47
 * @Description: 组织架构同步接口-组织表
 */
public class ZhrZzjgtbDdEtOPo {
    //组织编码
    private String objid;
    //组织简称
    //short java 保留字;这里稍作修改
    private String shortStr;
    //组织全称
    private String stext;
    //上级组织编码
    private String sobid;
    //组织管理负责人
    private String per01;
    //组织类别
    private String zZzlb;
    //组织层级
    private String zZzcj;
    //组织性质
    private String zZzxz;
    //组织形式
    private String zZzxs;
    //具体形式
    private String zJtxs;
    //计划编制数
    private String zJhbz;
    //容差
    private String zRc;
    //备注
    private String zBz;
    //有效标识
    private String opera;


    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getShortStr() {
        return shortStr;
    }

    public void setShortStr(String shortStr) {
        this.shortStr = shortStr;
    }

    public String getStext() {
        return stext;
    }

    public void setStext(String stext) {
        this.stext = stext;
    }

    public String getSobid() {
        return sobid;
    }

    public void setSobid(String sobid) {
        this.sobid = sobid;
    }

    public String getPer01() {
        return per01;
    }

    public void setPer01(String per01) {
        this.per01 = per01;
    }

    public String getzZzlb() {
        return zZzlb;
    }

    public void setzZzlb(String zZzlb) {
        this.zZzlb = zZzlb;
    }

    public String getzZzcj() {
        return zZzcj;
    }

    public void setzZzcj(String zZzcj) {
        this.zZzcj = zZzcj;
    }

    public String getzZzxz() {
        return zZzxz;
    }

    public void setzZzxz(String zZzxz) {
        this.zZzxz = zZzxz;
    }

    public String getzZzxs() {
        return zZzxs;
    }

    public void setzZzxs(String zZzxs) {
        this.zZzxs = zZzxs;
    }

    public String getzJtxs() {
        return zJtxs;
    }

    public void setzJtxs(String zJtxs) {
        this.zJtxs = zJtxs;
    }

    public String getzJhbz() {
        return zJhbz;
    }

    public void setzJhbz(String zJhbz) {
        this.zJhbz = zJhbz;
    }

    public String getzRc() {
        return zRc;
    }

    public void setzRc(String zRc) {
        this.zRc = zRc;
    }

    public String getzBz() {
        return zBz;
    }

    public void setzBz(String zBz) {
        this.zBz = zBz;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    @Override
    public String toString() {
        return "ZhrZzjgzltbDdEtOPo{" +
                "objid='" + objid + '\'' +
                ", shortStr='" + shortStr + '\'' +
                ", stext='" + stext + '\'' +
                ", sobid='" + sobid + '\'' +
                ", per01='" + per01 + '\'' +
                ", zZzlb='" + zZzlb + '\'' +
                ", zZzcj='" + zZzcj + '\'' +
                ", zZzxz='" + zZzxz + '\'' +
                ", zZzxs='" + zZzxs + '\'' +
                ", zJtxs='" + zJtxs + '\'' +
                ", zJhbz='" + zJhbz + '\'' +
                ", zRc='" + zRc + '\'' +
                ", zBz='" + zBz + '\'' +
                ", opera='" + opera + '\'' +
                '}';
    }
}
