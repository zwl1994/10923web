package com.hand.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.FilmDao;
import com.hand.dao.FilmDaoImpl;
import com.hand.util.ConnectionFaction;

public class FilmServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
			FilmDao fd = new FilmDaoImpl();
			Connection conn = ConnectionFaction.getInstance().makecConnection();
			
			try {
				ResultSet rs = fd.select(conn);
				request.setAttribute("set", rs);
				
				RequestDispatcher requestDispatcher = this.getServletContext().getRequestDispatcher("/02/film.jsp");
				requestDispatcher.forward(request, response);
				
//				ResultSet rs1 = fd.select(conn);
//				request.setAttribute("set1", rs1);
//				
//				RequestDispatcher requestDispatcher1 = this.getServletContext().getRequestDispatcher("/02/newfilm.jsp");
//				requestDispatcher1.forward(request, response);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			try {
//				ResultSet rs = fd.select(conn);
//				while(rs.next()){
//					int id = rs.getInt("film_id");
//					String title = rs.getString("title");
//					String des = rs.getString("description");
//					String lang = rs.getString("name");
//					System.out.print(id+" ");
//					System.out.print(title+" ");
//					System.out.print(des+" ");
//					System.out.print(lang+" ");
//					System.out.println();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
