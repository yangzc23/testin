package com.yzc.mysys.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.yzc.mysys.utils.DBUtil;

public class QueryTest {
	public static void main(String[] args) throws Exception {
		Connection conn = DBUtil.getConnection();//获取连接
		Statement stmt = conn.createStatement();
		//
		ResultSet rs = stmt.executeQuery("select * from t_emp");
		//
		while(rs.next()){
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3)+","+rs.getDouble(4)+","+rs.getInt(5));
		}
		rs.close();
		stmt.close();
		DBUtil.close(conn);//关闭连接
	}
}
