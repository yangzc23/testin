function check(){
	//定义一个邮箱的正则表达式
	var reg = /^\w+@\w+.\w+$/;
	//获取用户名输入框里面的内容
	var name = document.getElementById("name").value;
	var age = document.getElementById("age").value;
	var salary = document.getElementById("salary").value;		
	var email = document.getElementById("email").value;	
	if(email.length==0){
		alert("邮箱地址不能为空！");
		return false;
	}else if(!reg.test(email)){//验证邮箱地址是否合法
		alert("邮箱地址不正确！");
		return false;
	}	
	
	//判断输入的用户名是否为空
	if(name.length==0){
		alert("用户名不能为空！");
		return false;
	}
	//检查年龄的输入框是否为空
	if(age.length==0){
		alert("年龄不能为空！");
		return false;
	}
	//检查薪资的输入框里面内容是否为空
	if(salary.length==0){
		alert("薪资不能为空！");
		return false;
	}
	
	return true;

}