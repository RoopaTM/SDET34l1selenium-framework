package com.vtiger.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.WebDriverLibrary;

public class CreatingNewProductPage
{
	@FindBy(name="productname")
	private WebElement productNameText;
	
	@FindBy(xpath ="//span[@class='lvtHeaderText']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement productSaveBtn;
	
	public CreatingNewProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public void productInformationPageSendName(String lastName) 
	{
		productNameText.sendKeys(lastName);
	}
	
	public void productInformationPageClickOnsave() 
	{
		productSaveBtn.click();
		WebDriverLibrary.waitUtillElementVisible(title);
	}
	
}
