package com.hand.util;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 * 通用数据库连接工厂
 */
public class ConnectionFaction {
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFaction factory = new ConnectionFaction();
	Connection conn = null;
	static {
		// 创建properties文件实例
		Properties prop = new Properties();
		try {
			// 读取加载文件数据
			InputStream in = ConnectionFaction.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");
			// 将加载文件数据载入properties文件实例。
			prop.load(in);
		} catch (Exception e) {
			System.out.println("-----配置文件读取错误------");
		}
		// 从配置文件中获取内容
		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}
	//生成构造函数
	private ConnectionFaction(){
		
	}
	//单例化
	public static ConnectionFaction getInstance(){
		return factory;
	}
	//建立连接的方式，返回连接conn
	public Connection makecConnection(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl,user,password);
		} catch (Exception e) {
		}
		return conn;
	}

}
