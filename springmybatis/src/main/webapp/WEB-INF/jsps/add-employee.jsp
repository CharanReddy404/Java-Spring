<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h1>Add Employee</h1>
	<s:form action="saveProcess" modelAttribute="employee">
		
		Employee Name: <s:input path="fullname"/><br/>
		<br/>
		Employee Email: <s:input path="email"/><br/>
		<br/>
		Gender: 
		<s:radiobutton path="gender" value="Male"/>Male 
		<s:radiobutton path="gender" value="Female"/>Female<br/>
		<br/>
		Interests: <s:checkbox path="hobbies" value="Sports"/>Sports
		<s:checkbox path="hobbies" value="Books"/>Books
		<s:checkbox path="hobbies" value="Swimming"/>Swimming
		<s:checkbox path="hobbies" value="Cycling"/>Cycling
		<br/>
		<br/>
		Country: <s:select path="country">
			<s:option value="India">India</s:option>
			<s:option value="Australia">Australia</s:option>
			<s:option value="South Africa">South Africa</s:option>
			<s:option value="America">America</s:option>
		</s:select>
		<br/>
		<br/>
		Address: <s:textarea path="address"/><br/>
		<br/>
		<input type="submit" value="Save Employee" />
		
	</s:form>
</body>
</html>