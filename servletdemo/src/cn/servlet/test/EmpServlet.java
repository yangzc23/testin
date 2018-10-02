package cn.servlet.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.test.model.Employee;
import cn.test.model.PM;
import cn.test.model.Programmer;

public class EmpServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){
		
		//获取浏览器发送过来cookie数据
		Cookie[] cookies = request.getCookies();
		if(cookies==null){
			try {
				response.getWriter().print("<h1>您未登录进来，无法查看！</h1>");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		}
		
		for(Cookie c:cookies){
			System.out.println(c.getName()+":"+c.getValue());
		}
		
		Employee wy = new Programmer();
		wy.setName("王勇");
		wy.setGender(true);
		wy.setId("1001");
		wy.setSalary(8000);
		
		Employee wzj = new PM();
		wzj.setName("吴智俊");
		wzj.setGender(true);
		wzj.setId("1002");
		wzj.setSalary(12000);
		
		Employee ywj = new PM();
		ywj.setName("燕文杰");
		ywj.setGender(true);
		ywj.setId("1003");
		ywj.setSalary(12000);		
		
		List<Employee> emps = new ArrayList<Employee>();
		
		emps.add(wy);
		emps.add(wzj);
		emps.add(ywj);
		
		StringBuilder html = new StringBuilder();
		
		html.append("<table border='1' width='60%' height='300'><tr><td>工号</td><td>姓名</td><td>工资</td></tr>");
		
		for(Employee e:emps){
			html.append("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");		
		}
		
		html.append("</table>");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");		
		try {
			response.getWriter().print(html);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
