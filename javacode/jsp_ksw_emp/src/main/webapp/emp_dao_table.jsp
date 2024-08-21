<%@page import="edu.ict.prj.vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="edu.ict.prj.dao.EmpDao"%>
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
		EmpDao dao = new EmpDao();
		
		List<EmpVO> deptList = dao.deptSelect();
		out.print("<table border=1>");
		
		out.print("<tr>");
		out.print("<td>EMPNO</td>");
		out.print("<td>ENAME</td>");
		out.print("<td>JOB</td>");
		out.print("<td>MGR</td>");
		out.print("<td>HIREDATE</td>");
		out.print("<td>SAL</td>");
		out.print("<td>COMM</td>");
		out.print("<td>DEPTNO</td>");
		out.print("</tr>");
		
		for(EmpVO vo : deptList){
			out.print("<tr>");
			out.print("<td>" + vo.getEmpno() + "</td>");
			out.print("<td>" + vo.getEname() + "</td>");
			out.print("<td>" + vo.getJob() + "</td>");
			out.print("<td>" + vo.getMgr() + "</td>");
			out.print("<td>" + vo.getHiredate() + "</td>");
			out.print("<td>" + vo.getSal() + "</td>");
			out.print("<td>" + vo.getComm() + "</td>");
			out.print("<td>" + vo.getDeptno() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	%>
</body>
</html>