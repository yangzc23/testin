<%@ page import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>success</title>
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
<script type="text/javascript">
function tologin(){
	setTimeout(function(){
		window.location="./";
	},3000);
}
</script>			
</head>
<body onload="tologin();">
<div style="height:10%"></div>
<div id="example">
<div class="demo-section k-content">
<ul class="fieldlist">
<li><label>新用户注册成功！正在进入登录页面，请稍后……</label></li>
<li><label>登录账号为：${msg}</label></li>
</ul>
</div>
</div>
</body>
</html>

