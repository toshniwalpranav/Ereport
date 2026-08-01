package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage {

    private WebDriver driver;

    private By userName = By.id("userName");
    private By userEmail = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submit = By.id("submit");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillContactUsForm(String fullName, String email, String currentAddr, String permanentAddr) {
        driver.findElement(userName).sendKeys(fullName);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(currentAddress).sendKeys(currentAddr);
        driver.findElement(permanentAddress).sendKeys(permanentAddr);
    }
/*
    public void clickSubmit() {

        WebElement submitButton = driver.findElement(submit);
        //find the submit button

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //JavaScript can interact with the page directly.
//Here you're converting the driver into a JavascriptExecutor so it can run JavaScript.
       
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", submitButton);
        
        //It scrolls the page until the button is visible, placing it near the center of the screen.

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));

        js.executeScript("arguments[0].click();", submitButton);
    }
 */
    
    
    public void clickSubmit() {
    	driver.findElement(submit).click();
    }
}