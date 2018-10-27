<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>修改员工</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
</head>
<body>
<div id="content">
<h1>编辑员工信息</h1>					
<form action="updateEmp" method="post">
<table border="1" width="40%" height="180" class="form_table">
<tr>
	<td valign="middle" align="right">编号:</td>
	<td valign="middle" align="left">${emp.id}<input type="hidden" name="id" value="${emp.id}"/></td>
</tr>
<tr>
	<td valign="middle" align="right">姓名:</td>
	<td valign="middle" align="left"><input type="text" class="inputgri" name="name" value="${emp.name}"/></td>
</tr>
<tr>
	<td valign="middle" align="right">薪水:</td>
	<td valign="middle" align="left"><input type="text" class="inputgri" name="salary" value="${emp.salary}"/></td>
</tr>
<tr>
	<td valign="middle" align="right">年龄:</td>
	<td valign="middle" align="left">
		<input type="text" class="inputgri" name="age" value="${emp.age}"/>
	</td>
</tr>
<tr>
	<td valign="middle" align="right">部门:</td>
	<td valign="middle" align="left">
		<select id="dept" name="dept" class="inputgri">
			<option value="">请选择</option>
			<c:forEach items="${depts}" var="d">
			<option value="${d.id}" <c:if test="${emp.dept.id==d.id}"><c:out value="selected"/></c:if>>${d.dName}</option>
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
