package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.WebDriverLibrary;

public class SearchPage 
{

	@FindBy(id = "fcol0")
	private WebElement searchdropDown;
	
	@FindBy(xpath="//select[@class='repBox']")
	private WebElement searchForEqualsdropDown;
	
	@FindBy(xpath="//input[@type='text' and @class='repBox']")
	private WebElement searchcontactNameTxt; 
	
	@FindBy(xpath="//table[@class='searchUIAdv3 small']//input[@class='crmbutton small create']")
	private WebElement searchNowBtn;
	
	public SearchPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void searchForlastNamedropdown(String visibleText)
	{
		WebDriverLibrary.selectDropDown(visibleText, searchdropDown);
	}
	
	public void searchForEqualsdropdown(String Text)
	{
		WebDriverLibrary.selectDropDown(searchForEqualsdropDown, Text);
	}
	
	public void searchForcontactName(String sendData)
	{
		searchcontactNameTxt.sendKeys(sendData);
	}
	
	public void searchNowAction()
	{
		searchNowBtn.click();
	}
	
	
}
