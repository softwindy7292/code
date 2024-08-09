import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Grade")
public class Grade extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Grade() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int kor = Integer.parseInt(request.getParameter("kor"));
		int math = Integer.parseInt(request.getParameter("math"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int sum = kor + math + eng;
		
		out.print("<html>");
		out.print("<body>");
		out.print("총점: " + sum + "<br>");
		out.print("평균: " + sum/3);
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
