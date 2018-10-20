package com.myerp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 管理数据库连接的工具类
 * 可以获取数据库的连接对象
 * 以及关闭数据库连接
 */
public class DBUtil {
	/**获取数据库连接*/
	public static Connection getConnection() 
		throws Exception{
		Connection con = null;
		try{
			Class.forName(
				"com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
				"jdbc:sqlserver://192.168.0.130:1433;databaseName=MYERP0612",
				"sa","456789");
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		return con;
	}
	/**关闭数据库连接*/
	public static void close(Connection con) throws SQLException{
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
}




