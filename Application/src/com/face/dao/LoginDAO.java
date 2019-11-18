package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;

public class LoginDAO {
	
		

	public static boolean save(Connection connection, LoginBO logbo) throws SQLException {
		// TODO Auto-generated method stub
		boolean status=false;
		Statement st1=connection.createStatement();
		System.out.println(logbo.getUsername());
		System.out.println(logbo.getPassword());
		String q="select*from reg ";
		ResultSet rs=st1.executeQuery(q);
		while(rs.next())
		{
			if(logbo.getUsername().equals(rs.getString("Username"))&&(logbo.getPassword().equals(rs.getString("Password"))))
			{
				System.out.println("Successfully login");
				status=true;
				
				logbo.setUsername(rs.getString("Username"));
				logbo.setPassword(rs.getString("Password"));
				logbo.setRePassword(rs.getString("RePassword"));
				logbo.setCollegename(rs.getString("Collegename"));
				logbo.setEmail(rs.getString("Email"));
				logbo.setMobilenum(rs.getString("Mobilenum"));
			}
			
		}
		if(status==false) {
			System.out.println("Invalid id");
		}
		return status;
		
	}
}
