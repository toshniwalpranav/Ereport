package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void clickSubmit() {
        driver.findElement(submit).click();
    }
}