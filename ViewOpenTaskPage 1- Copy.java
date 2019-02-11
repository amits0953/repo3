package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.SeleniumLib;

public class ViewOpenTaskPage 
{
 SeleniumLib slib;
 
 @FindBy(css="input[value*='Delete This Task']")
 private WebElement clickOnDeleteTaskBtb;
 
 @FindBy(id="deleteButton")
 private WebElement clckOnConfirmDeleteThisTaskBtn;
 
 public ViewOpenTaskPage(WebDriver driver)
 {
	 slib= new SeleniumLib(driver);
	 PageFactory.initElements(driver, this);
	 
 }
 //step
 public void clickOnDeleteTaskBtn()
 {
	 slib.clickbutton(clickOnDeleteTaskBtb);
	 slib.clickbutton(clckOnConfirmDeleteThisTaskBtn);
 }
 
}
