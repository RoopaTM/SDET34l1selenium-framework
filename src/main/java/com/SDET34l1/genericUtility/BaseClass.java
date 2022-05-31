package com.SDET34l1.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.PomRepository.Homepage;
import com.vtiger.PomRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class contains Implementation of all basic configuration annotations
 */
public class BaseClass 
{

	public JavaLibrary jutil;
	public String un;
	public String pwd ;
	public String timeout;
	public long longtimeout;
	public int randomNumber;
	public WebDriver driver1;
	public LoginPage loginpage;
	public Homepage homepage;
	public ExcelLibrary excelLibrary = new ExcelLibrary();
	public static WebDriver staticdriver;//variable
	
	/**
	 * In this annotation we open the property file,excel file
	 */
	@BeforeSuite(groups = "baseclass")
	public void beforesuit1Test() throws IOException
	{
		
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);
		excelLibrary.openExcel(Iconstantpath.EXCELFILE_PATH);
	}
/**
 * In this annotation it contains normal execution Configuration
 * @throws IOException
 */
	//@Parameters("browser")
	@BeforeClass(groups = "baseclass")
	public void beforeClass1Test(/*String browser*/ ) throws IOException
	{
		
		JavaLibrary jutil = new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);//proprty
		String url = FileLibrary.getDataFromPropertyFile("url");
		un = FileLibrary.getDataFromPropertyFile("un");
		pwd = FileLibrary.getDataFromPropertyFile("pwd");
		timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");
		longtimeout=jutil.stringToLong(timeout);
		randomNumber=jutil.getRandomNumber(1000); 
		
		
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
		staticdriver=driver1;
		WebDriverLibrary.navigateApp(url, driver1);
		WebDriverLibrary.browserSetting(longtimeout, driver1);
		WebDriverLibrary.explicitlyWait(longtimeout, driver1);
		 loginpage = new LoginPage(driver1);
		 homepage = new Homepage(driver1);
	}
	

	
	/**
	 * In this annotation we do login action
	 */
	@BeforeMethod(groups = "baseclass")
	public void beforeMethod1Test()
	{
		loginpage.loginAction(un, pwd);
	}
	
	
	
	/**
	 * In this annotation we do logout action
	 * @throws InterruptedException 
	 */
	@AfterMethod(groups = "baseclass")
	public void afterMethod1Test() throws InterruptedException
	{
		homepage.signOutIconMouseHoverAction(driver1);
	}
	public void afterMethod2Test() throws IOException
	{
		
		excelLibrary.writeIntoExcel(Iconstantpath.EXCELFILE_PATH);
	}
	
	
	
	/**
	 * In this annotation we do closing the browser action
	 */
	@AfterClass(groups = "baseclass")
	public void afterClass1Test()
	{
		WebDriverLibrary.quitbrowser(driver1);
	}
	
	

	
	
	/**
	 * In this annotation close the excel File
	 * @throws IOException
	 */
	@AfterSuite(groups = "baseclass")
	public void afterSuit1Test() throws IOException
	{
		excelLibrary.closeExcel();;
	}
	
}
