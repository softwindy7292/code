package quest.day0812;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Star2")
public class Star2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Star2() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int star = Integer.valueOf(request.getParameter("star"));



		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");
		for(int i = star;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				out.print("*");
			}
			out.print("<br>");
		}
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
		doGet(request, response);
	}

}
