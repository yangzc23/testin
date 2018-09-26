<%@page import="com.myerp.model.*" 
  pageEncoding="UTF-8"
  contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>UpdateEmp</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/mystyle.css" />
<link href="css/myexamples-offline.css" rel="stylesheet">
<link href="css/kendo.common.min.css" rel="stylesheet">
<link href="css/kendo.rtl.min.css" rel="stylesheet">
<link href="css/kendo.default.min.css" rel="stylesheet">
<link href="css/kendo.default.mobile.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/jszip.min.js"></script>
<script src="js/kendo.all.min.js"></script>
<script src="js/console.js"></script>
<script type="text/javascript" src="js/mycheck.js"></script>
<script>
$.ready(function(){
	  $("#updateemp").click(function(){
	  $("#updateform").submit();
	  });
	});
</script>	
</head>
<body>
<div id="example">
<div class="demo-section k-content">
<div id="top">
<table border="0" cellpadding="0" cellspacing="0" style="width:100%;height:5%;">
<tr>
<td></td>
<td style="color:white;text-align:right;padding-right:30px;font-size:20px;">
 用户：<span style="cursor:pointer"  id="usr_home"><%=uname%></span>&nbsp;&nbsp;<a class="logout" href="logout.do">[注销]</a>&nbsp;&nbsp;
</td>
</tr>
</table>
</div>
<div id="mainContent">
<h1 style="color:#ff6b18;">编辑员工</h1>					
<form id="updateform" action="update.do" method="post" onsubmit="return check();">
<table cellpadding="0" cellspacing="0" border="0" class="form_table" width="100%">
<tr>
	<td valign="middle" align="right" width="15%">编号:</td>
	<td valign="middle" align="left">
	${emp.id}<input type="hidden" name="id" value="${emp.id}"/>
	</td>
</tr>
<tr>
	<td valign="middle" align="right">姓名:</td>
	<td valign="middle" align="left">
	<input type="text" class="k-textbox" name="name" value="${emp.name}" style="width:60%" />
	</td>
</tr>
<tr>
	<td valign="middle" align="right">薪水:</td>
	<td valign="middle" align="left">
		<input type="text" class="k-textbox" name="salary" value="${emp.salary}" style="width:60%" />
	</td>
</tr>
<tr>
	<td valign="middle" align="right">年龄:</td>
	<td valign="middle" align="left">
		<input type="text" class="k-textbox" name="age" value="${emp.age}" style="width:60%" />
	</td>
</tr>
<tr>
	<td valign="middle" align="right">部门:</td>
	<td valign="middle" align="left">
		<select id="dept" name="dept" class="k-dropdown-wrap k-state-default" style="width:60%;height:30px;">
			<option value="">请选择</option>
			<c:forEach items="${depts}" var="d">
			<option value="${d.id }" <c:if test="${emp.dept.id==d.id}"><c:out value="selected"/></c:if>>${d.dName}</option>
			</c:forEach>
			</select>
	</td>
</tr>	
<tr>
	<td valign="middle" align="right">入职时间:</td>
	<td valign="middle" align="left">
		<input name="hiredate" id="datetimepicker" title="datetimepicker" style="width: 60%;"/>
	</td>
</tr>	
<tr hidden>
	<td valign="middle" align="right">入职时间:</td>
	<td valign="middle" align="left">
		<input id="myhiredate" value="${emp.hiredate}" style="width: 100%;"/>
	</td>
</tr>							
<tr>
	<td valign="middle" align="right">邮箱地址:</td>
	<td valign="middle" align="left">
		<input type="text" class="k-textbox" name="email" id="email" style="width:60%" value="${emp.email}"/>
	</td>
</tr>	
<tr>
	<td>学历及经历：</td>
	<td>
		<textarea name="details" id="editor" rows="10" cols="30" style="height:440px" aria-label="editor">${emp.details}</textarea>
	</td>
</tr>											
</table>
<div style="padding-left:16%;">
	<button class="k-button k-primary" id="updateemp">&nbsp;保存&nbsp;</button>
</div>
</form>
<script>
$(document).ready(function () {
    // create DateTimePicker from input HTML element
    $("#datetimepicker").kendoDateTimePicker({
        value: $("#myhiredate").val(),
        dateInput: true
    });
    
    // create Editor from textarea HTML element with default set of tools
    $("#editor").kendoEditor({ resizable: {
        content: true,
        toolbar: true
    }});    
});
</script>
</div>
<div id="footer_bg" style="margin-top:10px; vertical-align:bottom;color:white; height:5%;font-size:16px">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;myTech © 2011-2018
</div>
</div>
</div>
</body>
</html>
  