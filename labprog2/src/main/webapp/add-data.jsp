<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
<form action="add" method="post">
<table>
<tr>
	<td>Trainee Id</td>
	<td><input type="number" name = "traineeId"></td>
</tr>
<tr>
	<td>Trainee Name</td>
	<td><input type="text" name = "traineeName"></td>
</tr>
<tr>
	<td>Trainee Location</td>
	<td><input type="radio" name = "traineeLocation" value ="Chennai" >Chennai
		<input type="radio" name = "traineeLocation" value ="Banglore">Banglore
		<input type="radio" name = "traineeLocation" value ="Pune">Pune
		<input type="radio" name = "traineeLocation" value ="Mumbai">Mumbai</td>
</tr>
<tr>
	<td>Trainee Domain</td>
	<td><select name="traineeDomain">
  <option value="JEE">JEE</option>
  <option value=".Net">.Net</option>
  <option value="MainFrame">MainFrame</option>
  <option value="CoreJava">CoreJava</option>
	</select></td>
</tr>
<tr>
	<td><button type ="submit">Add Trainee</button></td>
</tr>

</table>
</form>

</body>
</html>