package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage 
{
	@FindBy(xpath="//span[@id='dtlview_Organization Name']")
	private WebElement excpectedOrgname;	


public OrganizationInformationPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public String organizationInformationPageAction() 
{
	 return excpectedOrgname.getText();	
}
}
