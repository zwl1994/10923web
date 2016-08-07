<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body,div,ul,li {
	margin: 0;
	padding: 0;
	font-style: normal;
	font: 12px/22px "\5B8B\4F53", Arial, Helvetica, sans-serif
}

.ol,ul,li {
	list-style: none
}

.body {
	color: #000000;
	background: #FFF;
	text-align: center
}

.a {
	color: #000000;
}

.a:hover {
	color: #BA2636
}

#nav {
	width: 100%;
	height: 60px;
	background: #00A2CA;
	margin: 0 auto
}

#nav li {
	display: inline;
	height: 60px
}

#nav li a {
	text-decoration: none;
	display: inline-block;
	padding: 0 20px;
	height: 60px;
	line-height: 60px;
	color: #FFF;
	font-family: "\5FAE\8F6F\96C5\9ED1";
	font-size: 16px
}

#nav li a:hover {
	background: #0095BB
}
</style>
</head>

<body>
	<%-- <a href="<%=request.getContextPath()%>/01/login.jsp">登录</a>
	<a href="<%=request.getContextPath()%>/filmservlet">电影管理</a> --%>


	<div align="center">
		<h2 style="padding-top:20px">电影租赁系统</h2>
		<ul id="nav">
			<li><a href="<%=request.getContextPath()%>/01/login.jsp">1.登录</a></li>
			<li><a href="<%=request.getContextPath()%>/filmservlet">2.film表查/增/删</a></li>
			<li><a href="<%=request.getContextPath()%>/01/login.jsp">3.FreeMarker查/改</a></li>
			<li><a href="<%=request.getContextPath()%>/01/login.jsp">4.Filter功能</a></li>

		</ul>

	</div>
</body>
</html>
