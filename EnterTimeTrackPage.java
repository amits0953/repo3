package com.actitime.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class EnterTimeTrackPage extends BasePage
{
	SeleniumLib slib;
	@FindBy(xpath="//td[@class='pagetitle']")
	private List<WebElement> pageTitle;
	
	
	
	
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		slib= new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}

	//feature
	public void verifyHomePage()
	{
		String expected="Enter Time-Track";
		String actual = slib.getElementText(pageTitle.get(1));
		slib.validate(expected, actual, "Home page is verify");
		
		slib.validate("actiTIME - Enter Time-Track", slib.getPageTitle(), "home page verified");
		
	}
	
	
	
}
