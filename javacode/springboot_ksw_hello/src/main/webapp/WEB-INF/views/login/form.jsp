<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 폼</h1>
	<form action="/login/check" method="get">
		<input type="text" name="id"><br>
		<input type="text" name="pw"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>