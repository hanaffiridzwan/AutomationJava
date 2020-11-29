package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Components {
    private static WebElement element = null;

    public static WebElement Inputtextbox(WebDriver driver, String data){
        try{
            element = driver.findElement(By.id("twotabsearchtextbox"));
        }
        catch(Exception e){
            element = driver.findElement(By.id("gh-ac"));
        }
        System.out.println(element);
        element.sendKeys(data);
        return element;
    }

    public static WebElement getText(WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")));
// click on the compose button as soon as the "compose" button is visible
        int size = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).size();
        for (int i=0; i<size; i++){
//            MessageFormat.format("my name is {0}", name);
            String new_size = Integer.toString(size);
            String elem = String.format("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2' and @xpath='{0}']",new_size);
            element = driver.findElement(By.xpath(elem));
            String data = element.getText();
            System.out.println(data);
        }

        return element;
    }

    public static String ClickSearchbuttons(WebDriver driver){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]")));
            element = driver.findElement(By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]"));
        }
        catch(Exception e){
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gh-btn']")));
            element = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        }
        element.click();
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        return currentURL;
    }
//    public static WebElement pagination(WebDriver driver, String data){
//        String xpathnext;
//        if (data == "Amazon"){
//            xpathnext = "//a[text()='Next']";
//        }
//        else{
//            xpathnext =  "//a[@aria-label='Next page']";
//        }
//        List<webElement> pagination =driver.findElemnts(By.xpath("xpathnext"));
//        //get the pagination size
//        //check the pagination is exist or not
//        if (driver.findElement(By.xpath(xpathnext)).isDisplayed()){
//            try {
//                WebDriverWait wait = new WebDriverWait(driver, 5);
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Next']")));
//                element = driver.findElement(By.xpath("//a[text()='Next']"));
//            }
//            catch(Exception e){
//                WebDriverWait wait = new WebDriverWait(driver, 5);
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Next page']")));
//                element = driver.findElement(By.xpath("//a[@aria-label='Next page']"));
//            }
//        }
//        else{
//            System.out.println("End of page");
//        }
//        element.click();
//        String currentURL = driver.getCurrentUrl();
//        System.out.println(currentURL);
//        return currentURL;
//    }

}
