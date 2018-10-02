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
	function check() {
		if (document.ctrl.zhh.value==""){ 
			alert("请填写帐户号！");  
			return false;  
			}
		if (document.ctrl.je.value==""){ 
			alert("请填写存入金额！");  
			return false;  
			}
		var msg = "操作成功！";
		alert(msg);
	}
	function toMain() {
		document.getElementById("page").value = "return";
		document.ctrl.submit();
	}
	</script>
	<form name="ctrl" action="/Banking/Control" method="post">
    	<input type="hidden" name="user" value="<%=request.getParameter("user") %>">
    	<input type="hidden" name="pass" value="<%=request.getParameter("pass") %>">
    	<input type="hidden" name="page" id="page">
    	<div align="right">
    		<input type="button" value="返回" id="return" onClick="toMain()">
    		<hr size=1 color=#5B5B5B align=center noshade>
    	</div><p>
		<div align="center">
			<div>
		    	<span style="width:80px; height:30px">帐户号：　</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="zhh" id="zhh" style="width:180px; height:30px" maxlength=15>
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">存入金额：</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="je" id="je" style="width:180px; height:30px" maxlength=30 onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
		    	</span>
		    </div><br/>
		    <span><input type="button" value="确认" id="enter" onClick="check()"></span>
		    <span><input type="reset" value="取消" id="clear"></span>
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