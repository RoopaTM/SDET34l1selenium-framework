package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Vtigersc6Test {

	public static void main(String[] args) throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connt = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stmnt = connt.createStatement();
		String qyery = "select project_name,status from project";
		ResultSet res = stmnt.executeQuery(qyery);
		while(res.next())
		{


			System.out.println(res.getString(1)+res.getString(2));
		}

	}
}
