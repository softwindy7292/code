<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>국어, 영어, 수학 성적 입력</h1>
	<form action="/grade/grade" method="post">
		국어<input type="text" name="kor"><br>
		영어<input type="text" name="eng"><br>
		수학<input type="text" name="math"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>