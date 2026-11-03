package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatements {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata9597101r";
		String user="root";
		String password="Nandu@6109";
		String query="insert into student values(?,?,?,?)";
		//stage-1
				try {
			    Connection connection= DriverManager.getConnection(URL,user,password);
				
			    //stage-2
			    PreparedStatement ps= connection.prepareStatement(query);
			    Scanner sc=new Scanner(System.in);
			    int n=0;
			    while(n<5) {
			    System.out.println("Enter Id:  ");
			    int id=Integer.parseInt(sc.nextLine());
			    System.out.println("Enter Name:  ");
			    String name=sc.nextLine();
			    System.out.println("Enter Marks:  ");
			    int marks=Integer.parseInt(sc.nextLine());
			    System.out.println("Enter Age:  ");
			    int age=Integer.parseInt(sc.nextLine());
			    
			    ps.setInt(1, id);
			    ps.setString(2, name);
			    ps.setInt(3, marks);
			    ps.setInt(4, age);
			    }
			    //stage-3
			     int rows=ps.executeUpdate();
			     System.out.println(rows +"Inserted.....");
			     
			    //stage-5
			     connection.close();
			     ps.close();
			    
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}

}
