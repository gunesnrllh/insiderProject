package com.insider.page;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class JobsPage extends BasePages {

    public JobsPage(WebDriver driver) {
        super(driver);
    }

    By locationList = By.id("select2-filter-by-location-container");
    By istanbulLoc= By.xpath("//li[text()='Istanbul, Turkey']");
    By departmentList= By.id("select2-filter-by-department-container");
    By qaSelect= By.xpath("//li[text()='Quality Assurance']");
    By qaJobs= By.xpath("//span[text()='Quality Assurance']");

    By viewRoleBtn= By.xpath("(//a[text()='View Role'])[1]");
    By roleTitle= By.xpath("(//p[@class='position-title font-weight-bold'])[1]");

    public void openLocationList(){
        Assertions.assertTrue(locationList != null, "Element can not found");

        click(locationList);
        System.out.println("Location list opened");

    }
    public void selectLocation(){
        Assertions.assertTrue(istanbulLoc != null, "Element can not found");

        click(istanbulLoc);
        System.out.println("Location selected");

    }
    public void openDepartmentList(){
        Assertions.assertTrue(departmentList != null, "Element can not found");

        click(departmentList);
        System.out.println("Department list opened");

    }
    public void selectDepartment(){
        Assertions.assertTrue(qaSelect != null, "Element can not found");
        click(qaSelect);
        System.out.println("Department list selected");


    }
    public void checkJobs(){
        isDisplayed(qaJobs);
        Assertions.assertTrue(qaJobs != null, "Element can not found");
        System.out.println("Open positionsListed");


    }

    public void openJobAd(){
        Assertions.assertTrue(viewRoleBtn != null, "Element can not found");
        click(viewRoleBtn);
        System.out.println("Open jobs advertisement");

    }
    public void checkUrl(){
        checkURLContainsRepeat("jobs.lever.co/useinsider");

    }
    public void hoverElement(By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }
    public void viewRoleHover(){
        hoverElement(roleTitle);
    }



}
