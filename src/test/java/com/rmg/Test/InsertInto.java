package com.rmg.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.SDET34l1.genericUtility.DatabaseLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertInto
{

	public static void main(String[] args) throws SQLException, IOException 
	{
		
		JavaLibrary jutil=new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.RMGPROPERTYFILE_PATH);
		String url = FileLibrary.getDataFromPropertyFile("url");
		String username = FileLibrary.getDataFromPropertyFile("username");
		String password = FileLibrary.getDataFromPropertyFile("password");
		int random = jutil.getRandomNumber(1000);
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		DatabaseLibrary.openDbConnection(Iconstantpath.DATABASE_PATH+FileLibrary.getDataFromPropertyFile("dName"),un,pwd);
		DatabaseLibrary.setDataIntoDatabase("insert into project values('TY_PROJ_"+random+"','ROOPAtm','27/04/2022','ERP7','On Going',0)");
		DatabaseLibrary.closeDbConnection();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1= new FirefoxDriver();
		WebDriverLibrary.navigateApp(url, driver1);
		driver1.manage().window().maximize();
		WebDriverLibrary.browserSetting(10, driver1);
	
		
		
		
		
		
		
		
		
	
	/*DriverManager.registerDriver(driver);
	Connection connt = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
	Statement stmnt = connt.createStatement();
	int result = stmnt.executeUpdate("insert into project values('TY_PROJ_009','ROOPAtm','27/04/2022','ERP7','On Going',0)");
	if(result==1)
	{
		System.out.println("data inserted");
	}
	else
	{
		System.out.println("data is not inserted");
	}*/
	
	
	driver1.findElement(By.xpath("//input[@id='usernmae']")).sendKeys(username);
	driver1.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(password);
	driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
	driver1.findElement(By.xpath("//a[text()='Projects']")).click();
	List<WebElement> ele = driver1.findElements(By.xpath("//td[2]"));
	for(int i=ele.size()-1;i>=0;i--)
	{
		WebElement get= ele.get(i);
		String text = get.getText();
		if(text.contentEquals("ERP5"))
		{
			System.out.println("project added");
		}
		else
		{
			System.out.println("project is not added");
		}
	}

	}

}
