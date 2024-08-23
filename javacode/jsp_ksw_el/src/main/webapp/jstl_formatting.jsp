<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL 포맷팅</h1>
	
	<c:set var="num1" value="123456789"></c:set>
	그냥 출력(EL구문) : ${num1}<br>
	<fmt:formatNumber value="${num1}"></fmt:formatNumber>원<br>
	<fmt:formatNumber type="currency" value="${num1}"></fmt:formatNumber><br>
	<fmt:formatNumber type="percent" value="${num1}"></fmt:formatNumber><br>
	<hr>
	
</body>
</html>