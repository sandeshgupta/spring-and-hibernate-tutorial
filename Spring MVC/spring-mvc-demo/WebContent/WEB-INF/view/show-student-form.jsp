<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="process-student-form" modelAttribute="student">
		First name : <form:input path="firstName"/> 
		Last name : <form:input path="lastName"/>
		Country :
		<form:select path="country">
			<form:option value="BZL" label="Brazil">
			
			</form:option>
			<form:option value="IND" label="India">
			
			</form:option>
			
			<form:option value="PAK" label="Pakistan">
			
			</form:option>
		</form:select>
		
		
		ev<form:radiobutton path="language1" value="C"/>
		ee<form:radiobutton path="language1" value="C++"/>
		gg<form:radiobutton path="language1" value="Java"/>
		
		<form:checkbox path="os" value="Linux"/>
		<form:checkbox path="os" value="Mac"/>
		<form:checkbox path="os" value="Windows"/>
		
		
		<input type="submit" value = "Submit"/>
	</form:form>
</body>
</html>