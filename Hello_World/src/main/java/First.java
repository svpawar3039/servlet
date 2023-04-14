

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;  


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @return 
	 * @return 
	 * @return 
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected   void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//set which type of data should be in our page
		response.setContentType("text/html");
		
		//create printwriter object 
		PrintWriter out = response.getWriter();
		
		//getting all form data into variables
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
       /* 
		//sending data using RequestDispatcher
		 
    	request.setAttribute("fst_name",FirstName);
		RequestDispatcher rd=request.getRequestDispatcher("full");
		rd.forward(request, response);
	  */
	
		//sending data using sendRedirect
		
		response.sendRedirect("full?fullName="+firstName+lastName);
		
	}
}

	
	
