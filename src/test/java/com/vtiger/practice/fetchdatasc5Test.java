package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetchdatasc5Test {

	public static void main(String[] args) throws SQLException 
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connt = DriverManager.getConnection("jdbc:mysql://localhost:3306/testy", "root", "root");
		Statement stmnt = connt.createStatement();
		String qyery = "select * from testy;";
		ResultSet res = stmnt.executeQuery(qyery);

		while(res.next())
		{

			String fetch = res.getString(2);
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1 = new FirefoxDriver();
			driver1.get("http://localhost:8888");
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver1.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click(); 
			driver1.findElement(By.linkText("Organizations")).click();
			driver1.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			WebElement tx = driver1.findElement(By.xpath("//input[@class='detailedViewTextBox' and @name='accountname']"));
			tx.sendKeys(fetch);
			driver1.findElement(By.xpath("(//input[@class='crmbutton small save' and @title='Save [Alt+S]' and @accesskey='S'])[1]")).click();
			if(res.equals(fetch))
			{
				System.out.println("present");

			}

		}
	}
}

