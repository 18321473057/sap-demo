package com.line.demo.sapdemo;

import com.line.demo.sapdemo.client.JcoClient;
import com.line.demo.sapdemo.dto.SapTableRsutDto;
import com.line.demo.sapdemo.po.ZhrZzjgtbDdEtOPo;
import com.line.demo.sapdemo.po.ZhrZzjgtbDdEtPsPo;
import com.line.demo.sapdemo.po.ZhrZzjgtbDdEtSPo;
import com.sap.conn.jco.JCoTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: yangcs
 * @Date: 2020/8/31 9:06
 * @Description: 组织架构同步接口-增量
 */
@SpringBootTest
class SapzhrZzjgzltbDdTests {

    @Autowired
    private JcoClient jcoClient;

    /**
     * 组织表 查询
     */
    @Test
    void ZHR_RYXXTB_ET_O() {
        SapTableRsutDto tableDto;
        try {
            //获取表单
            tableDto = jcoClient.getJocTable("ZHR_ZZJGZLTB_DD", "ET_O");

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
        List<ZhrZzjgtbDdEtOPo> polist = new ArrayList<>();
        ZhrZzjgtbDdEtOPo insertPo;
        if (jCoTable.getNumRows() > 0) {
            for (int i = 0; i < jCoTable.getNumRows(); i++, jCoTable.nextRow()) {
                //组装对象,并加入集合中
                insertPo = new ZhrZzjgtbDdEtOPo();
                insertPo.setObjid(jCoTable.getString("OBJID"));
                insertPo.setShortStr(jCoTable.getString("SHORT"));
                insertPo.setStext(jCoTable.getString("STEXT"));
                insertPo.setSobid(jCoTable.getString("SOBID"));
                insertPo.setPer01(jCoTable.getString("PER01"));
                insertPo.setzZzlb(jCoTable.getString("Z_ZZLB"));
                insertPo.setzZzcj(jCoTable.getString("Z_ZZCJ"));
                insertPo.setzZzxz(jCoTable.getString("Z_ZZXZ"));
                insertPo.setzZzxs(jCoTable.getString("Z_ZZXS"));
                insertPo.setzJtxs(jCoTable.getString("Z_JTXS"));
//                 JCO_ERROR_FIELD_NOT_FOUND: Field Z_JHBZ is not a member of ZHR_ZZB_OA
//                insertPo.setzJhbz(jCoTable.getString("Z_JHBZ"));
//                insertPo.setzRc(jCoTable.getString("Z_RC"));
//                insertPo.setzBz(jCoTable.getString("Z_BZ"));
                insertPo.setOpera(jCoTable.getString("OPERA"));
                polist.add(insertPo);
            }
        }
        System.out.println("共计行数:" + polist.size());
        polist.forEach(System.out::println);
    }


    /**
     * 岗位表 查询
     */
    @Test
    void ZHR_RYXXTB_ET_S() {

        SapTableRsutDto tableDto;
        try {
            //获取表单
            tableDto = jcoClient.getJocTable("ZHR_ZZJGZLTB_DD", "ET_S");

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
        List<ZhrZzjgtbDdEtSPo> polist = new ArrayList<>();
        ZhrZzjgtbDdEtSPo insertPo;
        if (jCoTable.getNumRows() > 0) {
            for (int i = 0; i < jCoTable.getNumRows(); i++, jCoTable.nextRow()) {
                //组装对象,并加入集合中
                insertPo = new ZhrZzjgtbDdEtSPo();
                insertPo.setObjid(jCoTable.getString("OBJID"));
                insertPo.setShortStr(jCoTable.getString("SHORT"));
                insertPo.setStext(jCoTable.getString("STEXT"));
                insertPo.setSob01(jCoTable.getString("SOB01"));
                insertPo.setSob02(jCoTable.getString("SOB02"));
//                insertPo.setZzwxlmc(jCoTable.getString("ZZWXLMC"));
//                insertPo.setZzqt(jCoTable.getString("ZZQT"));
//                insertPo.setZzzt(jCoTable.getString("ZZZT"));
//                insertPo.setZzxlbmc(jCoTable.getString("ZZXLBMC"));
//                insertPo.setZzdmc(jCoTable.getString("ZZDMC"));
//                insertPo.setZzzdmc(jCoTable.getString("ZZZDMC"));
//                insertPo.setZzxmc(jCoTable.getString("ZZXMC"));
//                insertPo.setZzjmc(jCoTable.getString("ZZJMC"));
//                insertPo.setzJhbz(jCoTable.getString("Z_JHBZ"));
//                insertPo.setzRc(jCoTable.getString("Z_RC"));
//                insertPo.setzBz(jCoTable.getString("Z_BZ"));
                insertPo.setOpera(jCoTable.getString("OPERA"));
                polist.add(insertPo);
            }
        }
        System.out.println("共计行数:" + polist.size());
        polist.forEach(System.out::println);
    }


    /**
     * 人岗关系表 查询
     */
    @Test
    void ZHR_RYXXTB_ET_PS() {
        SapTableRsutDto tableDto;
        try {
            //获取表单
            tableDto = jcoClient.getJocTable("ZHR_ZZJGZLTB_DD", "ET_PS");

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
        List<ZhrZzjgtbDdEtPsPo> polist = new ArrayList<>();
        ZhrZzjgtbDdEtPsPo insertPo;
        if (jCoTable.getNumRows() > 0) {
            for (int i = 0; i < jCoTable.getNumRows(); i++, jCoTable.nextRow()) {
                //组装对象,并加入集合中
                insertPo = new ZhrZzjgtbDdEtPsPo();
                insertPo.setZhrPernr(jCoTable.getString("ZHR_PERNR"));
                insertPo.setSobid(jCoTable.getString("SOBID"));
                insertPo.setZmain(jCoTable.getString("ZMAIN"));
                insertPo.setOpera(jCoTable.getString("OPERA"));
                polist.add(insertPo);
            }
        }
        System.out.println("共计行数:" + polist.size());
        polist.forEach(System.out::println);
    }

}
