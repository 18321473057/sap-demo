package com.line.demo.sapdemo.po;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 14:47
 * @Description: 人员信息同步接口 -> 组织表
 */
public class ZhrRyxxtbEtPPo {

    //人员工号
    private String   zhrPernr;
    //人员姓名
    private String   ename;
    //性别
    private String   gesch;
    //国籍
    private String   natio;
    //公司号码
    private String   conum;
    //个人手机
    private String   phone;
    //dingdinh个人手机
    private String   ddPhone;
    //公司邮箱
    private String   comma;
    //个人邮箱
    private String   email;
    //出生日期
    private String   gbdat;
    //身份证号码
    private String   icnum;
    //护照号码
    private String   icnum1;
    //直属上级
    private String   zZssj1;
    //雇佣状态
    private String   stat2;
    //人事范围
    private String   werks;
    //经理人标识
    private String   manger;
    //入职日期
    private String   hirda;
    //有效标识
    private String   opera;

    public String getZhrPernr() {
        return zhrPernr;
    }

    public void setZhrPernr(String zhrPernr) {
        this.zhrPernr = zhrPernr;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGesch() {
        return gesch;
    }

    public void setGesch(String gesch) {
        this.gesch = gesch;
    }

    public String getNatio() {
        return natio;
    }

    public void setNatio(String natio) {
        this.natio = natio;
    }

    public String getConum() {
        return conum;
    }

    public void setConum(String conum) {
        this.conum = conum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGbdat() {
        return gbdat;
    }

    public void setGbdat(String gbdat) {
        this.gbdat = gbdat;
    }

    public String getIcnum() {
        return icnum;
    }

    public void setIcnum(String icnum) {
        this.icnum = icnum;
    }

    public String getIcnum1() {
        return icnum1;
    }

    public void setIcnum1(String icnum1) {
        this.icnum1 = icnum1;
    }

    public String getzZssj1() {
        return zZssj1;
    }

    public void setzZssj1(String zZssj1) {
        this.zZssj1 = zZssj1;
    }

    public String getStat2() {
        return stat2;
    }

    public void setStat2(String stat2) {
        this.stat2 = stat2;
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks;
    }

    public String getManger() {
        return manger;
    }

    public void setManger(String manger) {
        this.manger = manger;
    }

    public String getHirda() {
        return hirda;
    }

    public void setHirda(String hirda) {
        this.hirda = hirda;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }


    @Override
    public String toString() {
        return "ZhrRyxxtbEtPPo{" +
                "zhrPernr='" + zhrPernr + '\'' +
                ", ename='" + ename + '\'' +
                ", gesch='" + gesch + '\'' +
                ", natio='" + natio + '\'' +
                ", conum='" + conum + '\'' +
                ", phone='" + phone + '\'' +
                ", ddPhone='" + ddPhone + '\'' +
                ", comma='" + comma + '\'' +
                ", email='" + email + '\'' +
                ", gbdat='" + gbdat + '\'' +
                ", icnum='" + icnum + '\'' +
                ", icnum1='" + icnum1 + '\'' +
                ", zZssj1='" + zZssj1 + '\'' +
                ", stat2='" + stat2 + '\'' +
                ", werks='" + werks + '\'' +
                ", manger='" + manger + '\'' +
                ", hirda='" + hirda + '\'' +
                ", opera='" + opera + '\'' +
                '}';
    }

    public String getDdPhone() {
        return ddPhone;
    }

    public void setDdPhone(String ddPhone) {
        this.ddPhone = ddPhone;
    }
}
