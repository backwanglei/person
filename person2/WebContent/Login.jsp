<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/loginhtml.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<h1>欢迎登录</h1>
<hr/>
<form action="<%=request.getContextPath() %>/servlet/LoginServlet" method="post" class="myform" >
<div class="mydiv">
<span>用户名：</span><input type="text" name="uname" title="请输入用户名"><br/>
<br/>
<span>密&nbsp;码:</span><input type="password" name="upsw" title="请输入密码">
<br/><br/>
<input type="submit" value="登录">&nbsp;
<input type="reset" value="重置">
</div>
<div class="divtwo">
<p>友情链接：<a href="http://www.baidu.com">百度</a>&nbsp;|&nbsp;<a href="http://www.qq.com">腾讯</a>&nbsp;|&nbsp;<a href="http://www.taobao.com">淘宝</a>&nbsp;|&nbsp;<a href="http://www.sina.com.cn"/>新浪</a>&nbsp;|&nbsp;<a href="http://www.mi.com/"/>小米</a>
</p>
</div>
</form>
</body>
</html>