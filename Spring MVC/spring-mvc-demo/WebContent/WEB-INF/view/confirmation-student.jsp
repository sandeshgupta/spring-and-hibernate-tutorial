<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	Confirmed ${student.firstName} - ${student.lastName} - ${student.country} - ${student.language1 }
	<br>
	OS :
	
	<c:forEach var="temp" items="${student.os}">
		<li>${temp}</li>
	</c:forEach>
</body>
</html>