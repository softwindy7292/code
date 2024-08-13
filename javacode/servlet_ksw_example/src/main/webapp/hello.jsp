<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border-collapse : collapse;
	}
</style>
</head>
<body>
	<h1>hi</h1>
	<%
	int i = 0;
	System.out.println(i);

	out.println("<h1>" + i + "</h1>");
	%>
	<hr>
	<h1>3단</h1>
	<%
	int dan = 3;

	for (i = 1; i < 10; i++) {
		out.print("<h1>" + dan + "x" + i + "=" + (dan * i) + "</h1>");
	}
	%>
</body>
</html>