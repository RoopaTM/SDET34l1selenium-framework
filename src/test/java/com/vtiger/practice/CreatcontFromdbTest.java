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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatcontFromdbTest 
{

	public static void main(String[] args) throws SQLException 
	{
		
		
		String url=null,username=null,password=null,timeout=null,browsername=null;
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vtiger", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from vtiger");
		while(result.next())
		{
			url = result.getString("url");
			username=result.getString("username");
			password=result.getString("password");
			timeout=result.getString("timeout");
			browsername=result.getString("browsername");
		}
		long longtimeout = Long.parseLong(timeout);
		WebDriver driver1=null;
		switch(browsername)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver1=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver1=new FirefoxDriver();
			break;
		default:
			System.out.println("Please specify proper browser key");
			WebDriverManager.chromedriver().setup();
			driver1=new ChromeDriver();
			break;
		}

		driver1.get(url);
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();
		driver1.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver1.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		String fristname="sdet34l";
		String lastname="ll1";
		driver1.findElement(By.name("firstname")).sendKeys(fristname);
		driver1.findElement(By.name("lastname")).sendKeys(lastname);
		driver1.findElement(By.xpath("(//input[@title='Save [Alt+S]' and @name='button' and @accesskey='S'])[1]")).click();
		WebElement actualfrist = driver1.findElement(By.id("dtlview_First Name"));
		WebElement actuallast = driver1.findElement(By.id("dtlview_Last Name"));
		
		if(actualfrist.getText().equalsIgnoreCase(fristname) && actuallast.getText().equalsIgnoreCase(lastname))
		{
			System.out.println("contact created");
		}
		
	}
}
