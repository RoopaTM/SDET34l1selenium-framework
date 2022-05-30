package com.vtiger.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchdataFromDB_contactTest
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		JavaLibrary jutil = new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);

		String url = FileLibrary.getDataFromPropertyFile("url");
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		String timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");


		long longtimeout=jutil.stringToLong(timeout);
		int random=jutil.getRandomNumber(1000);
//		ExcelLibrary.openExcel(Iconstantpath.EXCELFILE_PATH);
//		String data = ExcelLibrary.getDataFromExcel("Sheet2", 2, 1)+random;		
//			WebDriver driver1=null;
//			switch(browsername)
//			{
//			case "chrome":
//				WebDriverManager.chromedriver().setup();
//				driver1=new ChromeDriver();
//				break;
//			case "firefox":
//				WebDriverManager.firefoxdriver().setup();
//				driver1=new FirefoxDriver();
//				break;
//			default:
//				System.out.println("Please specify proper browser key");
//				WebDriverManager.chromedriver().setup();
//				driver1=new ChromeDriver();
//				break;
//			}
//
//			WebDriverLibrary.navigateApp(url, driver1);
//			WebDriverLibrary.browserSetting(longtimeout, driver1);
//			WebDriverLibrary.explicitlyWait(longtimeout, driver1);
//			driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//			driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//			driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();
//			driver1.findElement(By.xpath("//a[text()='Contacts']")).click();
//			driver1.findElement(By.xpath("//img[@title='Create Contact...']")).click();
//			driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data+random);
//			driver1.findElement(By.xpath("(//input[@value=\"  Save  \" and @title='Save [Alt+S]' and @name='button' and @accesskey='S'])[1]")).click();
//			
//			
//			
//			
//			
//			
		
		
	}

}
