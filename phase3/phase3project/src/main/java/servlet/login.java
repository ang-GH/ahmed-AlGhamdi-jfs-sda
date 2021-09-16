package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbDAO.usersDAO;
import entitys.users;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String name = request.getParameter("name");
		String password =request.getParameter("password");
		String adminPass = "admin";
		
		usersDAO dao = new usersDAO(); 
		users user = dao.userLogin(name,password);
		
		if(user == null) {
			System.out.println("no entery ;)");
			
		}else if (name.equals(adminPass) && password.equals(adminPass)) {
			request.getRequestDispatcher("adminPage.jsp").forward(request, response);
			
		}else if (user != null) {
			request.setAttribute("userId", user.getId());
			request.getRequestDispatcher("userPage.jsp").forward(request, response);
			
		}
	}

}
