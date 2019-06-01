<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Main page</title>
	</head>
	<style>
		table, th, td {
  			border: 1px solid black;
  			align: center;
		}
		.displayForm {
			text-align:center;
		}
	</style>
	<body>
		<h1 style="text-align: center">Welcome to main Page</h1>
		<div class="inputForm">
			<form:form action="addUser" modelAttribute="userInfo" method="post">
				Username: <form:input path="name" type="text"/> <br/>
				Email: <form:input path="email" type="text"/> <br/>
				Password: <form:input path="password" type="password"/> <br/>
				<form:button type="submit">Add</form:button>
			</form:form>
		</div>
		
		<div class="displayForm" >
			<h3>User Information Details</h3>
			<table>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
				</tr>
				<c:forEach items="{userForms}" var="user">
					<tr>
						<td>{user.id}</td>
						<td>{user.name}</td>
						<td>{user.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<footer style="text-align: center">©Copyrights Reserved for Ace</footer>
	</body>
</html>