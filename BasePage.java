package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public abstract class BasePage
{
	SeleniumLib slib;
	 @FindBy(xpath="//div[contains(text(), 'Tasks')]")
	 private WebElement tasks;
	 
	 @FindBy(id="logoutLink") 
	 private WebElement logoutLink;
	 
	 @FindBy(xpath="//div[text()='Users']")
	 private WebElement clickOnUserLink;
	 
	 
	 public  BasePage(WebDriver driver)
	 {
		 slib= new SeleniumLib(driver);
		 PageFactory.initElements(driver, this);
	 }
	 
	 //steps
	 public void clickOnTasks()
	 {
		 tasks.click();
	 }
	 
	 //steps
	 public void clickonLogout()
	 {
		 logoutLink.click();
	 }
	 public void clickOnUser()
	 {
		 clickOnUserLink.click();
	 }
}
