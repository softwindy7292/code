<%@page import="edu.ict.prj.vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="edu.ict.prj.dao.EmpDaoInput"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 테이블</h1>
	<%
		int empno = Integer.valueOf(request.getParameter("empno"));
		EmpDaoInput dao = new EmpDaoInput(empno);
		EmpVO vo = dao.empSelect();

		if(vo.getEmpno() == 0){
			out.print("입력한 사원번호는 존재하지 않습니다.<br><br>");
			out.print("<a href=" + "emp_input.html" + ">사원번호 다시 입력하기</a>");
		}else{
			out.print("사원번호: " + vo.getEmpno() + "<br>");
			out.print("사원이름: " + vo.getEname() + "<br>");
			out.print("직종: " + vo.getJob() + "<br>");
			out.print("매니저: " + vo.getMgr() + "<br>");
			out.print("입사일: " + vo.getHiredate() + "<br>");
			out.print("급여: " + vo.getSal() + "<br>");
			out.print("커미션: " + vo.getComm() + "<br>");
			out.print("부서번호: " + vo.getDeptno() + "<br>");
			out.print("<br>");
		}
	%>
</body>
</html>