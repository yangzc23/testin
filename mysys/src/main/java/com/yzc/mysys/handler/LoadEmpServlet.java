package com.yzc.mysys.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.dao.EmployeeDAO;
import com.yzc.mysys.model.Dept;
import com.yzc.mysys.model.Employee;


public class LoadEmpServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){		
		DeptDAO deptDao = new DeptDAO();
		List<Dept> depts = null;
		EmployeeDAO empDao = new EmployeeDAO();
		try {
			depts = deptDao.findAll();
			int id =Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			request.setAttribute("depts", depts);
			Employee emp = empDao.findById(id);
			//绑定数据到request中
			request.setAttribute("depts",depts);			
			//绑定
			request.setAttribute("emp",emp);
			System.out.println(emp);
			//转发
			request.getRequestDispatcher("editEmp.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
}
