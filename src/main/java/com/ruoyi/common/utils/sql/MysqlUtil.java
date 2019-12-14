/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MysqlUtil
 * Author:   YAY
 * Date:     2018-11-10 11:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ruoyi.common.utils.sql;

import org.apache.commons.lang.StringUtils;

import java.sql.*;

/**
 * 〈〉
 *
 * @author YAY
 * @create 2018-11-10
 * @since 1.0.0
 */
public class MysqlUtil {

    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/ry_chengyu?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
    static String username = "root";
    static String pwd = "123456";

    public static void main(String[] args) {
//        inBrand();
        //inCar();
        getChYByZiMu("Z");
    }

    private static void getChYByZiMu(String zimu) {
        if (StringUtils.isBlank(zimu)) return;
        ////连接sql
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, pwd);
            if (!con.isClosed()) {
                System.out.println("连接成功------!");
            }
            String sqlcmd="SELECT * FROM com_chengyu a WHERE binary a.a_pinyin like '%"+zimu+"%' AND ( a.level_id=1 OR a.level_id=2 OR a.level_id=4) ";
            Long beginTime = System.currentTimeMillis();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlcmd);
            String chengyu="";
            int i=1;
            while (resultSet.next()){
                //获取stuname这列数据
//                chengyu = resultSet.getString("chengyuquanzi")+"   ";
//                System.out.println(chengyu);

                chengyu += resultSet.getString("chengyuquanzi")+"   ";
                if(i%4==0){ chengyu +="\r\n"; }i++;

            }

            System.out.println(chengyu);


            Long endTime = System.currentTimeMillis();
            System.out.println("ps+batch用时："+(endTime-beginTime)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        //获取字母的数据
        // 除以四的 数据

    }




}