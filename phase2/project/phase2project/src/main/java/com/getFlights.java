package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getFlights
 */
@WebServlet("/getFlights")
public class getFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		flightsDAO f = new flightsDAO();
//		List<flightsList> list = f.showFlights();
//		request.setAttribute("list", list);
//		request.getRequestDispatcher("displayFlights.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		flightsList flight= new flightsList() ;
		flight.setAirportName(request.getParameter("t1"));
		flight.setFrom_c(request.getParameter("t2"));
		flight.setTo_c(request.getParameter("t3"));
		flight.setfTime(request.getParameter("t4"));	
		flight.setfPrice(request.getParameter("t5"));
		
		System.out.println(request.getParameter("t5"));
		
		flightsDAO fs = new flightsDAO();
		fs.store(flight);
		request.getRequestDispatcher("addFlight.jsp").forward(request, response);
		
	}

}
