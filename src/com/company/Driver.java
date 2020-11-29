package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    static WebDriver driver = null;
    public static WebDriver driver(String url){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.28.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        String baseUrl;
        if (url == "Amazon") {
            baseUrl = "https://www.amazon.com/";
        }else {
            baseUrl = "https://www.ebay.com.my/";
        }
        driver.get(baseUrl);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        return driver;
    }
}
