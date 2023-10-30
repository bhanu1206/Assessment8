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
<form:form action="${pageContext.request.contextPath }/getlogin" modelAttribute="dataclass" method="post" >
<center>
<form:label path="loginid">Username</form:label>
<form:input path="loginid" maxlength="30" size="30"/><br>
<form:errors path="loginid" cssClass="error" /><br><br>
<form:label path="password">Password</form:label>
<form:password path="password"  maxlength="30" size="30"/><br>
<form:errors path="password" cssClass="error" /><br><br>
<input type="submit" value="Submit"/>   <input type="reset" value="reset"/>
</center>
</form:form>
<br>
	<h3>Below are the data List</h3>
	<c:if test="${!empty ListOfData}">
		<table class="tg" border="1">
			<tr>
				<th width="80">Id</th>
				<th width="120">loginid</th>
				<th width="120">password</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${ListOfData}" var="dataclass">
				<tr>
					<td>${dataclass.id}</td>
					<td>${dataclass.loginid}</td>
					<td>${customer.password}</td>
					<td><a href="<c:url value='/updatedata/${dataclass.id}' />">Edit</a></td>
					<td><a href="<c:url value='/deletedata/${dataclass.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
<script>
setTimeout(function(){
	document.querySelectorAll(".error").forEach(function(element)
	{
		element.style.display = "none";
	});
	},3000);
</script> 
</body>
</html>