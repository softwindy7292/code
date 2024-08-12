package edu.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ict.Shape.Grade;



@WebServlet("/Grade")
public class GradeMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GradeMain() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		double kor = Double.valueOf(request.getParameter("kor"));
		double math = Double.valueOf(request.getParameter("math"));
		double eng = Double.valueOf(request.getParameter("eng"));
		Grade grade = new Grade(name, kor, math, eng);

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>이름: " + grade.getName() +"</h1>");
		out.print("<h1>국어: " + grade.getKor() + " 수학: " + grade.getMath() + " 영어: " + grade.getEng() + "</h1>");
		out.print("<h1>총점: " + grade.getSum() +"</h1>");
		out.print("<h1>평균: " + grade.getAvg() +"</h1>");
		out.print("<h1>성적: " + grade.getGrade() +"</h1>");
		out.print("</body>");
		out.print("</html>");
		
		doGet(request, response);
	}

}
