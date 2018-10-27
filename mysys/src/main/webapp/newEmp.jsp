<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>添加员工</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
</head>
<body>
<div id="content">
<h1>录入员工信息</h1>
<form action="saveEmp" method="post">
<table border="1" width="40%" height="180" class="form_table">
<tr>
	<td valign="middle" align="right">姓名:</td>
	<td valign="middle" align="left">
		<input type="text" class="inputgri" name="name" id="name" />
	</td>
</tr>
<tr>
	<td valign="middle" align="right">薪水:</td>
	<td valign="middle" align="left">
		<input type="text" class="inputgri" name="salary" id="salary"/>
	</td>
</tr>
<tr>
	<td valign="middle" align="right">年龄:</td>
	<td valign="middle" align="left">
		<input type="text" class="inputgri" name="age" id="age"/>
	</td>
</tr>
<tr>
	<td valign="middle" align="right">部门:</td>
	<td valign="middle" align="left">
		<select id="dept" name="dept" class="inputgri">
			<option value="">请选择</option>
			<c:forEach items="${depts}" var="d">
				<option value="${d.id}">${d.dName}</option>
			</c:forEach>
		</select>
	</td>
</tr>																			
</table>
<p><input type="submit" class="button" value="保存" /></p>
</form>
</div>
</body>
</html>
