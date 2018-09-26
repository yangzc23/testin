package com.myerp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

import com.myerp.model.User;
import com.myerp.utils.DBUtil;

/**
 * 针对用户表t_user的数据访问类
 * @author yangzc
 *
 */
public class UserDAO {
	/**
	 * 按照username查询一个实体信息
	 * 注册时用于检测用户名是否重复
	 * 登录时用于检测用户名密码是否正确
	 * @param userName
	 * @return
	 * @throws Exception
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
				user.setSalt(rs.getString("salt"));
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn);
		}
		return user;
	}
	
	/**
	 * 增加用户信息(注册时用)
	 * @param u
	 * @throws Exception
	 */
	public void save(User u)throws Exception{
		//设置盐巴
		String salt = new SecureRandomNumberGenerator().nextBytes().toString();
		//设置撒多少次盐巴
		int times = 2;
		//生成密文
		String encodedPassword = new SimpleHash("md5",u.getPwd(),salt,times).toString();
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("insert into t_user(username,pwd,realname,gender,salt) values (?,?,?,?,?)");
			pst.setString(1,u.getUsername());
			pst.setString(2,encodedPassword);
			pst.setString(3,u.getName());
			pst.setString(4,u.getGender());
			pst.setString(5,salt);
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}		
	}
	
	/**
	 * 登录认证
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public boolean auth(String userName,String password) throws Exception{
		Connection conn = null;
		User user = findByUserName(userName);
		if(user==null){
			return false;
		}
		//得到密文
		String encodePassword = new SimpleHash("md5",password,user.getSalt(),2).toString();
		try {
			conn = DBUtil.getConnection();
			Statement state = conn.createStatement();
			//
			String sql = "SELECT * " +
						 "FROM t_user "+
						 "WHERE username='"+userName+"' " +
						 "AND pwd='"+encodePassword+"'";
			//打印被执行的SQL语句
			System.out.println(sql);
			
			ResultSet rs = state.executeQuery(sql);
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
