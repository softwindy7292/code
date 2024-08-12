package edu.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.Shape.Rectangle;


@WebServlet("/Rect")
public class RectMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RectMain() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		double width = Double.valueOf(request.getParameter("width"));
		double height = Double.valueOf(request.getParameter("height"));
		Rectangle rect = new Rectangle(width, height);

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>가로: " + width +"</h1>");
		out.print("<h1>세로: " + height +"</h1>");
		out.print("<h1>직사각형의 넓이: " + rect.getArea() + "</h1>");
		out.print("</body>");
		out.print("</html>");
		
		doGet(request, response);
		doGet(request, response);
	}

}
