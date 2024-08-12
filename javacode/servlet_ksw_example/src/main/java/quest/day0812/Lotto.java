package quest.day0812;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class MakeLotto {
	private int[] lotto = new int[6];

	public MakeLotto() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				while (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45 + 1);
				}
			}
		}
	}
	
	public String getLotto() {
		return "로또번호: " + lotto[0] + " " + lotto[1] + " " + lotto[2] + " " + lotto[3] + " " + lotto[4] + " " + lotto[5];
	}
	
	public boolean MatchLotto(int lotto) {
		for(int i = 0;i < this.lotto.length;i++) {
			if(this.lotto[i] == lotto) {
				return true;
			}
		}
		return false;
	}
}

@WebServlet("/Lotto")
public class Lotto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Lotto() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		MakeLotto lotto = new MakeLotto();
		int[] userLotto = new int[6];
		userLotto[0] = Integer.valueOf(request.getParameter("num1"));
		userLotto[1] = Integer.valueOf(request.getParameter("num2"));
		userLotto[2] = Integer.valueOf(request.getParameter("num3"));
		userLotto[3] = Integer.valueOf(request.getParameter("num4"));
		userLotto[4] = Integer.valueOf(request.getParameter("num5"));
		userLotto[5] = Integer.valueOf(request.getParameter("num6"));


		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" + lotto.getLotto() + "</h1>");
		out.print("<h1>사용자번호: ");
		for(int i = 0;i < 6;i++) {
			out.print(userLotto[i] + " ");
		}
		out.print("</h1>");
		out.print("<h1>같은번호: ");
		for(int i = 0;i < 6;i++) {
			if(lotto.MatchLotto(userLotto[i])) {
				out.print(userLotto[i] + " ");
			}
		}
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
		doGet(request, response);
	}

}
