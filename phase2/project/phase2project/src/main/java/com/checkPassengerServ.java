package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkPassengerServ
 */
@WebServlet("/checkPassengerServ")
public class checkPassengerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkPassengerServ() {
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
		String password = request.getParameter("password");
		
		if(name.equals(password)) {
			RequestDispatcher requestDS = request.getRequestDispatcher("flightSerch.jsp");
			requestDS.forward(request, response);
		}else {
			RequestDispatcher requestDS = request.getRequestDispatcher("passengerPage.html");
			PrintWriter out = response.getWriter();
			out.print("<html><body><p style= 'color=red'>invalid user</p></body></html>");
			requestDS.include(request, response);
			
		}
		
	}

}
