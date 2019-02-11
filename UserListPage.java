package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class UserListPage extends BasePage
{
	SeleniumLib slib;
	
	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement clickOnUserlink;
	
	@FindBy(className="successmsg")
	private WebElement successmsg;
	
	@FindBy(xpath="//a[text()='Sharma, Amit (Amit_Sharma)']")
	private WebElement deleteUser;
	
	@FindBy(css="input[value*='Delete This User']")
	private WebElement deleteUserBtn;
	
	public UserListPage(WebDriver driver) 
	{
		super(driver);
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	
	//step
	public void clickOnNewUserLink()
	{
		clickOnUserlink.click();
	}

	//step 
	public void verifyUser()
	{
		slib.validateElementDisplayed(successmsg, "user created");
	}
	public void deleteThisUser()
	{
		deleteUser.click();
		slib.clickbutton(deleteUserBtn);
		slib.popHnandle();
	}
}
