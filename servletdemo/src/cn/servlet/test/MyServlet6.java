package cn.servlet.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet6 extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(new Date());
		HttpSession session = request.getSession();
		if(session.getAttribute("visitTime")==null){
			response.getWriter().print("��ӭ���ʱ���վ��");
		}else{
			response.getWriter().print("��ӭ�������ϴη��ʵ�ʱ���ǣ�"+session.getAttribute("visitTime"));
		}
		session.setAttribute("visitTime", time);
		session.setMaxInactiveInterval(300);
	}
}
