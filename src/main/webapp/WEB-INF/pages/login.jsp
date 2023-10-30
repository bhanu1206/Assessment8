<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loginpage</title>
<style>
.error{
color: red;
font-size: 10px;
}
</style>
</head>
<body>
<form:form action="${pageContext.request.contextPath }/login" modelAttribute="emp" method="post" >
<center>
<form:label path="fname">FirstName</form:label>
<form:input path="fname" maxlength="30" size="30"/><br>
<form:errors path="fname" cssClass="error" /><br><br>
<form:label path="lname">LastName</form:label>
<form:password path="lname"  maxlength="30" size="30"/><br>
<form:errors path="lname" cssClass="error" /><br><br>
<form:label path="desig">Designation</form:label>
<form:password path="desig"  maxlength="30" size="30"/><br>
<form:errors path="desig" cssClass="error" /><br><br>

<input type="submit" value="Submit"/>   <input type="reset" value="reset"/>
</center>
</form:form>
<br>
 
</body>
</html>