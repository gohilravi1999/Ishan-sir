<%@ page language="java" contentType="text/html; charset=utf-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registration Form</title>
</head>
<body>

<a href="UserServlet?language=fr_FR">French</a>
<a href="UserServlet?language=en_US">English</a>

<h1>${title}</h1>
<form action="./register" method="post">
			<table style="with: 50%">
				<tr>
		<td>${Message}</td></tr>
				<tr>
					<td>${username}</td>
				
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>${password}</td>
					<td><input type="password" name="password" /></td>
				</tr>
				</table>
				<br>
			<input type="submit" value="${submit}" /></form>
</body>
</html>