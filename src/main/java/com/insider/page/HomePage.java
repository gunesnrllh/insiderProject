package com.insider.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePages {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By acceptCookieBtn = By.xpath("//a[text()='Accept All']");
    By moreBtn = By.xpath("//span[text()='More']");
    By careerBtn = By.xpath("//h5[text()='Careers']");

    public void checkUrl(){
        checkURLContainsRepeat("https://useinsider.com");

    }
    public void acceptCookie(){
        if (isDisplayed(acceptCookieBtn)){
            click(acceptCookieBtn);
            System.out.println("Cookies accepted");

        }
    }

    public void moreBar(){
        click(moreBtn);
        System.out.println("More bar opened");

        Assertions.assertTrue(moreBtn != null, "Element can not found");
    }

    public void checkCareer(){
        click(careerBtn);
        System.out.println("Career bar opened ");

        Assertions.assertTrue(careerBtn != null, "Element can not found");
    }





}


