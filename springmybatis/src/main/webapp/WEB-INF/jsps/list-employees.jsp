<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employee</title>
</head>
<body>
	<h1>List Employee</h1>
	<button onclick="window.location.href='showFormForAddEmployee.html'">
		Add Employee
	</button>
	<div>
		<table border="1">
			<tr>
				<td>Full Name</td>
				<td>Email</td>
				<td>Gender</td>
				<td>Hobbies</td>
				<td>Country</td>
				<td>Address</td>
			</tr>
			<c:forEach items="${listemployees}" var="e">
				<tr>
					<td>${e.fullname}</td>
					<td>${e.email}</td>
					<td>${e.gender}</td>
					<td>${e.hobbies}</td>
					<td>${e.country}</td>
					<td>${e.address}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>