package sagar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Full_Name
 */
public class Full_Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Full_Name() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		/*
		//getting data and printing it sended by RequestDispatcher
		 
		String name= (String) request.getAttribute("fst_name");	
		PrintWriter out = response.getWriter();
		out.print(name);
       */
		
		//getting data and printing it sended by sendRedirect
		String name= (String) request.getParameter("fullName");	
		PrintWriter out = response.getWriter();
		out.print("Hi<br> Welcome "+name);
		
	}

	

}
