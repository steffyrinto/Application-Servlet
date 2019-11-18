package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;

public class RegisterDAO {

	public static void save(Connection connection, RegisterBO regbo) throws SQLException {
		Statement st=connection.createStatement();
		String query="insert into reg values('"+regbo.getUsername()+"','"+regbo.getPassword()+"','"
		+regbo.getRePassword()+"','"+regbo.getCollegename()+"','"+regbo.getEmail()+"','"+regbo.getMobilenum()+"')";
		int result=st.executeUpdate(query);
		if(result==1) {
			System.out.println("Data inserted successfully");
		}
		else {
			System.out.println("Inserted Failed");
		}
	}

	
}
