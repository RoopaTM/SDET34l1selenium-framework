package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrganizationBtn;
	
	@FindBy(xpath ="//a[@classhdrLink='']")
	private WebElement titleLink;
	
	
	public OrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void organizationPageAction()
	{
		createNewOrganizationBtn.click();

		//WebDriverLibrary.waitUtillElementVisible(titleLink);
		
		
	}

}
