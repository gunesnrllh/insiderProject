package com.insider.page;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




import java.util.ArrayList;


public class BasePages {


    public static int DEFAULT_MAX_ITERATION_COUNT = 150;
    public static String baseUrl = "https://useinsider.com/";
    WebDriver driver;

    public BasePages(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }
    public static void wait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
    public void click(By locator) {
        find(locator).click();

    }

    public void checkURLContainsRepeat(String expectedURL) {
        int loopCount = 0;
        String actualURL = "";
        while (loopCount < DEFAULT_MAX_ITERATION_COUNT) {
            actualURL = driver.getCurrentUrl();

            if (actualURL != null && actualURL.contains(expectedURL)) {
                System.out.println("Actual URL matches the expected");
                return;
            }
            loopCount++;
        }
        assert actualURL.equals(expectedURL) : "Actual URL doesn't match the expected." + "Expected: " + expectedURL + ", Actual: "
                        + actualURL;
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }


    public String getText(By by) {
        return find(by).getText();
    }

    public ArrayList<String> jobList = new ArrayList<>();

    public void scrollToElement(By locator ){
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait(2000);
    }






}
