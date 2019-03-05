<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html><!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>
</head>
<body>
<!--<form action="showReguserAction.obj" method="post"> requestmapping name given when we call success(showRegCustomer) 
<table>
 <tr> <td>Enter firstName:<input type="text" name="fname">
<tr> <td>Enter lastName:<input type="text" name="lname">
<tr> <td>Enter age:<input type="text" name="age">
<tr> <td>Enter mobile no:<input type="text" name="mobno">
<tr> <td>Enter email:<input type="email" name="email">
<tr> <td>Select city:<select name="city">
<option value="pune">pune</option>
<option value="agra">agra</option>
<option value="mumbai">mumbai</option>
<option value="delhi">delhi</option>
</select>
<tr> <td><input type="submit" name="submit" value="register me"> -->

<sf:form action="showReguserAction.obj" method="post" modelAttribute="customer">
<table>
<tr> <td>Enter firstName:<sf:input type="text" name="fname" path="firstName"></sf:input><sf:errors path="firstName"></sf:errors>
<tr> <td>Enter lastName:<sf:input type="text" name="lname" path="lastName"></sf:input><sf:errors path="lastName"></sf:errors>
<tr> <td>Enter age:<sf:input type="text" name="age" path="age"></sf:input><sf:errors path="age"></sf:errors>
<tr> <td>Enter mobile no:<sf:input type="text" name="mobno" path="mobileNo"></sf:input><sf:errors path="mobileNo"></sf:errors>
<tr> <td>Enter email:<sf:input type="email" name="email" path="email"></sf:input><sf:errors path="email"></sf:errors>
<tr> <td>Select city:<sf:select name="city" path="city">
<sf:option value="pune">pune</sf:option>
<sf:option value="agra">agra</sf:option>
<sf:option value="mumbai">mumbai</sf:option>
<sf:option value="delhi">delhi</sf:option>
</sf:select>
<tr> <td><input type="submit" name="submit" value="register me">
</table>

</sf:form>
</body>
</html>