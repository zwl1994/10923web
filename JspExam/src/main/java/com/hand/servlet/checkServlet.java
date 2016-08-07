package com.hand.servlet;

import com.hand.entity.User;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hand.service.checkService;

public class checkServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 7381169134016556647L;
	private checkService cku = new checkService();

	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		
		
		if(uname == null ){
			request.setAttribute("msg", "用户名为空！");
			request.getRequestDispatcher("/01/error.jsp").forward(request, response);
		}else{
			User user = new User();
			user.setName(uname);
			
			boolean b = cku.check(user);
			if(b)
				request.getRequestDispatcher("/01/success.jsp").forward(request, response);
			else{
				request.getRequestDispatcher("/01/error.jsp").forward(request, response);
			}
		}
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
