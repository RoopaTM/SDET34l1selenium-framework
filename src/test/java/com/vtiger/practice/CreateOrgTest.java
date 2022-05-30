package com.vtiger.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgTest 
{

	public static void main(String[] args) throws IOException
	{
		JavaLibrary jutil = new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);

		String url = FileLibrary.getDataFromPropertyFile("url");
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		String timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");


		long longtimeout=jutil.stringToLong(timeout);	
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
		WebDriverLibrary.navigateApp(url, driver1);
		WebDriverLibrary.browserSetting(longtimeout, driver1);
		WebDriverLibrary.explicitlyWait(longtimeout, driver1);
		driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();
		driver1.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver1.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		WebElement tx = driver1.findElement(By.xpath("//input[@class='detailedViewTextBox' and @name='accountname']"));
		tx.sendKeys("SDET90");
		driver1.findElement(By.xpath("(//input[@class='crmbutton small save' and @title='Save [Alt+S]' and @accesskey='S'])[1]")).click();

		WebElement ver = driver1.findElement(By.xpath("//td[@id='mouseArea_Organization Name']"));

		String val = ver.getText();
		if(val.contains("SDET105"))
	      {
			System.out.println("already exist");
		    
		   }

		 else
		{
			System.out.println("not present");
		}


		/*if(driver.getPageSource().contains("SDET75"))
		{
			System.out.println("already exist");
		}

		else
		{
			System.out.println("not present");
		}

		/*driver.switchTo().alert().accept();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);*/
		WebElement ele = driver1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver1);
		act.moveToElement(ele).perform();
		driver1.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver1.close(); 

	}

}
