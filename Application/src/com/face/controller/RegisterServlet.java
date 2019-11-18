package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Steffythomas
 * @imp1Note perform user registration
 * Date - 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String Username=request.getParameter("Username");
		String Password=request.getParameter("Password");
		String RePassword=request.getParameter("RePassword");
		String Collegename=request.getParameter("Collegename");
		String Email=request.getParameter("Email");
		String Mobilenum=request.getParameter("Mobilenum");
		
		RegisterBO regbo=new RegisterBO();
		regbo.setUsername(Username);
		regbo.setPassword(Password);
		regbo.setRePassword(RePassword);
		regbo.setCollegename(Collegename);
		regbo.setEmail(Email);
		regbo.setMobilenum(Mobilenum);
		
		ConnectionManager con=new ConnectionManager();
		
			
				try {
					RegisterDAO.save(con.getConnection(),regbo);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		
	}

}
