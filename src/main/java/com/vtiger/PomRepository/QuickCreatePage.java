package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCreatePage 
{
	@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='subject']")
	private WebElement eventSendData;

	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement eventSaveBtn;	

	public QuickCreatePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void quickEventSendEventName(String eventName)
	{
		eventSendData.sendKeys(eventName);	
	}
	
	public void quickeventsavePage()
	{
		eventSaveBtn.click();	
	}
	
	
}
