package quest.day0812;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Grade{
	private double kor, math, eng, sum, avg;
	
	public Grade(double kor, double math, double eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public double getKor() {
		return kor;
	}
	
	public double getMath() {
		return math;
	}
	
	public double getEng() {
		return eng;
	}
	
	public double getSum() {
		sum = kor + math + eng;
		return sum;
	}
	
	public double getAvg() {
		avg = sum / 3;
		return avg;
	}
}

@WebServlet("/GradeAvg")
public class GradeAvg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GradeAvg() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		double kor = Double.valueOf(request.getParameter("kor"));
		double math = Double.valueOf(request.getParameter("math"));
		double eng = Double.valueOf(request.getParameter("eng"));
		Grade grade = new Grade(kor, math, eng);
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");
		out.print("국어: " + grade.getKor() + "<br>");
		out.print("수학: " + grade.getMath() + "<br>");
		out.print("영어: " + grade.getEng() + "<br>");
		out.print("총점: " + grade.getSum() + "<br>");
		out.print("평균: " + grade.getAvg() + "<br>");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
		doGet(request, response);
	}

}
