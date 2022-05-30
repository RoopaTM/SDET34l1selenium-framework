package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;

public class ContactPage 
{
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement contactLastName;

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createNewContactBtn;

	
	@FindBy(xpath = "//td[@id='alpha_3']")
	private WebElement clickOnAlphbetBtn;
	
	@FindBy(xpath = "//input[@name='account_name']/..//img[@alt='Select']")
	private WebElement selectContactBtn;

	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement saveContactBtn;
	
	@FindBy(xpath ="//a[.='Go to Advanced Search']")
	private WebElement advanceSearchLink;
	
	@FindBy(xpath="//input[@name='search_text']")
    private WebElement sendDataToSearchTxt;
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	private WebElement searchNowBtn;
	
	@FindBy(id="bas_searchfield")
	private WebElement dropDown;
    
	public ContactPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	public void clickOnAlphaBet()
	{
		clickOnAlphbetBtn.click();
	}
	
	public void contactPageAction() throws InterruptedException
	{
		JavaLibrary.customWait(createNewContactBtn, 10, 1000);
		createNewContactBtn.click();
	}
	

	public void contactSelectClickAction()
	{
		selectContactBtn.click();	
	}
	public void contactSaveAction() throws InterruptedException
	{
		saveContactBtn.click();	
	}

	public void contactLastNameAction(String contactName)
	{
		contactLastName.sendKeys(contactName);	
	}
	
	public void selectDropDown(String visibletext)
	{
		WebDriverLibrary.selectDropDown(visibletext, dropDown);
	}

	public void clickAsdvanceSearchLink() 
	{
		advanceSearchLink.click();	
	}
	
	public void sendDataToText(String contact)
	{
		sendDataToSearchTxt.sendKeys(contact);
	}
	
	public void searchNowButton()
	{
		searchNowBtn.click();
	}
	
	

}
