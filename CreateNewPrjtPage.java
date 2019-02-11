package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.actitime.generics.SeleniumLib;

public class CreateNewPrjtPage 
{
	SeleniumLib slib;
	
	@FindBy(name="customerId")
	private WebElement selectcustomerName;
	
	@FindBy(name="name")
	private WebElement createProject;
	
	@FindBy(name="createProjectSubmit")
	private WebElement prjtSubmitBtn;
	
	

	public CreateNewPrjtPage(WebDriver driver)
	{
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}


	public void selectCust(String customerNametxt)
	{
		slib.selectoptionByText(selectcustomerName, customerNametxt);
	}
	
	public void createProject(String projectName)
	{
		slib.enterData(createProject, projectName);
	}
	
	public void clickOnCreatePrjctBtn()
	{
		slib.clickbutton(prjtSubmitBtn);
	}
}
