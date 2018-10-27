package com.yzc.mysys.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.yzc.mysys.utils.DBUtil;

public class InsertTest {
	public static void main(String[] args) throws Exception {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO T_EMP(NAME,AGE,SALARY) VALUES (?,?,?)");
		ps.setString(1,"赵薇");
		ps.setInt(2,23);
		ps.setDouble(3,8000.0);
		ps.executeUpdate();
	}

}
