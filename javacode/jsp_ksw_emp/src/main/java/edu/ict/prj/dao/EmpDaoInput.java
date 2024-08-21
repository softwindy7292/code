package edu.ict.prj.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.ict.prj.vo.EmpVO;

public class EmpDaoInput {
	private DataSource dataSource = null;
	private int myEmpno;

	public EmpDaoInput(int myEmpno) {
		this.myEmpno = myEmpno;
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public EmpVO empSelect() {
		EmpVO vo = new EmpVO();

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		String sql = "select * from emp where empno = " + myEmpno;
		
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			
			rs.next();
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			Date hiredate = rs.getDate("hiredate");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int deptno = rs.getInt("deptno");
			
			if(empno == 0)
				return vo;
			
			vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (rs != null)
					rs.close();

				if (statement != null)
					statement.close();

				if (connection != null)
					connection.close();
				
			} catch (Exception e) {}
		}

		return vo;
	}
}
