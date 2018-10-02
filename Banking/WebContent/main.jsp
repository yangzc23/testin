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
	<script type="text/javascript">
	function control(URI) {
		document.getElementById("page").value = URI;
		document.ctrl.submit();
	}
	</script>
	<form name="ctrl" action="/Banking/Control" method="post">
    	<input type="hidden" name="user" value="<%=request.getParameter("user") %>">
    	<input type="hidden" name="pass" value="<%=request.getParameter("pass") %>">
    	<input type="hidden" name="page" id="page">
	</form>
	<div align="center">
	<input type="button" value="新建储蓄帐户" id="create" onClick="control('create')" style="width:100px; height:30px"><p/>
	<input type="button" value="注销储蓄帐户" id="cancel" onClick="control('cancel')" style="width:100px; height:30px"><p/>
	<input type="button" value="存款操作" id="set" onClick="control('set')" style="width:100px; height:30px"><p/>
	<input type="button" value="取款操作" id="get" onClick="control('get')" style="width:100px; height:30px"><p/>
	<input type="button" value="转账操作" id="turn" onClick="control('turn')" style="width:100px; height:30px"><p/>
	<input type="button" value="储蓄帐户修改" id="modifi" onClick="control('modifi')" style="width:100px; height:30px"><p/>
	<input type="button" value="登出" id="exit" onClick="control('exit')" style="width:100px; height:30px"><p/>
	</div>
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