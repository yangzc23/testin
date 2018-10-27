package com.yzc.mysys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.yzc.mysys.model.User;
import com.yzc.mysys.utils.DBUtil;

/**
 * 针对用户表t_user的数据访问类
 */
public class UserDAO {
	/**按照username查询一个实体信息
	 * 注册时用于检测用户名是否重复
	 * 登录时用于检测用户名密码是否正确
	 */
	public User findByUserName(String userName)throws Exception{
		User user = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select * from t_user where username=?");
			pst.setString(1, userName);
			rs = pst.executeQuery();
			while(rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPwd(rs.getString("pwd"));
				user.setName(rs.getString("realname"));
				user.setGender(rs.getString("gender"));			
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn);
		}
		return user;
	}
	
	/**增加用户信息(注册时用)*/
	public void save(User u)throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("insert into t_user(username,pwd,realname,gender) values (?,?,?,?)");
			pst.setString(1,u.getUsername());
			pst.setString(2,u.getPwd());
			pst.setString(3,u.getName());
			pst.setString(4,u.getGender());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}		
	}
	
	public boolean auth(String userName,String password) throws Exception{
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			Statement state = conn.createStatement();
			//
			String sql = "SELECT * " +
						 "FROM t_user "+
						 "WHERE username='"+userName+"' " +
						 "AND pwd='"+password+"'";
			/*
			 * 密码输入:
			 * ' OR '1'='1
			 * sql注入攻击
			 * 
			 */
			System.out.println(sql);
			
			ResultSet rs 
				= state.executeQuery(sql);
			//
			if(rs.next()){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(conn != null){
				DBUtil.close(conn);
			}
		}
		return false;
	}
}
