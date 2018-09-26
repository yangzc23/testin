package com.myerp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.myerp.model.Dept;
import com.myerp.model.Employee;
import com.myerp.model.MyPage;
import com.myerp.utils.DBUtil;

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
			pst = con.prepareStatement("insert into t_emp (name,salary,age,deptNo,email,hiredate,details) values (?,?,?,?,?,?,?)");
			pst.setString(1, emp.getName());
			pst.setDouble(2, emp.getSalary());
			pst.setInt(3, emp.getAge());
			pst.setInt(4,emp.getDept().getId());
			pst.setString(5, emp.getEmail());
			pst.setTimestamp(6, new Timestamp(emp.getHiredate().getTime()));
			pst.setString(7, emp.getDetails());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
		
	}
	
	/**
	 * 获取员工列表页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public MyPage<Employee> findAllByPage(int pageNum,int pageSize) throws Exception{
		List<Employee> emps = 
			new ArrayList<Employee>();
		MyPage<Employee> page = new MyPage<Employee>(pageNum,pageSize,rows());

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select t3.* from (select t1.*,t2.dname,t2.city,ROW_NUMBER() over (order by t1.ID desc) as rownum from t_emp t1,t_dept t2 where t1.deptno=t2.id) t3 where t3.rownum between ? and ?");
			pst.setInt(1, page.getStartIndex());
			pst.setInt(2, page.getStartIndex()+pageSize-1);
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
		page.setList(emps);
		return page;
	}
	
	/**
	 * 获取员工数
	 * @return
	 * @throws Exception
	 */
	public int rows() throws Exception{
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			pst = conn.prepareStatement("select count(id) head_cnt from t_emp");
			rs = pst.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
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
			pst = conn.prepareStatement("select t1.*,t2.dname,t2.city from t_emp t1,t_dept t2 where t1.deptno=t2.id and t1.id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next()){
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
				emp.setEmail(rs.getString("email"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setDetails(rs.getString("details"));
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
			pst = con.prepareStatement("update t_emp set name=?,salary=?,age=?,deptNo=?,email=?,hiredate=?,details=? where id=?");
			pst.setString(1, emp.getName());
			pst.setDouble(2, emp.getSalary());
			pst.setInt(3, emp.getAge());
			pst.setInt(4, emp.getDept().getId());			
			pst.setString(5, emp.getEmail());
			pst.setTimestamp(6, new Timestamp(emp.getHiredate().getTime()));
			pst.setString(7, emp.getDetails());
			pst.setInt(8, emp.getId());
			pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(con);
		}
	}

}
















