<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단</h1>
	<table border=1>
		<tr>
		<%
			for(int i = 2;i < 10;i++)
				out.print("<td>" + i + "단</td>");
		%>
		</tr>
		<%
			for(int i = 1;i < 10;i++){
				out.print("<tr>");
				for(int j = 2;j < 10;j++){
					out.print("<td>" + j + "x" + i + "=" + (j*i) + "</td>");
				}
				out.print("</tr>");
			}
		%>
	</table>
</body>
</html>