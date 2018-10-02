package cn.servlet.test;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");	
		Cookie c = new Cookie("account",request.getParameter("user"));
		c.setPath("/servletdemo");
		c.setMaxAge(300);//
		response.addCookie(c);
		try {
			response.getWriter().print("<h1>µÇÂ¼³É¹¦</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
