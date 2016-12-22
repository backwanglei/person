<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/loginjsp.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注销页面</title>
</head>
<body>
<%
response.setHeader("refresh", "2;URL=../Login.jsp");
session.invalidate();
%>
<h3>您已经成功推出本网站，两秒后跳转回登录页面</h3>
<h3>如果没有跳转，请点击<a href="../Login.jsp">这里</a></h3>
</body>
</html>