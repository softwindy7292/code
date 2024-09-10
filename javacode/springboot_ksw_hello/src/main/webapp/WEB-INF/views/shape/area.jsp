<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사각형 가로, 세로 입력</h1>
	<form action="/shape/rectangle" method="post">
		가로<input type="text" name="width"><br>
		세로<input type="text" name="height"><br>
		<input type="submit" value="전송">
	</form>
	<h1>삼각형 가로, 세로 입력</h1>
	<form action="/shape/triangle" method="post">
		가로<input type="text" name="width"><br>
		세로<input type="text" name="height"><br>
		<input type="submit" value="전송">
	</form>
	<h1>원 반지름 입력</h1>
	<form action="/shape/circle" method="post">
		반지름<input type="text" name="radius"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>