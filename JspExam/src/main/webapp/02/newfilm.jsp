<%@page import="java.sql.ResultSet"%>
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

<title>My JSP 'login.jsp' starting page</title>

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
<script type="text/javascript">
function inster(form) {
	//document.forms.form1.username.value取得form1中Username的值 并判断是否为空
	if (document.forms.InsterForm.title.value == "") {
		//如果 为""则弹出提示
		alert("请输入内容，谢谢帅哥");
		//将输入焦点定位到没有输入的地方
		document.forms.InsterForm.title.focus();
		//返回错误
		return false;
	}
	if (document.forms.InsterForm.description.value == "") {
		alert("请输入描述！");
		document.forms.InsterForm.description.focus();
		return false;
	}

	
}
</script>
</head>

<body>

	<%
		ResultSet rs = (ResultSet) request.getAttribute("set");
	%>


	<form action="<%=request.getContextPath()%>/03/success.jsp" method="post"
		name="InsterForm">

		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver"
			align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">添加内容</td>
			</tr>
			<tr>
				<td>标题--title：</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>描述--description：</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td>语言--language：</td>
				<td>
					<div>
						<select name="selectLanguage" id="selectLanguage">
							<%
								while (rs.next()) {
							%>
							<option>
								<%=rs.getString(1)
								%>
							</option>
							<%
								}
							%>
						</select>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="submit" onclick="return inster(this);" /> <input
					type="reset" name="reset" /></td>
			</tr>
		</table>

	</form>
</body>
</html>
