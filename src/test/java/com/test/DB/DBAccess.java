package com.test.DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {

	public static void main(String[] args)  {
//com.mysql.cj.jdbc.Driver

		Connection connection = null;

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","Welcome@01");
			Statement st = connection.createStatement();
			ResultSet r =st.executeQuery("select * from employees");
			while(r.next()) {
				String email = r.getString("EMAIL");
				System.out.println(email);
				int id = r.getInt("Employee_ID");
				System.out.println(id);
				
				 Date date = r.getDate("HIRE_DATE");
				 System.out.println(date);
			}
			
			
			
			
		}
		catch(Exception e) {
			System.out.println("Main catch");
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
