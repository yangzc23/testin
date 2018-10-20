package com.myerp.handler;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {  
	public void service(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,IOException{
		//设置页面内容的编码格式 
		resp.setContentType("text/html;charset=UTF-8");
		//获取与该域相关的 Cookie 的数组
        Cookie[] cookies = req.getCookies();
        String userInfo = "";
        //
        for(Cookie c:cookies){
        	userInfo+=URLDecoder.decode(c.getValue(),"utf-8");
        	userInfo+=",";
        }
		String html = "<div style='text-align:right;'>"+
        "<span style='color:blue;'>"+userInfo+"</span></div>"+
		"<h1>这是一个一级标题</h1>"+
		"<table border='1' width='70%'>"
		+ "<tr><th>学号</th><th>姓名</th><th>专业</th><th>性别</th><th>年龄</th></tr>"
		+ "<tr><td>1001</td><td>赵丽颖</td><td>表演</td><td>女</td><td>29</td></tr>"
		+ "<tr><td>1002</td><td>冯绍峰</td><td>表演</td><td>男</td><td>33</td></tr>"
		+ "</table>";
		//返回html给浏览器
		resp.getWriter().println(html);
	}
}
