<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>별 쌓기</h1>
	<c:forEach var="i" begin="1" end="${starVO.star}">
		<c:forEach var="j" begin="1" end="${i}">*</c:forEach>
		<br>
	</c:forEach>
</body>
</html>