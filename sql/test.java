package com.sqltest.mytest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.jdbc.*;

class test
{
	public static void viewTable(Connection con)
	{
		String query="select * from  __files_index_list__;";
		Statement stmt = null;

		try
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
			{
				String fileName = rs.getString("FILENAME");
				String fileHash = rs.getString("CHECKSUM");
				System.out.println(fileName+": "+fileHash);
			}

			if (stmt != null)
			{
				stmt.close();
			}
		}

		catch (SQLException e )
		{
			System.out.println("Something went wrong");
		}
	}

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/javadev";
		String username = "javadev";
		String password = "java=dmv";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password))
		{
			System.out.println("Database connected!");
			viewTable(connection);
		}

		catch (SQLException e)
		{
			throw new IllegalStateException("Cannot connect the database!", e);
		}

	}

}

