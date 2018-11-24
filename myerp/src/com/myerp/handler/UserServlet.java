package com.myerp.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentServlet
 */
public class UserServlet extends HttpServlet {  
	public void service(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,IOException{
		HttpSession session = req.getSession();
		session.setAttribute("user", req.getParameter("user"));
		session.setAttribute("email", req.getParameter("email"));
		//
		session.setMaxInactiveInterval(300);
        //创建一个 Cookie保存用户名      
        //Cookie cookie1 = new Cookie("user",URLEncoder.encode(req.getParameter("user"),"utf-8"));
        //创建一个 Cookie保存邮箱
        //Cookie cookie2 = new Cookie("email",URLEncoder.encode(req.getParameter("email"),"utf-8"));
        // 为两个 Cookie设置过期日期为 24 小时后
        //cookie1.setMaxAge(60*60*24); 
        //cookie2.setMaxAge(60*60*24);    
        //
        //cookie1.setPath("/myerp/");
        //cookie2.setPath("/myerp/");       
        // 在响应头中添加两个 Cookie
        //resp.addCookie(cookie1);
        //resp.addCookie(cookie2);  
        //
        
        // 设置响应内容类型
        resp.setContentType("text/html;charset=UTF-8");
        //
        resp.getWriter().println("<h1>注册成功</h1>");
	}
}
