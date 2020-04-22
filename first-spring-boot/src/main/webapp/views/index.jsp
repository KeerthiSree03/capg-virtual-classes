<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>Find User</h3>
		<form action="get-user" method="get">
			Email<input type="email" name="tEmail"><br>
			<button type="submit">Enter</button>
	</div>

	<br>
	<br>

	<h3>Add User</h3>
	<form action="add" method="post">
		Name<input type="text" name="userName"><br> Email<input
			type="email" name="email"><br> Age<input type="number"
			name="age"><br> Date of Birth<input type="date"
			name="dob"><br>
		<button type="submit">Add</button>
	</form>

</body>
</html>