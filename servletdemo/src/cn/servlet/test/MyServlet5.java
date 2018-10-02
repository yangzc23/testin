package cn.servlet.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet5 extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(new Date());
		//Cookie���ɼ�ֵ����ɵģ����磺"account":"admin"
		Cookie[] cookies = request.getCookies();
		if(cookies==null){
			response.getWriter().print("��ӭ���ʱ���վ��");
		}else{
			for(Cookie c:cookies){
				if(c.getName().equals("visitTime")){
					response.getWriter().print("��ӭ�������ϴη��ʵ�ʱ���ǣ�"+c.getValue());
				}
			}
		}	
		Cookie cookie = new Cookie("visitTime",time);
		cookie.setMaxAge(300);
		//URL��ַ�����������·������/servletdemo���·������Ļ�
		cookie.setPath("/servletdemo");
		response.addCookie(cookie);

	}
}
