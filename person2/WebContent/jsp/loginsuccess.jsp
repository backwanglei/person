<%@page import="java.util.Set"%>
<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/loginsuccess.css">
<script type="text/javascript" src="../jquery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人主页</title>
</head>
<body>
<%
if(session.getAttribute("username")!=null){
%>
<div class="mydiv">
<h2>欢迎${sessionScope.username}访问我的个人网站</h2>
</div>
<script type="text/javascript" src="../js/js.js">
</script>
<% 	
}
%> 
 <a href="../Login.jsp">登录</a>
<a href=logout.jsp>注销</a> 
<%
Set all=(Set)this.getServletContext().getAttribute("online");
%>
<span>当前用户在线人数为：<%=all.size() %></span>
<div class="divthree">
<p>${sessionScope.hello}</p>
<br/>
<marquee direction="right" scrollamount="15"onmouseover=this.stop() onmouseout=this.start()><span class="spa">现在的时间是：</span>
<%-- <%=session.getAttribute("time")%>  --%><span id="now_time"></span>
</marquee>
</div>
<div class="divtwo">
<!-- <marquee><img alt="" src="../images/ii.png"></marquee> -->
<p>我的主页&nbsp;|&nbsp;<a href="../homepage/person.html" style="color: white;text-decoration: none;">个人简介</a>&nbsp;|&nbsp;网站首页&nbsp;|&nbsp;学习笔记&nbsp;|&nbsp;个人项目&nbsp;|&nbsp;职业规划
&nbsp;|&nbsp;联系我</p>

</div>
<br/>
<div class="divfour">
<marquee direction="up" scrollamount="15">
</marquee>
</div>  
</body>
</html>