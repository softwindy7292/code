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
		Cart cart = (Cart)session.getAttribute("cart");
	
		for(String product : cart.getProductList()){
			out.print("상품: " + product + "<br>");
		}
	%>
</body>
</html>