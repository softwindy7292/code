<%@page import="edu.ict.shop.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("cart", new Cart());
	%>
	
	<a href="cart_get.jsp">카트 내용보기</a>
</body>
</html>