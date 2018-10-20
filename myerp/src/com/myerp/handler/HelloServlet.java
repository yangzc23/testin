package com.myerp.handler;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response){
		//
		response.setContentType("text/html;charset=UTF-8");
		//输出一级标题给浏览器
		try {
			response.getWriter().println(
					"<h1>这是一个一级标题</h1>"+
			"<img src='img/girl02.jpg' width='300' height='300'/>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
