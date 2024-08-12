package edu.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.Shape.Circle;


@WebServlet("/Circle")
public class CircleMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CircleMain() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		double radius = Double.valueOf(request.getParameter("radius"));
		Circle circle = new Circle(radius);

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>반지름: " + radius +"</h1>");
		out.print("<h1>원의 넓이: " + circle.getArea() + "</h1>");
		out.print("</body>");
		out.print("</html>");
		
		doGet(request, response);
	}

}
