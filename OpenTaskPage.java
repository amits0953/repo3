package com.actitime.pageobjects;

import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseLib;
import com.actitime.generics.SeleniumLib;

public class OpenTaskPage extends BasePage 
{
	WebDriver driver=BaseLib.driver;
	SeleniumLib slib;
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projNcustLink;
	
	@FindBy(xpath="//td[@class='listtblcell']/following-sibling::td/a[contains(@href,'taskId')]")
	private WebElement taskLink;
	
	String clickOnTask="//td[text()=''{0}'']/..//a[text()=''{1}'']";
	////td[text()='GE HealthCare']/..//a[text()='Testing']
	
	@FindBy(className="successmsg")
	private WebElement successmsg;
	
	public OpenTaskPage(WebDriver driver)
	{
		super(driver);
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
		
	}

	//steps
	public void clickOnProjectNCustLink()
	{
		projNcustLink.click();
	}
	
	// step
	public void clickOnTaskLink()
	{
		taskLink.click();
		slib.iSleep(5);
	}
	//feature
	
	public void deleteTask(String customerName, String taskName)  {
		// TODO Auto-generated method stub
		String value = MessageFormat.format(clickOnTask, customerName,taskName);
		System.out.println(value);
		//driver.findElement(By.xpath(value));
		//System.out.println(count);
		driver.findElement(By.xpath(value)).click();		
	}
	public void verifyDeleteTask()
	{
		slib.validate("Task has been successfully deleted.", successmsg.getText(), "Task has been successfully deleted.");
	}
}
