package com.actitime.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class EditCustInfoPage
{
	SeleniumLib slib;
	@FindBy(css="input[value='Delete This Customer ")
	private WebElement deletThisCustomerBtn;
	@FindBy(id="deleteButton")
	private WebElement deleteCustConfirmBtn;
	
	public EditCustInfoPage(WebDriver driver) {
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	//feature
	public void deleteCustomer()
	{
		slib.clickbutton(deletThisCustomerBtn);
		slib.clickbutton(deleteCustConfirmBtn);
	}

}
