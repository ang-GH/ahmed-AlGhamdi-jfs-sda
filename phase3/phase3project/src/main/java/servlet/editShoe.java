package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbDAO.shoesDAO;
import entitys.shoes;

/**
 * Servlet implementation class editShoe
 */
@WebServlet("/editShoe")
public class editShoe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public editShoe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		shoesDAO dao = new shoesDAO();
		shoes shoe = dao.getShoeById(id);
		request.setAttribute("shoe", shoe);
		request.getRequestDispatcher("editShoe.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String sName = request.getParameter("shoeName");
		String sDescription = request.getParameter("description");
		int sPrice = Integer.parseInt(request.getParameter("price"));
		shoesDAO dao = new shoesDAO();
		dao.editShoeById(id, sName, sDescription, sPrice);
		request.getRequestDispatcher("shoesList.jsp").forward(request, response);
	}

}
