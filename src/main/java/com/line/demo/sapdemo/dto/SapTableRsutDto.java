package com.line.demo.sapdemo.dto;

import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoTable;

/**
 * @Author: yangcs
 * @Date: 2020/9/1 14:31
 * @Description: sap 表单返回对象
 */
public class SapTableRsutDto {

    //数据同步结果消息
    private String msg;
    //数据同步结果代码
    private String code;
    //表单对象
    private JCoTable jCoTable;
    //JCoFunction 对象
    private JCoFunction  jCoFunction;



    public Boolean isSuccess(){
        return "S".equals(code);
    }


    public JCoFunction getjCoFunction() {
        return jCoFunction;
    }

    public void setjCoFunction(JCoFunction jCoFunction) {
        this.jCoFunction = jCoFunction;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public JCoTable getjCoTable() {
        return jCoTable;
    }

    public void setjCoTable(JCoTable jCoTable) {
        this.jCoTable = jCoTable;
    }

    public SapTableRsutDto() {
    }

    public SapTableRsutDto(String msg, String code, JCoTable jCoTable) {
        this.msg = msg;
        this.code = code;
        this.jCoTable = jCoTable;
    }
}
