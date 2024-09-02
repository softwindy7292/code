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
    <table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify.do" method="post">
			<input type="hidden" name="custno" value="${member.custno}">
			<tr>
				<td>회원이름</td>
				<td><input type="text" name="custname" value="${member.custname}"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone" value="${member.phone}"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" value="${member.address}"></td>
			</tr>
			<input type="hidden" name="joindate" value="${member.joindate}">
			<tr>
				<td>고객등급</td>
				<td><input type="text" name="grade" value="${member.grade}"></td>
			</tr>
			<tr>
				<td>거주지역</td>
				<td><input type="text" name="city" value="${member.city}"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					&nbsp;&nbsp; <button type="button" onclick="location.href='delete.do?custno=${member.custno}'">삭제</button>
					&nbsp;&nbsp; <button type="button" onclick="location.href='memberList_view.do'">돌아가기</button>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>