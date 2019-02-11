package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class CreateNewTaskPage 
{	
	SeleniumLib slib;
	
	@FindBy(name="customerId")
	private WebElement selectCustmer;
	
	@FindBy(name="projectId")
	private WebElement selectProject;
	
	@FindBy(xpath="//td[@class='listtblcell']//input[@name='task[0].name']")
	private WebElement entertask;
	
	@FindBy(xpath="//td[@class='listtblcell']//input[@name='task[0].deadline']")
	private WebElement dueDate;
	
	@FindBy(xpath="//select[@name='task[0].billingType']")
	private WebElement billableType;
	
	@FindBy(xpath="//td[@class='listtblcell']//input[@name='task[0].markedToBeAddedToUserTasks']")
	private WebElement clickOnChckBox;
	
	@FindBy(css="input[value='Create Tasks']")
	private WebElement clickOntaskBtn;
	
	public CreateNewTaskPage(WebDriver driver)
	{
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	//feature
	public void selectCustmerAndPrjct(String  chooseCustomerName, String chooseProjectName) 
	{
		slib.selectoptionByText(selectCustmer, chooseCustomerName);
		slib.selectoptionByText(selectProject, chooseProjectName);	
	}
	//steps
	public void enterTaskName(String taskName, String billtype)
	{
		slib.enterData(entertask, taskName);
		slib.selectDate(dueDate);
		slib.billingType(billableType, billtype);
		slib.iSleep(3);
		slib.clickCheckbox(clickOnChckBox);
		
	}

	//step
	public void clickOnCreateTaskBtn()
	{
		slib.clickbutton(clickOntaskBtn);
	}
	
}
