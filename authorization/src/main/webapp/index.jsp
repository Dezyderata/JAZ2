<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	HttpServletResponse httpResponse = (HttpServletResponse) response;
	if(session.getAttribute("conf")!=null){
		httpResponse.sendRedirect("userProfile.jsp");
	}%>
	<form action="/logServ" method="get">
		<h2>Sign in:</h2>
		<br>
		<label>Username:<input type="text" id="name" name="name" required/></label><br/>
		<label>Password:<input type="password" id="psw" name="psw" required/></label><br/>
		<input type="submit" value="sign in"/>
	</form>
	<form action="/signUp.jsp">
		<br>
		<h2>Or sign up:</h2>
		<br>
		<input type="submit" value="sign up"/>
	</form>
</body>
</html>