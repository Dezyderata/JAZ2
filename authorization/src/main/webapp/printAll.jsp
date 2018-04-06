<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.UserInformation" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<h1>List of all users:</h1>
		<table border=1>
		<tr>
		<td>Username</td>
		<td>Password</td>
		<td>Email</td>
		</tr>
		<c:forEach items="${allUsers}" var="users">
			<tr>
				<td>${users.getName()}</td>
				<td>${users.getPassword()}</td>
				<td>${users.getEmail()}</td>
			</tr>
		</c:forEach>
		</table>
		</body>
</html>