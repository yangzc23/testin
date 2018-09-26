<%@ page import="java.util.*" 
    pageEncoding="UTF-8"
    contentType="text/html;charset=UTF-8"%>
<%
String uname = (String)session.getAttribute("uname");
if(uname==null){
	//session中没有登录信息,必须回到登录页面
	response.sendRedirect("login.jsp");
	return;
}
%>
<html>
  <head>
  </head>  
  <body>
   欢迎你: <%=uname%>
   <br/>
   <a href="logout.do">登出</a>
  </body>
</html>
