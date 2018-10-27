package com.yzc.mysys.handler;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.dao.EmployeeDAO;
import com.yzc.mysys.model.Employee;


public class SaveEmpServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		//获取表单数据封装成对象
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		int deptNo = Integer.parseInt(request.getParameter("dept"));
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAge(age);
		try{
			//
			DeptDAO deptDao = new DeptDAO();
			emp.setDept(deptDao.findById(deptNo));
			//实例化dao,调save方法
			EmployeeDAO dao = new EmployeeDAO();
			dao.save(emp);
			//重定向到list.do
			response.sendRedirect("empList");
		}catch(Exception e){
			e.printStackTrace();
		}	
		
	}
}
