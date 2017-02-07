package fr.imie.gitn1.bdd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connect {

	public void connect()
	{
		String url = "jdbc:mysql://localhost:3306/git";
		String username = "java";
		String password = "password";
		
		System.out.println("Connecting database ...");
		
		try(Connection connection = (Connection) DriverManager.getConnection(url, username, password))
		{
			System.out.println("Database connected");
		}catch(SQLException e)
		{
			throw new IllegalStateException("Cannot connect to database", e);
		}
	}
	
}


