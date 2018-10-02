<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>银行柜面系统</title>
</head>
<body>
<%
String vf = String.valueOf(request.getAttribute("Verifying"));
if (vf.equals("true")) {
%>
	<form name="ctrl" action="/Banking/Control" method="post">
    	<input type="hidden" name="user" value="<%=request.getParameter("user") %>">
    	<input type="hidden" name="pass" value="<%=request.getParameter("pass") %>">
    	<input type="hidden" name="page" value="create">
		<div align="center">
			<div>
		    	<span style="width:80px; height:30px">帐户号：　</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="zhh" id="zhh" value=<%=request.getParameter("zhh") %> readOnly=true style="width:180px; height:30px; background-color:#E0E0E0;">
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">密　码：　</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="pass" id="pass" value="test" readOnly=true style="width:180px; height:30px; background-color:#E0E0E0;">
		    	</span>
		    </div><br/>
		    <input type="submit" value="完成" id="okay">
		</div>
	</form>
<%
} else {
	out.println("<script type=\"text/javascript\">");
	out.println("alert(\"非法进入，请重新登陆！\")");
	out.println("window.location.href=\"/Banking/index.html\";");
	out.println("</script>");
}
%>
</body>
</html>