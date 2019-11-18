package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Steffythomas
 * @imp1Note perform user registration
 * Date - 14-11-2019
 * @category controller class
 */


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String Username=request.getParameter("Username");
		String Password=request.getParameter("Password");
		
		
		
		LoginBO logbo=new LoginBO();
		RegisterBO regbo=new RegisterBO();
		
		
		
		logbo.setUsername(Username);
		logbo.setPassword(Password);
		ConnectionManager con=new ConnectionManager();
		try {
			boolean status=LoginDAO.save(con.getConnection(),logbo);
			
			
			if(status==true) {
			
			
			
			ArrayList<String> list=new ArrayList<String>();
			list.add(logbo.getUsername());
			list.add(logbo.getPassword());
			list.add(logbo.getRePassword());
			list.add(logbo.getCollegename());
			list.add(logbo.getEmail());
			list.add(logbo.getMobilenum());
			
			request.setAttribute("data", list);
			 
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("WelcomePage.jsp");
			requestDispatcher.forward(request, response);
			}
			else {
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login.jsp");
				requestDispatcher.forward(request, response);

			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
