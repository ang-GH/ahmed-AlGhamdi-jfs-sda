package servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class userPurchases
 */
@WebServlet("/userPurchases")
public class userPurchases extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userPurchases() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		purchasesDAO pDAO = new purchasesDAO();
		shoesDAO sDAO = new shoesDAO();
		
		List<shoes> shoeList = sDAO.showShoes();
		request.setAttribute("shoeList", shoeList);
		
		request.setAttribute("userId", request.getParameter("userId"));
		
		List<purchases> purchaseList = pDAO.showPurchases();
		request.setAttribute("purchaseList", purchaseList);
		request.getRequestDispatcher("userPurchases.jsp").forward(request, response);
	}

}
