<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Trainees</title>
</head>
<body>
<h1>Trainee Details</h1>
<table border="1">
<tr>
	<th>Trainee Id </th>
	<th>Trainee Name </th>
	<th>Trainee Domain </th>
	<th>Trainee Location </th>
</tr>
<c:forEach items="${allTrainees}" var="Trainee">
<tr>
	<td>${trainee.traineeId}</td>
	<td>${trainee.traineeName}</td>
	<td>${trainee.traineeDomain}</td>
	<td>${trainee.traineeLocation}</td>
</tr>
</c:forEach>
</table>
</body>
</html>