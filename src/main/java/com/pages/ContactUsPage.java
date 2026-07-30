package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage
{
  private WebDriver driver;
  
  private By userName = By.id("userName");
  private By userEmail = By.id("userEmail");
  private By currentAddress = By.id("currentAddress");
  private By permanentAddress = By.id("permanentAddress");
  private By submit= By.id("submit");
  
  public ContactUsPage(WebDriver driver)
  {
	  this.driver = driver;
  }
  
  public void fillContactUsForm(String Fullname, String email, String currentAddress, String permentAddress ) {
	  diver.findElement(userName).sendkeys(userName);
	  diver.findElement(email).sendkeys(userEmail);
	  diver.findElement(currentAddress).sendkeys(currentAddress);
	  diver.findElement(permentAddress).sendkeys(permanentAddress);
	  
  }
}
