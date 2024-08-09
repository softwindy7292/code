

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugu3")
public class GuGu3Dan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GuGu3Dan() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
			
		out.print("<html>");
		out.print("<body>");
		out.print(3 + "단<br>");
		for(int i = 1;i < 10;i++) {
			out.print(3 + "*" + i + "=" + (3*i) + "<br>");
		}
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
