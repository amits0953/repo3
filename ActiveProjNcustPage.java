package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class ActiveProjNcustPage extends BasePage
{
	SeleniumLib slib;
	
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustBtn;
	
	@FindBy(className="successmsg")
	private WebElement successmsg;
	
	@FindBy(name="selectedCustomer") 
	private WebElement custDrpdwn;
	
	@FindBy(css="input[value*='Show']") 
	private WebElement custShowBtn;
	
	@FindBy(xpath="//td[starts-with(@id,'customerNameCell')]//a[contains(@href,'customerId')]")
	private WebElement customerNamelink;
	
	@FindBy(css="input[value='Create New Project']")
	private WebElement createNewPrjtBtn;
	
	@FindBy(xpath="//td[starts-with(@id,'projectNameCell')]//a[contains(@href,'projectId')]")
	private WebElement projectNameLink;
	
	@FindBy(xpath="//a[text()='Open Tasks']")
	private WebElement openTaskLink;
	
	@FindBy(css="input[value='Create New Tasks']")
	private WebElement clickOnNewTaskBtn;

	public ActiveProjNcustPage(WebDriver driver)
	{
		super(driver);
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	
	//steps
	public void clickOnNewCustBtn()
	{
		slib.clickbutton(createNewCustBtn);
		
		//or
	//	createNewCustBtn.click();// i have to check it .
	}
	
	
	//feature
	public void showCustomerSelectProject(String cstmrName)
	{
		slib.selectoptionByText(custDrpdwn, cstmrName);
		slib.clickbutton(custShowBtn);
		slib.iSleep(3);
		projectNameLink.click();
	}
	
	//feature
	public void verifyCreateCustomer(String customerName)
	{
		slib.validateElementDisplayed(successmsg, "create customer msg is displayed");
		slib.validateDtaContains(successmsg, customerName, successmsg.getText());
			
	}
	//feature
	public void ShowCustomer(String customerName)
	{
		slib.selectoptionByText(custDrpdwn, customerName);
		slib.clickbutton(custShowBtn);
		customerNamelink.click();
	}

	
	public void verifyDeleteCustomer()
	{
		String expected="Customer has been successfully deleted.";
		slib.validate(expected, slib.getElementText(successmsg), expected);
	}
	/*******************************************************************************************************/
	
	public void clickOnNewPrjtBtn()//clickOnNewPrjtBtn
	{
		slib.clickbutton(createNewPrjtBtn);
	}
	
	
	public void verifyCreateProject(String projectName)
	{
		
		slib.validateElementDisplayed(successmsg,projectName );
		slib.validateDtaContains(successmsg, projectName, " this is ProjectName");
	}
	
	public void showProject()
	{
		slib.clickbutton(projectNameLink);
	}
	
	public void verifyDeleteProject()
	{
		slib.validateElementDisplayed(successmsg, " This is validation (Project successfully deleted). ");
	}
	
	
	//step
	public void clickOnOpenTask()
	{
		openTaskLink.click();
	}
	
	//steps
	public void clickOnNewTaskbtn()
	{
		slib.clickbutton(clickOnNewTaskBtn);
	}
	
	//steps
	public void verifyTask() 
	{
		slib.validateElementDisplayed(successmsg, " Task successfully created ");
	}
	
}
