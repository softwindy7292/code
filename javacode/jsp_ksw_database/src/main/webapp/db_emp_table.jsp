<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection connection;
		Statement statement;
		ResultSet rs;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "scott";
		String upw = "tiger";
		
		String query = "select * from emp";
		
		try{
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			out.print("<table border=1>");
			out.print("<tr>");
			out.print("<td>사원번호</td>");
			out.print("<td>사원이름</td>");
			out.print("<td>직종</td>");
			out.print("<td>매니저</td>");
			out.print("<td>입사일</td>");
			out.print("<td>급여</td>");
			out.print("<td>커미션</td>");
			out.print("<td>부서번호</td>");
			out.print("</tr>");
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				int deptno = rs.getInt("deptno");
				
				out.print("<tr>");
				out.print("<td>" + empno + "</td>");
				out.print("<td>" + ename + "</td>");
				out.print("<td>" + job + "</td>");
				out.print("<td>" + mgr + "</td>");
				out.print("<td>" + hiredate + "</td>");
				out.print("<td>" + sal + "</td>");
				out.print("<td>" + comm + "</td>");
				out.print("<td>" + deptno + "</td>");
				out.print("</tr>");
			}
			out.print("</table>");
			
		}catch(Exception e){}
		finally{}
	%>
</body>
</html>