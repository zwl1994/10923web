<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*,java.io.*,java.util.*"%>
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

<title>My JSP 'film.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}
</style>
</head>
<style type="text/css">
table {
	border: 2px #CCCCCC solid;
	width: 720px;
}

td,th {
	height: 30px;
	border: #CCCCCC 1px solid;
}
</style>
<body>
	<%
		ResultSet rs = (ResultSet) request.getAttribute("set");
	%>



	<a href="<%=request.getContextPath()%>/newfilmservlet"><button
			style="float:right;">添加内容</button></a>
	<form action="<%=request.getContextPath()%>/deleteservlet"
		method="post" name="form">
		<input type="hidden" name="action" value="post" />
		<table align="center">
			<tr>
				<th>
					<%
						out.print("选择框");
					%>
				</th>
				<th>
					<%
						out.print("film_id");
					%>
				</th>
				<th>
					<%
						out.print("title");
					%>
				</th>
				<th>
					<%
						out.print("description");
					%>
				</th>
				<th>
					<%
						out.print("language");
					%>
				</th>
				<th>
					<%
						out.print("操作");
					%>
				</th>
			</tr>
			<%
				int i = 0;
			%>
			<%
				while (rs.next()) {
			%>
			<tr>
				<td><input type="checkbox" name="selected"
					value=<%=rs.getInt(1)%> /></td>
				<td>
					<%
						out.print(rs.getInt(1));
					%>
				</td>
				<td>
					<%
						out.print(rs.getString(2));
					%>
				</td>
				<td>
					<%
						out.print(rs.getString(3));
					%>
				</td>
				<td>
					<%
						out.print(rs.getString(4));
					%>
				</td>
				<td><input type="submit" value="删除" /></td>
			</tr>
			<%
				}
			%>
		</table>
	</form>
</body>
</html>
