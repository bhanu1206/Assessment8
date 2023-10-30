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
<h3>Below is the list</h3>
	<c:if test="${!empty ListOfData}">
		<table class="tg" border="1">
			<tr>
				<th width="80">Id</th>
				<th width="120">Firstname</th>
				<th width="120">Lastname</th>
				<th width="120">Department</th>
			</tr>
			<c:forEach items="${ListOfData}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.firstname}</td>
					<td>${emp.lastname}</td>
					<td>${emp.department}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>