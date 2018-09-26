<%@ page import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Login</title>
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
<script>
$(document).ready(function(){
	  $("#mylogin").click(function(){
	  $("#myform").submit();
	  });
	});
</script>
</head>
<body>
<div style="height:10%"></div>
<div id="example">
    <div class="demo-section k-content">
    <form id="myform" action="login.do" method="post">
        <ul class="fieldlist">
        	<li><span style="color:red;">${msg}</span></li>
            <li>
                <label for="simple-input">用户名</label>
                <input id="simple-input" name="name" type="text" class="k-textbox" style="width: 100%;" />
            </li>
            <li>
                <label for="simple-input-pwd">密码</label>
                <input id="simple-input-pwd" name="pwd" type="password" class="k-textbox" style="width: 100%;" />                
            </li>
        </ul>
    </form>
   	<ul class="fieldlist">
   	    <li><span></span></li> 	
        <li>
		<button class="k-button k-primary" id="mylogin">登录</button>&nbsp;
		<button class="k-button" onclick="location='register.do'">注册</button>
        </li>    		
   	</ul>
    </div>
</div>
</body>
</html>

