package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.JavaLibrary;

public class ProductPage 
{

	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement createNewProductBtn;
	
	public ProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void productPageAction() throws InterruptedException
	{
		//JavaLibrary.customWait(createNewProductBtn, 10, 1000);
		createNewProductBtn.click();	
	}
		
	
}
