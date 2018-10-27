package com.yzc.mysys.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.model.Dept;


public class NewEmpServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){
		
		DeptDAO dao = new DeptDAO();
		List<Dept> depts = null;
		try {
			depts = dao.findAll();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//绑定数据到request中
		request.setAttribute("depts",depts);
		try {
			//转发
			request.getRequestDispatcher("newEmp.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
}
