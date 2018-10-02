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
		
		//��ȡ��������͹���cookie����
		Cookie[] cookies = request.getCookies();
		if(cookies==null){
			try {
				response.getWriter().print("<h1>��δ��¼�������޷��鿴��</h1>");
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
		wy.setName("����");
		wy.setGender(true);
		wy.setId("1001");
		wy.setSalary(8000);
		
		Employee wzj = new PM();
		wzj.setName("���ǿ�");
		wzj.setGender(true);
		wzj.setId("1002");
		wzj.setSalary(12000);
		
		Employee ywj = new PM();
		ywj.setName("���Ľ�");
		ywj.setGender(true);
		ywj.setId("1003");
		ywj.setSalary(12000);		
		
		List<Employee> emps = new ArrayList<Employee>();
		
		emps.add(wy);
		emps.add(wzj);
		emps.add(ywj);
		
		StringBuilder html = new StringBuilder();
		
		html.append("<table border='1' width='60%' height='300'><tr><td>����</td><td>����</td><td>����</td></tr>");
		
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
