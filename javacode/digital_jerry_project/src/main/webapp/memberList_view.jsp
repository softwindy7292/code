<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Document</title>
</head>
<body>
    <table>
		<tr>
			<td>회원번호</td>
			<td>회원이름</td>
			<td>전화번호</td>
			<td>주소</td>
			<td>가입일자</td>
			<td>고객등급</td>
			<td>거주지역</td>
		</tr>
		<c:forEach var="member" items="${memberList}">
			<tr>
				<td><a href="modify_view.do?custno=${member.custno}">${member.custno}</a></td>
				<td>${member.custname}</td>
				<td>${member.phone}</td>
				<td>${member.address}</td>
				<td>${member.joindate}</td>
				<td>${member.grade}</td>
				<td>${member.city}</td>
			</tr>
		</c:forEach>
		<tr>
			<td>
				<button type="button" onclick="location.href='homeShopping_main.jsp'">돌아가기</button>
			</td>
		</tr>
	</table>
</body>
</html>