<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>员工列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div id="content">
<h1>Welcome!</h1>
<table class="table" border="1" width="60%" height="300">
<tr class="table_header">
	<td>编号</td><td>姓名</td><td>薪水</td><td>年龄</td><td>部门</td><td>操作</td>
</tr>
<c:forEach var="e" items="${emps}" varStatus="x">
	<tr class="row${x.index%2+1}">
		<td>${e.id}</td>
		<td>${e.name}</td>
		<td>${e.salary}</td>
		<td>${e.age}</td>
		<td>${e.dept.dName}</td>	
		<td><a href="loadEmp?id=${e.id}">修改</a></td>								
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>