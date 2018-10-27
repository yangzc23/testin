package com.yzc.mysys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yzc.mysys.model.Dept;
import com.yzc.mysys.model.Employee;
import com.yzc.mysys.utils.DBUtil;

/**
 * 员工信息的数据操作类
 * 用于实现员工信息的增删改查功能
 */
public class EmployeeDAO {
	/**增加员工信息*/
	public void save(Employee emp)throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("insert into t_emp (name,salary,age,deptNo) values (?,?,?,?)");
			pst.setString(1, emp.getName());
			pst.setDouble(2, emp.getSalary());
			pst.setInt(3, emp.getAge());
			pst.setInt(4,emp.getDept().getId());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
		
	}
	/**查询全部员工信息*/
	public List<Employee> findAll() throws Exception{
		List<Employee> emps = 
			new ArrayList<Employee>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select t1.*,t2.dname,t2.city from t_emp t1 left join t_dept t2 on t1.deptno=t2.id");
			rs = pst.executeQuery();
			while(rs.next()){
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
				Dept dept = new Dept(rs.getInt("deptNo"),rs.getString("dname"),rs.getString("city"));
				emp.setDept(dept);
				emps.add(emp);
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn);
		}
		return emps;
	}
    
	/**删除员工信息*/
	public void delete(int id)throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("delete from t_emp where id=?");
			pst.setInt(1, id);
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
	}
	
	/**按照id查询一个员工信息*/
	public Employee findById(int id) throws Exception{
		Employee emp = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select t1.*,t2.dname,t2.city from t_emp t1 left join t_dept t2 on t1.deptno=t2.id where t1.id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next()){
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
				Dept dept = new Dept(rs.getInt("deptNo"),rs.getString("dname"),rs.getString("city"));
				emp.setDept(dept);				
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn);
		}
		return emp;
	}
	
	/**保存修改信息*/
	public void modify(Employee emp)
		throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
			con = DBUtil.getConnection();
			pst = con.prepareStatement("update t_emp set name=?,salary=?,age=?,deptNo=? where id=?");
			pst.setString(1, emp.getName());
			pst.setDouble(2, emp.getSalary());
			pst.setInt(3, emp.getAge());
			pst.setInt(4, emp.getDept().getId());			
			pst.setInt(5, emp.getId());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
	}

}
















