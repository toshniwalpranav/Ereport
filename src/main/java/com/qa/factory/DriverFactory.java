package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
          //ThreadLocal<WebDriver> → Creates a separate WebDriver for each test thread.
    
    public WebDriver init_driver(String browser) {
    	  //init_driver → Method to initialize (start) the browser.

        System.out.println("Browser value is: " + browser);

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());

        } else if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());

        } else {

            throw new IllegalArgumentException("Please pass the correct browser value: " + browser);

        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();

        return getDriver();
    }

    public static synchronized WebDriver getDriver() { //Allows only one thread at a time to execute this method.
    
        return tlDriver.get();
    }
}