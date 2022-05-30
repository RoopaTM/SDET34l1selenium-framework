package com.vtiger.compainTest;

import org.openqa.selenium.WebDriver;

import com.SDET34l1.genericUtility.JavaLibrary;
import com.vtiger.PomRepository.Homepage;
import com.vtiger.PomRepository.LoginPage;

public class GetterandSettetForListner 
{
	private static GetterandSettetForListner instance;
	public JavaLibrary jutil;
	public String un;
	public String pwd ;
	public String timeout;
	public long longtimeout;
	public int randomNumber;
	public WebDriver driver1;
	public LoginPage loginpage;
	public Homepage homepage;
	
	private GetterandSettetForListner()
	{
		
	}
		public static GetterandSettetForListner getInstance()
		{
			if(instance==null)
			{
				instance=new GetterandSettetForListner();
			}
			return instance;
		}
		
		
		
		public JavaLibrary getJutil()
		{
			return jutil;
		}
		public void setJutil(JavaLibrary jutil)
		{
			this.jutil = jutil;
		}
		public String getUn() 
		{
			return un;
		}
		public void setUn(String un) 
		{
			this.un = un;
		}
		public String getPwd() 
		{
			return pwd;
		}
		public void setPwd(String pwd)
		{
			this.pwd = pwd;
		}
		public String getTimeout() 
		{
			return timeout;
		}
		public void setTimeout(String timeout)
		{
			this.timeout = timeout;
		}
		public long getLongtimeout() 
		{
			return longtimeout;
		}
		public void setLongtimeout(long longtimeout) 
		{
			this.longtimeout = longtimeout;
		}
		public int getRandomNumber()
		{
			return randomNumber;
		}
		public void setRandomNumber(int randomNumber) 
		{
			this.randomNumber = randomNumber;
		}
		public WebDriver getDriver1() 
		{
			return driver1;
		}
		public void setDriver1(WebDriver driver1) 
		{
			this.driver1 = driver1;
		}
		public LoginPage getLoginpage() 
		{
			return loginpage;
		}
		public void setLoginpage(LoginPage loginpage)
		{
			this.loginpage = loginpage;
		}
		
		public void setHomepage(Homepage homepage) 
		{
			this.homepage = homepage;
		}
		
		
		
		
		
	}
	
	

