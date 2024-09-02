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
    <script>
    	
    </script>
</head>
<body>
    <table>
		<tr>
			<td>회원번호</td>
			<td>회원이름</td>
			<td>고객등급</td>
			<td>매출</td>
		</tr>
		<c:forEach var="money" items="${moneyList}">
			<tr>
				<td>${money.custno}</td>
				<td>${money.custname}</td>
				<td id="grade">
					${money.grade}
				</td>
				<td>${money.price}</td>
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