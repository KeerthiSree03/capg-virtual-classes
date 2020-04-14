<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login Page</h1>
<form action="login" method ="get">
<table border="1">
<tr>
	<td>User-name: </td>
	<td><input type="text" name="userName"></td>
</tr>
<tr>
	<td>Password: </td>
	<td><input type="text" name ="password"></td>
</tr>
<tr>
	<td colspan ="2" align="right"><button type="submit">Login</button></td>
</tr>
</table>
</form>
</body>
</html>