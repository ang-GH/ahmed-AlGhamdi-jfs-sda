package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbDAO.purchasesDAO;
import dbDAO.shoesDAO;
import entitys.purchases;
import entitys.shoes;

/**
 * Servlet implementation class buyShoe
 */
@WebServlet("/buyShoe")
public class buyShoe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyShoe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int shoeId = Integer.parseInt(request.getParameter("shoeId"));
		int userId = Integer.parseInt(request.getParameter("userId"));
		shoesDAO dao = new shoesDAO();
		shoes shoe = dao.getShoeById(shoeId);
		
		
		System.out.println(userId+" secund");
		request.setAttribute("shoe", shoe);
		request.setAttribute("userId", userId);
		request.getRequestDispatcher("buyShoe.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		int shoeId = Integer.parseInt(request.getParameter("shoeId"));
		
		System.out.println(userId+" therd");
		purchasesDAO dao = new purchasesDAO();
		dao.addPurchase(userId, shoeId);
		request.getRequestDispatcher("userPage.jsp").forward(request, response);
		
	}

}
