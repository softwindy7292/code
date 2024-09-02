package homeshopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homeshopping.command.homeShoppingCommand;
import homeshopping.command.homeShoppingDeleteCommand;
import homeshopping.command.homeShoppingListCommand;
import homeshopping.command.homeShoppingModifyCommand;
import homeshopping.command.homeShoppingModifyViewCommand;
import homeshopping.command.homeShoppingSalesCommand;
import homeshopping.command.homeShoppingSignUpCommand;



@WebServlet("*.do")
public class homeShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public homeShoppingController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		homeShoppingCommand command = null;
		
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());
		
		System.out.println(uri + "." + contextPath + "." + com);
		
		if(com.equals("/signUp_view.do")) {
			viewPage = "signUp_view.jsp";
		}else if(com.equals("/signUp.do")) {
			command = new homeShoppingSignUpCommand();
			command.execute(request, response);
			viewPage = "homeShopping_main.jsp";
		}else if(com.equals("/memberList_view.do")) {
			command = new homeShoppingListCommand();
			command.execute(request, response);
			viewPage = "memberList_view.jsp";
		}else if(com.equals("/sales_view.do")) {
			command = new homeShoppingSalesCommand();
			command.execute(request, response);
			viewPage = "sales_view.jsp";
		}else if(com.equals("/modify_view.do")) {
			command = new homeShoppingModifyViewCommand();
			command.execute(request, response);
			viewPage = "modify_view.jsp";
		}else if(com.equals("/modify.do")) {
			command = new homeShoppingModifyCommand();
			command.execute(request, response);
			viewPage = "memberList_view.do";
		}else if(com.equals("/delete.do")) {
			command = new homeShoppingDeleteCommand();
			command.execute(request, response);
			viewPage = "memberList_view.do";
		}
			
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
