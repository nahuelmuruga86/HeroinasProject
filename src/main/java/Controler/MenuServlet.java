package Controler;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import View.NewJ;



/**
 * Servlet implementation class MenuServlet
 */
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MenuServlet() {
       super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Especificamos Formato de respuesta
		
		PrintWriter salida = response.getWriter();
		
		//Generar Respuesta de la peticion
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/Login");
		
		
		
				
				//salida.print(login.jsp);
		
		/*
		salida.println("<html><Body>");
		
		salida.println("<h1> Esto es una prueba<h1>");
		
		salida.println("<h2>Fecha y hora actuales</h2>"+ new Date());
		
		salida.println("</body></html>");
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
