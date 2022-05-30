package com.vtiger.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SDET34l1.genericUtility.WebDriverLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutescriptTest 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverLibrary.initailzeJs(driver);
		driver.manage().window().maximize();
		WebDriverLibrary.navigateApplicationThroughJs("http://localhost:8888");
		WebDriverLibrary.enterDataThroughJs(driver.findElement(By.name("user_name")),"admin");
		WebDriverLibrary.enterDataThroughJs(driver.findElement(By.name("user_password")),"admin");
		WebDriverLibrary.clickThroughJs(driver.findElement(By.id("submitButton")));
		WebDriverLibrary.scrollTillElemet(driver.findElement(By.xpath("//b[contains(.,'Upcoming Activities')]")));
		String file = new JavaScriptExecutescriptTest().getClass().getName();
		WebDriverLibrary.takesScreenshot(file, driver);

	}

}
