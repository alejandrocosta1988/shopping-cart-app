package servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		
		String action = request.getParameter("action");
		if (action == null) {
			action = "see";
		}
		
		String url = "/cart.jsp";
		if (action.equals("see")) {
			url = "/cart.jsp";
		}
		
		servletContext.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		
		String action = request.getParameter("action");
		if (action == null) {
			action = "cart";
		}
		
		String url = "index.jsp";
		
		if (action.equals("shop")) {
			
			url = "/index.jsp";
			
		} else if (action.equals("cart")) {
			
			url = "/cart.jsp";
			
		} else if (action.equals("see")) {
			
			url = "/cart.jsp";
			
		} else if (action.equals("checkout")) {
			
			url = "/checkout.jsp";
			
		}
		
		servletContext.getRequestDispatcher(url).forward(request, response);
		
	}

}
