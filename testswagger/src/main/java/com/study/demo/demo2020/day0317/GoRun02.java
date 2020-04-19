package com.study.demo.demo2020.day0317;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * 
 * @author wangding
 * @date 2020年3月17日 下午9:39:47
 * @Description：大数据迁数工具
 */
public class GoRun02 {
	static Connection conn = null;
	 
    public static void initConn() throws ClassNotFoundException, SQLException {
 
        String sql;
        String url = "jdbc:mysql://localhost:3306/mqtt?"
                + "user=root&password=root&useUnicode=true&characterEncoding=UTF8&useSSL=false&serverTimezone=UTC";
 
        try {
            // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
            // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
            Class.forName("com.mysql.cj.jdbc.Driver");// 动态加载mysql驱动
 
            System.out.println("成功加载MySQL驱动程序");
            // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void insert() throws IOException {
        // 开时时间
        Long begin = System.currentTimeMillis();
        // sql前缀
        String prefix = "INSERT INTO ess_court (idcard, channel_code) VALUES ";
 
        try {
            // 保存sql后缀
            StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            conn.setAutoCommit(false);
//            PreparedStatement pst = conn.prepareStatement("");
             Statement st = conn.createStatement();
            // 比起st，pst会更好些
          
            // 外层循环，总提交事务次数
//            for (int i = 1; i <= 1; i++) {
//                // 第次提交步长
//                for (int j = 1; j <= 1000000; j++) {
//                    // 构建sql后缀
//                    suffix.append("(" + j * i + ", SYSDATE(), " + i * j
//                            * Math.random() + ",'" + randomStr(6) + "'),");
//                }
            File file = new File("D:\\1.txt");
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));    
    		BufferedReader reader = new BufferedReader(new InputStreamReader(fis,"utf-8"),1024*1024*5);// 用5M的缓冲读取文本文件  
    		String line = "";
    		while((line = reader.readLine()) != null){
    			String[] x = line.split(",");
    			 suffix.append("("+x[0]+","+x[1]+"),");
    			 
    		}
                // 构建完整sql
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行sql
                System.out.println(sql);
                // 提交事务
                System.out.println("提交事务");
                st.addBatch(sql);
                // 执行操作
                st.executeBatch();
                conn.commit();
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            // 头等连接
            st.close();
            conn.setAutoCommit(true);
            conn.close();
            fis.close();
            reader.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        Long end = System.currentTimeMillis();
        // 耗时
        System.out.println("cast : " + (end - begin)/1000 + " s");
    }
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
	 initConn();
	insert();
}

}
