<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/loginjsp.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>判断页面</title>
</head>
<body>
<%
response.setHeader("refresh", "2;url=/person2/jsp/loginsuccess.jsp");
%> 
<div>
	<h3>用户登录成功，2秒后自动跳转到个人主页!</h3>
	<h3>如果服务器未响应，请点击<a href="loginsuccess.jsp">这里进行跳转</a></h3></div>	

</body>
</html>