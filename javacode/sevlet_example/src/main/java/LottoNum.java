

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lotto")
public class LottoNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LottoNum() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Set<Integer> lotto = new HashSet<>();

		while (lotto.size() < 6)
			lotto.add((int) (Math.random() * 45 + 1));
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" + lotto + "</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
