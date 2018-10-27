package com.yzc.mysys.handler;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.dao.EmployeeDAO;
import com.yzc.mysys.model.Employee;


public class UpdateEmpServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EmployeeDAO empDao = new EmployeeDAO();
		//获取表单数据封装成对象
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		int deptNo = Integer.parseInt(request.getParameter("dept"));
		try{
			DeptDAO deptDao = new DeptDAO();
			Employee emp = new Employee(id,name,salary,age,deptDao.findById(deptNo));
			empDao.modify(emp);
			response.sendRedirect("empList");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
