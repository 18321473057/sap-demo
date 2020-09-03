package com.line.demo.sapdemo.po;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 14:47
 * @Description: 组织架构同步接口-岗位表
 */
public class ZhrZzjgtbDdEtSPo {

    //岗位编码
    private String objid;
    //short java 保留字;这里稍作修改
    //岗位简称
    private String shortStr;
    //岗位全称
    private String stext;
    //所属部门编码
    private String sob01;
    //管理部门编码
    private String sob02;
    //职务序列
    private String zzwxlmc;
    //职群
    private String zzqt;
    //职种
    private String zzzt;
    //职衔类别
    private String zzxlbmc;
    //职等
    private String zzdmc;
    //子职等
    private String zzzdmc;
    //职衔
    private String zzxmc;
    //职级
    private String zzjmc;
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

    public String getSob01() {
        return sob01;
    }

    public void setSob01(String sob01) {
        this.sob01 = sob01;
    }

    public String getSob02() {
        return sob02;
    }

    public void setSob02(String sob02) {
        this.sob02 = sob02;
    }

    public String getZzwxlmc() {
        return zzwxlmc;
    }

    public void setZzwxlmc(String zzwxlmc) {
        this.zzwxlmc = zzwxlmc;
    }

    public String getZzqt() {
        return zzqt;
    }

    public void setZzqt(String zzqt) {
        this.zzqt = zzqt;
    }

    public String getZzzt() {
        return zzzt;
    }

    public void setZzzt(String zzzt) {
        this.zzzt = zzzt;
    }

    public String getZzxlbmc() {
        return zzxlbmc;
    }

    public void setZzxlbmc(String zzxlbmc) {
        this.zzxlbmc = zzxlbmc;
    }

    public String getZzdmc() {
        return zzdmc;
    }

    public void setZzdmc(String zzdmc) {
        this.zzdmc = zzdmc;
    }

    public String getZzzdmc() {
        return zzzdmc;
    }

    public void setZzzdmc(String zzzdmc) {
        this.zzzdmc = zzzdmc;
    }

    public String getZzxmc() {
        return zzxmc;
    }

    public void setZzxmc(String zzxmc) {
        this.zzxmc = zzxmc;
    }

    public String getZzjmc() {
        return zzjmc;
    }

    public void setZzjmc(String zzjmc) {
        this.zzjmc = zzjmc;
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
        return "ZhrZzjgzltbDdEtSPo{" +
                "objid='" + objid + '\'' +
                ", shortStr='" + shortStr + '\'' +
                ", stext='" + stext + '\'' +
                ", sob01='" + sob01 + '\'' +
                ", sob02='" + sob02 + '\'' +
                ", zzwxlmc='" + zzwxlmc + '\'' +
                ", zzqt='" + zzqt + '\'' +
                ", zzzt='" + zzzt + '\'' +
                ", zzxlbmc='" + zzxlbmc + '\'' +
                ", zzdmc='" + zzdmc + '\'' +
                ", zzzdmc='" + zzzdmc + '\'' +
                ", zzxmc='" + zzxmc + '\'' +
                ", zzjmc='" + zzjmc + '\'' +
                ", zJhbz='" + zJhbz + '\'' +
                ", zRc='" + zRc + '\'' +
                ", zBz='" + zBz + '\'' +
                ", opera='" + opera + '\'' +
                '}';
    }
}
