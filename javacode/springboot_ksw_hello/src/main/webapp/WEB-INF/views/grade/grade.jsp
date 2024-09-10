<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>국어 : ${gradeVO.kor}</h1>
	<h1>영어 : ${gradeVO.eng}</h1>
	<h1>수학 : ${gradeVO.math}</h1>
	<br>
	<h1>총점 : ${gradeVO.total}</h1>
	<h1>평균 : ${gradeVO.avg}</h1>
	<h1>성적 : ${gradeVO.grade}</h1>
</body>
</html>