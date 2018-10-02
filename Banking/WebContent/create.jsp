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
	// <!--
	function check() {
		if (document.ctrl.zjh.value==""){ 
			alert("请填写证件号！");  
			return false;  
			}
		if (document.ctrl.zjzl.value==""){ 
			alert("请填写证件种类！");  
			return false;  
			}
		if (document.ctrl.xm.value==""){ 
			alert("请填写姓名！");  
			return false;  
			}
		if (document.ctrl.lxdz.value==""){ 
			alert("请填写联系地址！");  
			return false;  
			}
		if (document.ctrl.lxdh.value==""){ 
			alert("请填写联系电话！");  
			return false;  
			}
		document.ctrl.submit();
	}
	function toMain() {
		document.getElementById("page").value = "return";
		document.ctrl.submit();
	}
	// -->
	</script>
	<form name="ctrl" action="/Banking/Control" method="post">
    	<input type="hidden" name="user" value="<%=request.getParameter("user") %>">
    	<input type="hidden" name="pass" value="<%=request.getParameter("pass") %>">
    	<input type="hidden" name="page" id="page" value="creates">
    	<input type="hidden" name="zhh" id="zhh">
    	<div align="right">
    		<input type="button" value="返回" id="return" onClick="toMain()">
    		<hr size=1 color=#5B5B5B align=center noshade>
    	</div><p>
		<div align="center">
			<div>
		    	<span style="width:80px; height:30px">证件号：　</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="zjh" id="zjh" style="width:180px; height:30px" maxlength=15>
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">证件种类：</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="zjzl" id="zjzl" style="width:180px; height:30px" maxlength=20>
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">姓名：　　</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="xm" id="xm" style="width:180px; height:30px" maxlength=20>
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">性别：　　</span>
		    	<span style="width:80px; height:30px">
		    	<select name="xb" id="xb" style="width:180px; height:30px">
		    	<option value="1">男</option>  
		    	<option value="0">女</option>   
	            </select> 
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">联系地址：</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="lxdz" id="lxdz" style="width:180px; height:30px" maxlength=50>
		    	</span>
		    </div><br/>
			<div>
		    	<span style="width:80px; height:30px">联系电话：</span>
		    	<span style="width:80px; height:30px">
		    	<input type="text" name="lxdh" id="lxdh" style="width:180px; height:30px" maxlength=20 onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
		    	</span>
		    </div><br/>
		    <span><input type="button" value="创建" id="create" onClick="check()"></span>
		    <span><input type="reset" value="清除" id="clear"></span>
		</div>
	</form>
	
	<script type="text/javascript">
	var res = "";
	var chars = ['0','1','2','3','4','5','6','7','8','9'];
	for(var i = 0; i < 15 ; i ++) {
	    var id = Math.ceil(Math.random()*10-1);
	    res += chars[id];
	}
	document.getElementById("zhh").value = res;
	</script>
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