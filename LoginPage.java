package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class LoginPage
{
	
	SeleniumLib slib;
	
	@FindBy(name="username")
	private WebElement unTxtBx;
	
	@FindBy(name="pwd")
	private WebElement pwdTxtBx;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='ServerSideErrorMessage']//span[@class='errormsg']")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver) 
	{
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}

	//feature
	public void login(String username, String password)
	{
		slib.enterData(unTxtBx, username);
		slib.enterData(pwdTxtBx, password);
		loginBtn.click();
		
		
		
	}
	public void inValid()
	{
		
		slib.validate("Username or Password is invalid. Please try again.", errmsg.getText(), "This is invalid login");
		slib.validate("actiTIME - Login", slib.getPageTitle(), "invalid login please enter valid credentials");
	}
	
	

	public void loginAsUser(String username, String password) {
		
		slib.enterData(unTxtBx, username);
		slib.enterData(pwdTxtBx, password);
		slib.clickbutton(loginBtn);
	}
	
}
