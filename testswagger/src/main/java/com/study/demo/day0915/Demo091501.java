package com.study.demo.day0915;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author wangding
 * @date 2019年9月15日 下午4:20:28
 * @Description：数据库的基本操作
 */
public class Demo091501 {
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;

	// 初始化connection
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("开始初始化connection");
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/xybk?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC",
					"root", "root");
			System.out.println("数据库驱动加载完成");
		} catch (ClassNotFoundException e) {
			System.out.println("你妹的");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public static void getData() {
		try {
			resultSet = getConn().createStatement().executeQuery("SELECT * from sys_tds_user");
//			PreparedStatement pre = getConn().prepareStatement("");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getData();
	}
}
