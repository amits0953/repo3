package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class CreateNewCustPage 
{
	SeleniumLib slib;
	
	@FindBy(name="name")
	private WebElement custNameTxtBx;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createcustSubmitBtn;
	
	public CreateNewCustPage(WebDriver driver)
	{
		slib=new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}

	
	//feature
	public void createCustomer(String customerName)
	{
		slib.enterData(custNameTxtBx, customerName);
		slib.clickbutton(createcustSubmitBtn);
	}
	

}
