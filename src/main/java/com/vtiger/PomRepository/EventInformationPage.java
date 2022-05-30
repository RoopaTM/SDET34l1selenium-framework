package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventInformationPage 
{
	@FindBy(xpath = "//td[.='Event Name']/following-sibling::td[1]")
	private WebElement eventName;
	
	public EventInformationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateEventName() 
	{
		return eventName.getText();
		
	}
}
