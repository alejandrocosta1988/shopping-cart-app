package servlets;

import java.io.IOException;

import data.ProductIO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Cart;
import model.CartItem;
import model.Product;

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
			
			String productCode = request.getParameter("product-code");
			
			HttpSession session = request.getSession(); 
			Cart cart = (Cart) session.getAttribute("cart");
			if (cart == null) {
				cart = new Cart();
			}
			
			String path = servletContext.getRealPath("WEB-INF/products.txt");
			Product product = ProductIO.getProduct(productCode, path);
			CartItem cartItem = new CartItem(product, 1);
			cart.addItem(cartItem);
			
			session.setAttribute("cart", cart);
			
		} else if (action.equals("updateQuantity")) {
			
			url = "/cart.jsp";
			
			String productCode = request.getParameter("product-code");
			String quantityString = request.getParameter("quantity");

			//Se a quantidade for inválida
			int quantity;
			try {
				quantity = Integer.parseInt(quantityString);
				if (quantity < 0) {
					quantity = 1;
				}
			} catch (NumberFormatException e) {
				quantity = 1; //Se quantidade for null
			}
			
			Cart cart = (Cart) request.getSession().getAttribute("cart");
			String path = servletContext.getRealPath("/WEB-INF/products.txt");
			Product product = ProductIO.getProduct(productCode, path);
			CartItem cartItem = new CartItem(product, quantity);
			
			cart.updateQuantity(cartItem);
			
			if (cartItem.getQuantity() == 0) {
				cart.removeItem(cartItem);
			}
			
		} else if (action.equals("see")) {
			
			url = "/cart.jsp";
			
		} else if (action.equals("checkout")) {
			
			url = "/checkout.jsp";
			
		}
		
		servletContext.getRequestDispatcher(url).forward(request, response);
		
	}

}
