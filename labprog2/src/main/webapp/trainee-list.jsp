<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Added</title>
</head>
<body>
<h1>Trainee Details</h1>
<table border="1">
<th>
	<td>Trainee Id </td>
	<td>Trainee Name </td>
	<td>Trainee Domain </td>
	<td>Trainee Location </td>
</th>
<tr th:each="trainee : @{allTrainees}">
	<td>${trainee.traineeId}</td>
	<td>${trainee.traineeName}</td>
	<td>${trainee.traineeDomain}</td>
	<td>${trainee.traineeLocation}</td>
</tr>
</table>
</body>
</html>