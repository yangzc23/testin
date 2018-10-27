package com.yzc.mysys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yzc.mysys.model.Dept;
import com.yzc.mysys.utils.DBUtil;

/**
 * 部门信息的数据操作类
 * 用于部门信息的增删改查功能
 */
public class DeptDAO {
	/**增加部门信息*/
	public void save(Dept dept)throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("insert into t_dept (dname,city) values (?,?)");
			pst.setString(1, dept.getdName());
			pst.setString(2, dept.getCity());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
		
	}
	/**查询全部部门信息*/
	public List<Dept> findAll() throws Exception{
		List<Dept> depts = 
			new ArrayList<Dept>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select * from t_dept");
			rs = pst.executeQuery();
			while(rs.next()){
				Dept dept = new Dept();
				dept.setId(rs.getInt("id"));
				dept.setdName(rs.getString("dname"));
				dept.setCity(rs.getString("city"));
				depts.add(dept);
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn);
		}
		return depts;
	}
    
	/**删除部门信息*/
	public void delete(int id)throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("delete from t_dept where id=?");
			pst.setInt(1, id);
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
	}
	
	/**按照id查询部门信息*/
	public Dept findById(int id) throws Exception{
		Dept dept = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select * from t_dept where id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next()){
				dept = new Dept();
				dept.setId(rs.getInt("id"));
				dept.setdName(rs.getString("dname"));
				dept.setCity(rs.getString("city"));		
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn);
		}
		return dept;
	}
	
	/**保存修改信息*/
	public void modify(Dept dept)
		throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("update t_dept set dname=?,city=? where id=?");
			pst.setString(1, dept.getdName());
			pst.setString(2, dept.getCity());		
			pst.setInt(3, dept.getId());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
	}

}
















