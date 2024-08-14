<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
	        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	
	<title>Insert title here</title>
	<style type="text/css">
	</style>
</head>
<body>
	<%!
		int[] lotto = new int[6];
	%>
	
	<%
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				while (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45 + 1);
				}
			}
		}
	%>
	<div class="container vh-100 ">
        <div class="text-white fs-5 d-flex justify-content-center align-items-center">
			<div class="col bg-dark"><h1><%= lotto[0]%></h1></div>
			<div class="col bg-dark"><h1><%= lotto[1]%></h1></div>
            <div class="col bg-dark"><h1><%= lotto[2]%></h1></div>
            <div class="col bg-dark"><h1><%= lotto[3]%></h1></div>
            <div class="col bg-dark"><h1><%= lotto[4]%></h1></div>
            <div class="col bg-dark"><h1><%= lotto[5]%></h1></div>
		</div>
    </div>
</body>
</html>