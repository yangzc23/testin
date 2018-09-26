package com.myerp.handler;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myerp.dao.DeptDAO;
import com.myerp.dao.EmployeeDAO;
import com.myerp.dao.UserDAO;
import com.myerp.model.Dept;
import com.myerp.model.Employee;
import com.myerp.model.MyPage;
import com.myerp.model.User;

public class ActionServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//1.获取URI
		String uri = request.getRequestURI();
		HttpSession session = request.getSession();	
		//https://blog.csdn.net/gubaohua/article/details/575488
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a",Locale.US);		
		Date hiredate = null;
		//2.截取URI中的动作
		uri = uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
		if(uri.equals("/list")){
			if(session.getAttribute("uname")==null){
				response.sendRedirect("login.jsp");
				return;
			}
			try{
				int pageNum = 1;
				if(request.getParameter("page")!=null){
					pageNum = Integer.parseInt(request.getParameter("page"));
				}		
				//创建dao对象
				EmployeeDAO dao = new EmployeeDAO();
				//
				int totalRows = dao.rows();
				//
				//调用findAll()方法获取数据
				MyPage<Employee> page = dao.findAllByPage(pageNum,6);
				//绑定数据到request中
				request.setAttribute("currentPage",page);
				//转发
				request.getRequestDispatcher("listEmp.jsp").forward(request,response);
			}catch(Exception e){
				e.printStackTrace();
				request.setAttribute("msg","系统繁忙");
				request.getRequestDispatcher("err.jsp").forward(request,response);
			}
		}else if(uri.equals("/add")){
			if(session.getAttribute("uname")==null){
				response.sendRedirect("login.jsp");
				return;
			}
			//获取表单数据封装成对象
			String name = request.getParameter("name");
			double salary = Double.parseDouble(request.getParameter("salary"));
			int age = Integer.parseInt(request.getParameter("age"));
			int deptNo = Integer.parseInt(request.getParameter("dept"));
			String email = request.getParameter("email");
			String details = request.getParameter("details");
			Employee emp = new Employee();
			emp.setName(name);
			emp.setSalary(salary);
			emp.setAge(age);
			emp.setEmail(email);
			emp.setDetails(details);
			try{
				//String str = request.getParameter("hiredate");
				hiredate = sdf.parse(request.getParameter("hiredate"));
				emp.setHiredate(hiredate);
				//
				DeptDAO deptDao = new DeptDAO();
				emp.setDept(deptDao.findById(deptNo));
				//实例化dao,调save方法
				EmployeeDAO dao = new EmployeeDAO();
				dao.save(emp);
				//重定向到list.do
				response.sendRedirect("list.do");
			}catch(Exception e){
				e.printStackTrace();
				//将异常抛给容器
				throw new ServletException(e);
			}
		}else if(uri.equals("/del")){
			if(session.getAttribute("uname")==null){
				response.sendRedirect("login.jsp");
				return;
			}
			//获取地址栏中的id
			int id = Integer.parseInt(request.getParameter("id"));
			try{
				//实例化dao,调用删除方法
				EmployeeDAO dao  = new EmployeeDAO();
				dao.delete(id);
				//重定向到/list.do查看新的查询结果
				response.sendRedirect("list.do");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(uri.equals("/load")){
			DeptDAO deptDao = new DeptDAO();
			List<Dept> depts = null;
			try {
				depts = deptDao.findAll();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if(request.getParameter("id")==null||request.getParameter("id").equals("")){
				try {
					request.setAttribute("depts", depts);
					request.getRequestDispatcher("addEmp.jsp").forward(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				int id =Integer.parseInt(request.getParameter("id"));
				try{
					request.setAttribute("depts", depts);
					EmployeeDAO dao = new EmployeeDAO();
					Employee emp = dao.findById(id);
					//绑定
					request.setAttribute("emp",emp);
					//转发
					request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}else if(uri.equals("/update")){
			if(session.getAttribute("uname")==null){
				response.sendRedirect("login.jsp");
				return;
			}
			//获取数据,组装对象
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			double salary = Double.parseDouble(request.getParameter("salary"));
			int age = Integer.parseInt(request.getParameter("age"));
			int deptNo = Integer.parseInt(request.getParameter("dept"));
			String email = request.getParameter("email");
			String details = request.getParameter("details");
			try{
				DeptDAO deptDao = new DeptDAO();
				hiredate = sdf.parse(request.getParameter("hiredate"));
				Employee emp = new Employee(id,name,salary,age,deptDao.findById(deptNo),email,hiredate,details);
				EmployeeDAO dao = new EmployeeDAO();
				dao.modify(emp);
				response.sendRedirect("list.do");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(uri.equals("/login")){
			//判断用户名和密码
			String uname = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			UserDAO udao = new UserDAO(); 
			try{
				//根据表单中填写的用户名
				//查询有没有对应的实体
				//User u=udao.findByUserName(uname);
				//System.out.println(uname);
				//u==null-->登录失败
				//u!=null但是密码不相等--->登录失败
				//if(u==null||!u.getPwd().equals(pwd)){
				if(udao.auth(uname,pwd)==false){
					//登录失败
					request.setAttribute("msg","用户名或密码不正确");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}else{
					//登录成功,记录用户信息到session中
					//重定向到 /list.do
					session.setAttribute("uname",uname);
					//session过期时间设置为5分钟
					session.setMaxInactiveInterval(300);
					response.sendRedirect("list.do");
				}
				//session.setAttribute("uname","test");
				//response.sendRedirect("list.do");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(uri.equals("/logout")){
			//设置session失效
			session.invalidate();
			//重定向到登录页面
			response.sendRedirect("login.jsp");
		}else if(uri.equals("/register")){
			response.sendRedirect("register.jsp");
		}else if(uri.equals("/saveUser")){
			UserDAO uDao = new UserDAO();
			//获取浏览器提交过来的用户名和密码
			String user = request.getParameter("user");
			String realName = request.getParameter("realName");
			String password = request.getParameter("pwd");
			User u = new User();
			u.setUsername(user);			
			u.setName(realName);
			u.setPwd(password);
			try {
				uDao.save(u);
				//response.setCharacterEncoding("utf-8");
				//response.getWriter().print("<h1>User Register Success!</h1>");
				request.setAttribute("msg",user);
				request.getRequestDispatcher("success.jsp").forward(request, response);
				//response.sendRedirect("success.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
