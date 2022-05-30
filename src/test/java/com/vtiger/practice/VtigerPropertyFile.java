package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SDET34l1.genericUtility.WebDriverLibrary;

public class VtigerPropertyFile
{
	static WebDriver driver1;
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/CommonDta.Properties");
		Properties property = new Properties();
		property.load(file);
		String url = property.getProperty("url");
		String un = property.getProperty("un");
		String pwd = property.getProperty("pwd");
		String timeout = property.getProperty("timeout");
		String browsername = property.getProperty("browsername");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(timeout);
		System.out.println(browsername);
		
		

		long longtimeout = Long.parseLong(timeout);
		driver1=WebDriverLibrary.getDriver();
		WebDriverLibrary.navigateApp(url, driver1);
		WebDriverLibrary.navigateApp(url, driver1);
		WebDriverLibrary.browserSetting(longtimeout, driver1);
		WebDriverLibrary.explicitlyWait(longtimeout, driver1);
		driver1.get(url);
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);
		
		
		
		
		driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
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
