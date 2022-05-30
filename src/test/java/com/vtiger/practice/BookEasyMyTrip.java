package com.vtiger.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookEasyMyTrip {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("FromSector_show")).clear();
		driver.findElement(By.id("FromSector_show")).sendKeys("Bangalore(BLR)");
		driver.findElement(By.id("Editbox13_show")).clear();
		driver.findElement(By.id("Editbox13_show")).sendKeys("Delhi(DEL)");

	}

}
