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
	<h1>JSTL 코어 연습</h1>
	<c:set var="num1" value="10" />
	<!-- pageScope에 저장 -->
	<c:set var="num2" value="20" scope="session" />
	${num1}
	<br> ${num2}
	<br>

	<c:set var="result" value
	="${num1 + num2}" />
	${result}
	<br>

	<hr>
	${pageScope.num1}
	<br> ${sessionScope.num2}
	<br>

	<hr>
	<%-- <c:remove var="num2"/> --%>
	${num1}
	<br> ${num2}
	<br>

	<hr>
	<h2>변수 출력</h2>
	<c:set var="name" value="김선우" />
	${name}
	<br>
	<c:out value="${name}" default="없음" />

	<hr>
	<h2>조건문 if</h2>
	<c:if test="${num1 < num2}">
		<p>num2가 더 큼</p>
	</c:if>

	<c:if test="${name eq '김선우'}">
		<p>${name}입니다</p>
	</c:if>

	<c:if test="${name ne '안녕하세여'}">
		<p>안녕하지 않아요!</p>
	</c:if>

	<hr>
	<h3>choose when</h3>
	<c:choose>
		<%-- choose 다음엔 when 을 쓸 것 --%>
		<c:when test="${num1 > 5}">
    		num1이 5보다 크다
		</c:when>
		<c:when test="${num2 < 100}">
    		num2가 100보다 작다
   		</c:when>
		<c:otherwise>s
    		num1이 5보다 크지도 100보다 작지도 않다.
		</c:otherwise>
	</c:choose>
	
	<hr>
	<c:forEach var="i" begin="1" end="10" step="2">
		<p>안녕하세요 + ${i}</p>
	</c:forEach>
	
	<c:forEach var="i" begin="1" end="6">
		<h${i}>안녕하세요</h${i}>
	</c:forEach>
	
	
	
	
</body>
</html>