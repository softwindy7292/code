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
		int m50000, m10000, m5000, m1000, m500, m100;
		int money = Integer.valueOf(request.getParameter("money"));
		out.print("<h1>");
		out.print("총 금액 " + money + "<br>");
		
		m50000 = money / 50000;
		money = money % 50000;
		
		m10000 = money / 10000;
		money = money % 10000;
		
		m5000 = money / 5000;
		money = money % 5000;
		
		m1000 = money / 1000;
		money = money % 1000;
		
		m500 = money / 500;
		money = money % 500;
		
		m100 = money / 100;
		money = money % 100;
		
		out.print("50000원: " + m50000 + "개<br>");
		out.print("10000원: " + m10000 + "개<br>");
		out.print("5000원: " + m5000 + "개<br>");
		out.print("1000원: " + m1000 + "개<br>");
		out.print("500원: " + m500 + "개<br>");
		out.print("100원: " + m100 + "개<br>");
		out.print("남은금액: " + money + "원");
		out.print("</h1>");
	%>
</body>
</html>