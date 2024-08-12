package edu.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GuGuDan")
public class GuGuDan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GuGuDan() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.valueOf(request.getParameter("dan"));

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" +dan +"단</h1>");
		for (int i = 1; i < 10; i++) {
			out.print("<h1>" + dan + " x " + i + " = " + (dan * i) + "</h1>");
		}
		out.print("</body>");
		out.print("</html>");

		doGet(request, response);
	}

}
