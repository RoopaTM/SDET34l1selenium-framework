package com.vtiger.practice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.SDET34l1.genericUtility.DatabaseLibrary;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DbConntnTest {
	static String var;
	static WebDriver driver1=null;
	public static void main(String[] args) throws SQLException, IOException 
	{
		JavaLibrary jutil=new JavaLibrary();
//		ExcelLibrary.openExcel(Iconstantpath.RMGEXCEL_PATH);
//		String projectName = ExcelLibrary.getDataFromExcel("project", 0, 1);
//		FileLibrary.openPropertyFile(Iconstantpath.RMGPROPERTYFILE_PATH);
//		String url = FileLibrary.getDataFromPropertyFile("url");
//		String username = FileLibrary.getDataFromPropertyFile("username");
//		String password = FileLibrary.getDataFromPropertyFile("password");
//		int random = jutil.getRandomNumber(1000);
//		String un = FileLibrary.getDataFromPropertyFile("un");
//		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
//		DatabaseLibrary.openDbConnection(Iconstantpath.DATABASE_PATH+FileLibrary.getDataFromPropertyFile("dName"),un,pwd);
//		WebDriverManager.firefoxdriver().setup();
//
//		driver1 = new FirefoxDriver();
//		driver1.get(url);
//		driver1.manage().window().maximize();
//		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver1.findElement(By.xpath("//input[@id='usernmae']")).sendKeys(username);
//		driver1.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(password);
//		driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
//
//		driver1.findElement(By.xpath("//a[text()='Projects']")).click();
//		driver1.findElement(By.xpath("//span[text()='Create Project']")).click();
//		driver1.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projectName);
//		driver1.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("roopa");
//		WebElement projectstatusdropdown = driver1.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select"));
//		Select select = new Select(projectstatusdropdown);
//		select.selectByVisibleText("On Goging");
//		driver1.findElement(By.xpath("//input[@value='Add Project']")).click();
//		try
//		{
//			/*Driver driver = new Driver();			
//			DriverManager.registerDriver(driver);
//			connt = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
//			Statement stmnt = connt.createStatement();
//			ResultSet res = stmnt.executeQuery(qyery);*/
//			String query = "select project_name from project";
//			 boolean res = DatabaseLibrary.validateData(query,"project_name",projectName);
//			if(res) 
//			{
//				System.out.println("tc is pass");
//			}
//			else
//			{
//				System.out.println("Tc is fail");
//			}
//		}
//		finally
//		{
//
//			DatabaseLibrary.closeDbConnection();
//			ExcelLibrary.closeExcel();

		}

	}





















/*while(res.next())
		{
			 try {
				var = res.getString("Project_name");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if(var.equals("crmproject"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}*/
