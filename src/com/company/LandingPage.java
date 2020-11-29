package com.company;

import org.openqa.selenium.WebDriver;

public class LandingPage {
    public static String UserSearchProducts(WebDriver driver, String data){
        Components.Inputtextbox(driver, data);

        return Components.ClickSearchbuttons(driver);
    }
}
