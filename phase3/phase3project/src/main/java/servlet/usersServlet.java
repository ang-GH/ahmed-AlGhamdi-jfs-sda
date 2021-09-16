package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dbDAO.usersDAO;
import entitys.users;


@WebServlet("/usersServlet")
public class usersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public usersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usersDAO dao = new usersDAO();
		
		List<users> list = dao.showUsers();
		request.setAttribute("list", list);
		request.getRequestDispatcher("usersList.jsp").forward(request, response);
	}

}
