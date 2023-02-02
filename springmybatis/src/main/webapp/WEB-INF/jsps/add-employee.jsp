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
	<h1>Employee</h1>
	<s:form action="saveProcess" modelAttribute="employee">
		
		<input type="hidden" id="hiddenTxt" value ="${employee.hobbies}">
		<s:hidden path="id" />
		
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
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			
			var hobbies = $("#hiddenTxt").val().split(",");
			var $checkboxes = $("input[type=checkbox]");
			$checkboxes.each(function(id,element){
				if(hobbies.indexOf(element.value)!=-1){
					element.setAttribute("checked","checked");
				}else{
					element.removeAttribute("checked");
				}
			});
		});
	</script>
</body>
</html>