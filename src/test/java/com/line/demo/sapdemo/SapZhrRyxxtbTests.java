package com.line.demo.sapdemo;

import com.line.demo.sapdemo.client.JcoClient;
import com.line.demo.sapdemo.dto.SapTableRsutDto;
import com.line.demo.sapdemo.po.ZhrRyxxtbEtPPo;
import com.line.demo.sapdemo.po.ZhrRyxxtbEtPSPo;
import com.sap.conn.jco.JCoTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangcs
 * @Date: 2020/8/31 9:06
 * @Description: 人员信息同步接口-全量
 */
@SpringBootTest
class SapZhrRyxxtbTests {
    @Autowired
    private JcoClient jcoClient;

    /**
     * 组织表 查询
     */
    @Test
    void ZHR_RYXXTB_ET_P() {
        SapTableRsutDto tableDto  ;
        try {
            //获取表单
            tableDto = jcoClient.getJocTable("ZHR_RYXXTB", "ET_P");

        } catch (Exception e) {
            //TODO 获取表单过程中发生异常,在此处理逻辑........
            e.printStackTrace();
            return;
        }

        if (tableDto == null || tableDto.getjCoTable() == null || !tableDto.isSuccess()) {
            //TODO  SAP未能正常同步, 返回错误信息
            return;
        }

        JCoTable jCoTable = tableDto.getjCoTable();

        //遍历表单
        List<ZhrRyxxtbEtPPo> polist = new ArrayList<>();
        ZhrRyxxtbEtPPo insertPo;
        if (jCoTable.getNumRows() > 0) {
            for (int i = 0; i < jCoTable.getNumRows(); i++, jCoTable.nextRow()) {
                //组装对象,并加入集合中
                insertPo = new ZhrRyxxtbEtPPo();
                insertPo.setZhrPernr(jCoTable.getString("ZHR_PERNR"));
                insertPo.setEname(jCoTable.getString("ENAME"));
                insertPo.setGesch(jCoTable.getString("GESCH"));
                insertPo.setNatio(jCoTable.getString("NATIO"));
                insertPo.setConum(jCoTable.getString("CONUM"));
                insertPo.setPhone(jCoTable.getString("PHONE"));
                insertPo.setDdPhone(jCoTable.getString("DDPHONE"));
                insertPo.setComma(jCoTable.getString("COMMA"));
                insertPo.setEmail(jCoTable.getString("EMAIL"));
                insertPo.setGbdat(jCoTable.getString("GBDAT"));
                insertPo.setIcnum(jCoTable.getString("ICNUM"));
                insertPo.setIcnum1(jCoTable.getString("ICNUM1"));
                insertPo.setzZssj1(jCoTable.getString("Z_ZSSJ1"));
                insertPo.setStat2(jCoTable.getString("STAT2"));
                insertPo.setWerks(jCoTable.getString("WERKS"));
                insertPo.setManger(jCoTable.getString("MANGER"));
                insertPo.setHirda(jCoTable.getString("HIRDA"));
                insertPo.setOpera(jCoTable.getString("OPERA"));
                polist.add(insertPo);
            }
        }
        System.out.println("共计行数:" + polist.size());
//        polist.forEach(System.out::println);
    }


    /**
     * 人岗关系表 查询
     */
    @Test
    void ZHR_RYXXTB_ET_PS() {
        SapTableRsutDto tableDto  ;
        try {
            //获取表单
            tableDto = jcoClient.getJocTable("ZHR_RYXXTB", "ET_PS");

        } catch (Exception e) {
            //TODO 获取表单过程中发生异常,在此处理逻辑........
            e.printStackTrace();
            return;
        }

        if (tableDto == null || tableDto.getjCoTable() == null || !tableDto.isSuccess()) {
            //TODO  SAP未能正常同步, 返回错误信息
            return;
        }

        JCoTable jCoTable = tableDto.getjCoTable();


        //遍历表单
        List<ZhrRyxxtbEtPSPo> polist = new ArrayList<>();
        ZhrRyxxtbEtPSPo insertPo;
        if (jCoTable.getNumRows() > 0) {
            for (int i = 0; i < jCoTable.getNumRows(); i++, jCoTable.nextRow()) {
                //组装对象,并加入集合中
                insertPo = new ZhrRyxxtbEtPSPo();
                insertPo.setZhrPernr(jCoTable.getString("ZHR_PERNR"));
                insertPo.setSobid(jCoTable.getString("SOBID"));
                insertPo.setZsszz(jCoTable.getString("ZSSZZ"));
                insertPo.setZmain(jCoTable.getString("ZMAIN"));
                insertPo.setOpera(jCoTable.getString("OPERA"));
                polist.add(insertPo);
            }
        }
        System.out.println("共计行数:" + polist.size());
        polist.forEach(System.out::println);
    }

}
