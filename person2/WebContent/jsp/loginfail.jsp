<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/loginjsp.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录失败</title>
</head>
<body>
 <%
response.setHeader("refresh", "2;url=../Login.jsp");
%> 
<div>
    <h3>错误的用户名和密码,2秒后返回登录页面，请重新登录</h3>
  </div>
</body>
</html>