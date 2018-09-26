<%@ page import="java.util.*,com.myerp.model.*" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String uname = (String)session.getAttribute("uname");
if(uname==null){
	//session中没有登录信息,必须回到登录页面
	response.sendRedirect("login.jsp");
	return;
}
%><html>
<head>
<title>EmpList</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/mystyle.css" rel="stylesheet">
<link href="css/myexamples-offline.css" rel="stylesheet">
<link href="css/kendo.common.min.css" rel="stylesheet">
<link href="css/kendo.rtl.min.css" rel="stylesheet">
<link href="css/kendo.default.min.css" rel="stylesheet">
<link href="css/kendo.default.mobile.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/jszip.min.js"></script>
<script src="js/kendo.all.min.js"></script>
<script src="js/console.js"></script>
<style>
ul.pagination {
    display: inline-block;
    padding: 0;
    margin: 0;
}

ul.pagination li {display: inline;}

ul.pagination li a {
    color: black;
    float: left;
    padding: 8px 16px;
    text-decoration: none;
    transition: background-color .3s;
    border: 1px solid #ddd;
    margin: 0 4px;
}

ul.pagination li a.active {
    background-color: #4CAF50;
    color: white;
    border: 1px solid #4CAF50;
}
ul.pagination li a:hover:not(.active) {background-color: #ddd;}
</style>
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
<h1 style="color:#ff6b18;">员工列表</h1>
<div style="text-align:right;margin-bottom:10px;">
<button class="k-button k-primary" onclick="location='load.do'">增加员工</button>
</div>
<table class="table" border="0" cellspacing="0" cellpadding="0" width="100%">
<tr class="table_header">
<td>编号</td>
<td>姓名</td>							
<td>薪水</td>
<td>年龄</td>
<td>部门</td>							
<td>操作</td>
</tr>
<c:forEach var="e" items="${currentPage.list}" varStatus="x">
<tr class="row${x.index%2+1}">
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.salary}</td>
<td>${e.age}</td>
<td>${e.dept.dName}</td>							
<td>
<a href="del.do?id=${e.id}" onclick="return confirm('确认删除${e.name}吗?')"> 删除</a>&nbsp;
<a href="load.do?id=${e.id}">修改</a>
</td>
</tr>
</c:forEach>
</table>
<div style="text-align:right;">
共有${currentPage.totalRecord}个员工，共${currentPage.totalPage}页，当前为第${currentPage.pageNum}页<br/>
<ul class="pagination">
<li>
<a href="list.do?page=${currentPage.pageNum-1}">&laquo;</a>
</li>
<c:forEach begin="${currentPage.start}" end="${currentPage.end}" step="1" var="i">   
    <c:if test="${currentPage.pageNum == i}">
        <li><a class="active" href="#">${i}</a></li>
    </c:if>           
    <c:if test="${currentPage.pageNum != i}">
        <li><a href="list.do?page=${i}">${i}</a></li>                                       
    </c:if>                       
</c:forEach>
<li><a href="list.do?page=${currentPage.pageNum+1}">&raquo;</a></li>
</ul> 
</div>
</div>
<div id="footer_bg" style="margin-top:10px; vertical-align:bottom;color:white; height:5%;font-size:16px">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;myTech © 2011-2018
</div>
</div>
</div>
</body>
</html>