package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;

public class Homepage
{

	@FindBy(id ="qccombo")
	private WebElement createEventdropDown;
	
	@FindBy(xpath ="//a[.='Organizations']")
	private WebElement OrganizationsLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstrationIcon;
	
	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement signOutLnk;
	
	@FindBy(xpath = "//a[.='Documents']")
	private WebElement documentLink;
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement contactLink;
	
	@FindBy(linkText = "More")
	private WebElement moreDropdown;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignsTab;
	
	@FindBy(linkText = "Products")
	private WebElement productTab;
	
	
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homePageOrganizationAction() throws InterruptedException
	{
		JavaLibrary.customWait(OrganizationsLink, 10,1000);
		OrganizationsLink.click();
		
	}
		
	public void homePageDocumentLink() 
	{
		documentLink.click();
	}
	
	public void homePageProductLink() 
	{
		productTab.click();
	}
	
	public void HomePageContactLink() //throws InterruptedException 
	{
		//JavaLibrary.customWait(contactLink, 10, 1000);
		contactLink.click();
	}
	
	public void clickCampaign(WebDriver driver) throws InterruptedException
	{
	
		WebDriverLibrary.mouseHoverOnTheElement(moreDropdown, driver);
		JavaLibrary.customWait(campaignsTab, 10, 1000);
		campaignsTab.click();
		
		
	}
	
	public void clickQuickEventdropdown(String visibleText)
	{
		WebDriverLibrary.selectDropDown(visibleText, createEventdropDown);
	}
	
	public void signOutIconMouseHoverAction(WebDriver driver) throws InterruptedException 
	{
		//WebDriverLibrary.initializeActions(driver);
		WebDriverLibrary.mouseHoverOntheElement(adminstrationIcon, driver);
		signOutLnk.click();
	}

}
