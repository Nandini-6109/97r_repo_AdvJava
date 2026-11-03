package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args)  {
		final String URL="jdbc:mysql://localhost:3306/mydata9597101r";
		String user="root";
		String password="Nandu@6109";
		//String query="insert into student values(102,'chinnu',40,50)";
		//String query="update  student set age=21 where id=101";
		String query="delete from student where id=102";
		//stage-1
		try {
	    Connection connection= DriverManager.getConnection(URL,user,password);
		
	    //stage-2
	    Statement st= connection.createStatement();
		
	    //stage-3
	     int rows=st.executeUpdate(query);
	     System.out.println(rows +"Updated.....");
	     
	    //stage-5
	     connection.close();
	    
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
