<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<form:form action="process-customer-form" modelAttribute="customer">
		First name : <form:input path="firstName"/> 
		<form:errors path="firstName" cssClass="error"/>
		
		Last name : <form:input path="lastName"/>
		
		Age:<form:input path="age"/>
		<form:errors path="age"/>
		
		Code :<form:input path="courseCode"/>
		<form:errors path="courseCode"/>
		
		<input type="submit" value = "Submit"/>
	</form:form>
</body>
</html>