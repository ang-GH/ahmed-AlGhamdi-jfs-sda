package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbDAO.shoesDAO;
import entitys.shoes;

/**
 * Servlet implementation class userShoeList
 */
@WebServlet("/userShoesList")
public class userShoesList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userShoesList() {
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
		shoesDAO dao = new shoesDAO();
		int userId = Integer.parseInt(request.getParameter("userId"));
		System.out.println(userId+" first");
		List<shoes> list = dao.showShoes();
		request.setAttribute("list", list);
		request.setAttribute("userId", userId);
		request.getRequestDispatcher("userShoesList.jsp").forward(request, response);
	}

}
