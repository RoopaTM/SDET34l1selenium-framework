package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.WebDriverLibrary;

public class CreateNewContactInformationPage 
{
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement contactFristName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement contactLastName;
	
	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement contactSaveBtn;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement contacttitle;
	
	@FindBy(xpath ="//input[@type='file']")
	private WebElement fileUploadBtn;
	
	
	
	public CreateNewContactInformationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public void contactInformationPageSendFristName(String fristName) 
	{
		contactFristName.sendKeys(fristName);
	}
	
	public void contactInformationPageSendLastName(String lastName) 
	{
		//WebDriverLibrary.waitUtillElementVisible(contactLastName);
		contactLastName.sendKeys(lastName);
		
	}
	
	public void contactInformationPageFileUpload(String filePath)
	{
		fileUploadBtn.sendKeys(filePath);;
		
	}
	
	public void contactInformationPageSaveLastName() 
	{
		contactSaveBtn.click();
		WebDriverLibrary.waitUtillElementVisible(contacttitle);
	}

}
