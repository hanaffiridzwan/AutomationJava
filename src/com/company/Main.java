package com.company;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String baseUrl = "Amazon";
        WebDriver driver = Driver.driver(baseUrl);
        String url1 = LandingPage.UserSearchProducts(driver, "iPhone 11");
        Jsoups.getWebData(url1, baseUrl);
        driver.close();

        String baseUrl2 = "ebay";
        WebDriver driver2 = Driver.driver(baseUrl2);
        String url2 = LandingPage.UserSearchProducts(driver2, "iPhone 11");
        Jsoups.getWebData(url2, baseUrl2);
        driver2.close();
    }
}
