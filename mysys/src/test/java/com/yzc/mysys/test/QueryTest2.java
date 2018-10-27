package com.yzc.mysys.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.yzc.mysys.utils.DBUtil;

public class QueryTest2 {
	public static void main(String[] args) throws Exception {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from t_emp where salary>? and deptNo=?");
		//
		ps.setDouble(1, 8000.0);
		//
		ps.setInt(2, 10);
		//
		ResultSet rs = ps.executeQuery();
		//
		while(rs.next()){
			System.out.println(rs.getInt(1)+","+rs.getString(2)+rs.getInt(3)+","+rs.getDouble(4)+","+rs.getInt(5));
		}
		rs.close();
		ps.close();
		DBUtil.close(conn);;
	}
}
