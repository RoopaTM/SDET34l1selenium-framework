package com.vtiger.PomRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SDET34l1.genericUtility.JavaLibrary;

public class CreateNewDocumentPage 
{

	@FindBy(name = "notes_title")
	private WebElement documentTitleTxt;

	@FindBy(xpath ="//body[@class='cke_show_borders']")
	private WebElement documentTextarea;

	@FindBy(xpath ="//a[@title='Bold']")
	private WebElement textBoldTollbar;

	@FindBy(xpath ="//a[@title='Italic']")
	private WebElement textItalicTollbar;

	@FindBy(xpath ="//input[@type='file']")
	private WebElement documentPagefileBtn;
	
	@FindBy(xpath ="//b[.='File Information']/../../following-sibling::tr[4]//input[@title='Save [Alt+S]']")
	private WebElement documentpageSaveBtn;
	
	public CreateNewDocumentPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}

	public void documentPageSendTitle(String title) 
	{
		documentTitleTxt.sendKeys(title);
	}

	public void documentPageSendTextAndCopyAll(String textarea) throws InterruptedException 
	{
		JavaLibrary.customWait(documentPagefileBtn, 10, 1000);
		documentTextarea.sendKeys(textarea,Keys.CONTROL+"a");

	}

	public void documentPageBoldAndItalicText() throws InterruptedException 
	{
		JavaLibrary.customWait(textBoldTollbar, 10, 1000);
		textBoldTollbar.click();
		textItalicTollbar.click();
	}
	
	public void documentPageFileUpload(String filePath) throws InterruptedException 
	{
		 documentPagefileBtn.sendKeys(filePath);
		 documentpageSaveBtn.click();
	}
	

	
}
