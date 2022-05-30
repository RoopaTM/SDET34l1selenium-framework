package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.WebDriverLibrary;

public class CreateNewOrgInfoPage 
{
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement newOrgName;
	
	@FindBy(name="industry")
	private WebElement industryNameDropdown;
	
	@FindBy(name="accounttype")
	private WebElement accountTypeDropdown;
	
	@FindBy(xpath="//input[@accesskey='S']")
	private WebElement savebtn;
	
	public CreateNewOrgInfoPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	public void orgLastName(String lastName)
	{
		newOrgName.sendKeys(lastName);
	}
	
	public void industryNameOfOrg(String industryName )
	{
		WebDriverLibrary.selectDropDown(industryName, industryNameDropdown);

	}
	public void accountTypeOfOrg(String accountType)
	{
		WebDriverLibrary.selectDropDown(accountTypeDropdown, accountType);

	}
	public void saveBtnToOrg()
	{
	newOrgName.click();
	
	}
	
}
