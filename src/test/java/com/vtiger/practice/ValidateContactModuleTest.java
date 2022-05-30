package com.vtiger.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateContactModuleTest
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		JavaLibrary jutil = new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);
		String url = FileLibrary.getDataFromPropertyFile("url");
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		String timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");

		long longtimeout=jutil.stringToLong(timeout);
//		int random=jutil.getRandomNumber(1000);
//		ExcelLibrary.openExcel(Iconstantpath.EXCELFILE_PATH);
//		String cname = ExcelLibrary.getDataFromExcel("Org", 2, 1)+random;
//		System.out.println(cname);
//		WebDriver driver1=null;
//		switch(browsername)
//		{
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver1=new ChromeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver1=new FirefoxDriver();
//			break;
//		default:
//			System.out.println("Please specify proper browser key");
//			WebDriverManager.chromedriver().setup();
//			driver1=new ChromeDriver();
//			break;
//		}
//
//
//		WebDriverLibrary.navigateApp(url, driver1);
//		WebDriverLibrary.browserSetting(longtimeout, driver1);
//		WebDriverLibrary.explicitlyWait(longtimeout, driver1);
//		driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();
//
//		System.out.println(driver1.getTitle());
//
//		if(driver1.getTitle().contains("Home"))
//		{
//			ExcelLibrary.setCellvalue("Contact", 8, 6,"homepage is displayed");
//			ExcelLibrary.setCellvalue("Contact", 8, 7,"Pass");
//		}
//
//
//		driver1.findElement(By.linkText("Contacts")).click();
//		System.out.println(driver1.getTitle());
//		if(driver1.getTitle().equals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM"))
//		{
//			ExcelLibrary.setCellvalue("Contact", 9, 6,"contact page is displayed");
//			ExcelLibrary.setCellvalue("Contact", 9, 7,"Pass");
//		}
//
//
//		driver1.findElement(By.xpath("//img[@title='Create Contact...' and @src='themes/softed/images/btnL3Add.gif']")).click();
//		if(driver1.getTitle().contains("Contacts"))
//		{
//			ExcelLibrary.setCellvalue("Contact", 10, 6,"create new contact page is displayed");
//			ExcelLibrary.setCellvalue("Contact", 10, 7,"Pass");
//		}
//
//
//		driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys(cname);
//		driver1.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		//WebElement lname = driver1.findElement(By.id("dtlview_Last Name"));
//		WebElement admin = driver1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		Actions act = new Actions(driver1);
//		act.moveToElement(admin).perform();
//		driver1.findElement(By.linkText("Sign Out")).click();
//
//		System.out.println(driver1.getCurrentUrl());
//		if(driver1.getCurrentUrl().contains("Login"))
//		{
//			ExcelLibrary.setCellvalue("Contact", 12, 6,"login page is displayed");
//			ExcelLibrary.setCellvalue("Contact", 12, 7,"Pass");
//			
//		}
//		ExcelLibrary.writeIntoExcel(Iconstantpath.EXCELFILE_PATH);
//		ExcelLibrary.closeExcel();

	}

}
