package com.rmg.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.SDET34l1.genericUtility.DatabaseLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;
import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataBaseInsertDataTest
{
	 
	 
		
	public static void main(String[] args) throws SQLException, IOException 
	{
		
		JavaLibrary jutil=new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.RMGPROPERTYFILE_PATH);
		String url = FileLibrary.getDataFromPropertyFile("url");
		String username = FileLibrary.getDataFromPropertyFile("username");
		String password = FileLibrary.getDataFromPropertyFile("password");
		int random = jutil.getRandomNumber(1000);
		DatabaseLibrary.openDbConnection(Iconstantpath.DATABASE_PATH+FileLibrary.getDataFromPropertyFile("dName"),username,password);
		DatabaseLibrary.setDataIntoDatabase("insert into project values('TY_PROJ_"+random+"','ROOPAtm','27/04/2022','ERP7','On Going',0)");
		DatabaseLibrary.closeDbConnection();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1= new FirefoxDriver();
		WebDriverLibrary.navigateApp(url, driver1);
		driver1.manage().window().maximize();
		WebDriverLibrary.browserSetting(10, driver1);
		
		
		
	
	
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost:8084");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("crmproject");
	    driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("roopa");
	    WebElement ele = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
	    Select s = new Select(ele);
	    s.selectByIndex(2);
	    driver.findElement(By.xpath("//input[@value='Add Project']")).click();*/
	 
	   


	  
	  
	
	
	  
	  
	   

}
}
