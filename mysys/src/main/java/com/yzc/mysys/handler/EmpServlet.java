package com.yzc.mysys.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzc.mysys.dao.EmployeeDAO;
import com.yzc.mysys.model.Employee;


public class EmpServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){
		
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> emps = null;
		try {
			emps = dao.findAll();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//绑定数据到request中
		request.setAttribute("emps",emps);
		try {
			//转发
			request.getRequestDispatcher("listEmp.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
}
