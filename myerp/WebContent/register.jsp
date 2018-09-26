<%@ page import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>register</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/mystyle.css" />
<link href="css/examples-offline.css" rel="stylesheet">
<link href="css/kendo.common.min.css" rel="stylesheet">
<link href="css/kendo.rtl.min.css" rel="stylesheet">
<link href="css/kendo.default.min.css" rel="stylesheet">
<link href="css/kendo.default.mobile.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/jszip.min.js"></script>
<script src="js/kendo.all.min.js"></script>
<script src="js/console.js"></script>
<script type="text/javascript" src="js/mycheck.js"></script>
</head>
<body>
<div style="height:10%"></div>
<div id="example">
<div class="demo-section k-content">
<form id="regform" action="saveUser.do" method="post">
<ul class="fieldlist">
<li><span style="color:red;">${msg}</span></li>
<li>
    <label for="simple-input">请输入用户名:</label>
    <input id="simple-input" name="user" type="text" class="k-textbox" style="width: 100%;" />
</li>
<li>
    <label for="simple-input">请输入姓名:</label>
    <input id="simple-input" name="realName" type="text" class="k-textbox" style="width: 100%;" />
</li>            
<li>
    <label for="simple-input-pwd">请设置登录密码:</label>
    <input id="simple-input-pwd" name="pwd" type="password" class="k-textbox" style="width: 100%;" />                
</li>
<li>
	<button class="k-button k-primary">&nbsp;注册&nbsp;</button>
</li> 
</ul>
</form>
</div>
</div>
</body>
</html>

