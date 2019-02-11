package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class CreateNewUserPage
{
	SeleniumLib slib;
	
	@FindBy(name="username")
	private WebElement enterUserName;
	
	@FindBy(name="passwordText")
	private WebElement enterPasswordText;
	
	@FindBy(name="passwordTextRetype")
	private WebElement enterPasswordTextRetype;

	@FindBy(name="firstName")
	private WebElement enterfirstName;
	
	@FindBy(name="lastName")
	private WebElement enterlastName;
	
	@FindBy(name="email")
	private WebElement enterEmail;
	
	@FindBy(xpath="//input[contains(@value,'Create User')]")
	private WebElement clickOnCreateUserBtn;
	
	public CreateNewUserPage(WebDriver driver)
	{
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void createNewUser(String userName,String passWord,String confirmPassword,String firstName,String lastName,String email)
	{
		slib.enterData(enterUserName, userName);
		slib.enterData(enterPasswordText, passWord);
		slib.enterData(enterPasswordTextRetype, confirmPassword);
		slib.enterData(enterfirstName, firstName);
		slib.enterData(enterlastName, lastName);
		slib.enterData(enterEmail, email);
		slib.clickbutton(clickOnCreateUserBtn);
	}

}
