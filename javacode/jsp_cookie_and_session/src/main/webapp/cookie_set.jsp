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
   		Cookie cookie = new Cookie("name","홍길동");
   		cookie.setMaxAge(60*60);
   		
   		Cookie cookie2 = new Cookie("name1","홍길동1");
   		cookie.setMaxAge(60*60);
   		
	   	response.addCookie(cookie);
	   	response.addCookie(cookie2);
	%>

	<a href="cookie_get.jsp">cookie get</a>
</body>
</html>