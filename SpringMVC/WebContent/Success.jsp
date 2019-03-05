<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>successfully</h1>
<table>
<%-- 
<tr><td>first name:<td>${firstname}</td>
<tr><td>last name:<td>${lastname}</td>
<tr><td>email:<td>${email}</td>
 --%>
 
 <tr><td>first name:<td>${customer.firstName}</td>
<tr><td>last name:<td>${customer.lastName}</td>
<tr><td>email:<td>${customer.email}</td>

</table>
</body>
</html>