package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class EditProjInfoPage 
{
	SeleniumLib slib;
	
	@FindBy(css="input[value*='Delete This ']")
	private WebElement deletePrjtBtn;
	
	@FindBy(id="deleteButton")
	private WebElement deleteCofirmButton;
	
	public EditProjInfoPage(WebDriver driver)
	{
	slib= new SeleniumLib(driver);
	PageFactory.initElements(driver, this);
	}

	//feature
	public void deleteProjectBtn()
	{
		slib.clickbutton(deletePrjtBtn);
		slib.clickbutton(deleteCofirmButton);
	}
	

	
}
