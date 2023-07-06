package com.insider.page;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CareersPage extends BasePages {



    public CareersPage(WebDriver driver) {
        super(driver);
}

    By locationsInfo = By.xpath("//div[@class='location-info']");
    By salesTitle = By.xpath("//h3[text()='Sales']");
    By teamsLocator = By.xpath("//div[contains(@class,'career-load-more')]");
    By lifePhotos = By.xpath("//div[@class='swiper-slide']");
    By seeAllTeamsBtn = By.xpath("//a[normalize-space(text())='See all teams']");
    By qaTeamTitle = By.xpath("//a[contains(@href,'quality-assurance/')]");
    By seeQaJobsBtn= By.xpath("//a[text()='See all QA jobs']");


  public void checkLocationsBar(){

      isDisplayed(locationsInfo);
      scrollToElement(locationsInfo);

      Assertions.assertTrue(locationsInfo != null, "Element can not found");
  }
  public void checkTeamsBar(){

      isDisplayed(teamsLocator);
      scrollToElement(teamsLocator);
      Assertions.assertTrue(teamsLocator != null, "Element can not found");
  }
  public void lifeBar(){


      isDisplayed(lifePhotos);
      scrollToElement(lifePhotos);

      Assertions.assertTrue(lifePhotos != null, "Element can not found");

  }

  public void seeAllTeams(){

      scrollToElement(salesTitle);
      wait(5000);
      WebElement linkElement = driver.findElement(By.linkText("See all teams"));
      linkElement.click();
      System.out.println("seeAllTeams element clicked");

  }
  public void goToQaTeam(){
      wait(5000);

      scrollToElement(qaTeamTitle);
      Assertions.assertTrue(qaTeamTitle != null, "Element can not found");
      click(qaTeamTitle);
      System.out.println("qaTeamTitle element clicked");


  }
  public void seeJobs(){
      Assertions.assertTrue(seeQaJobsBtn != null, "Element can not found");
      click(seeQaJobsBtn);
      System.out.println("seeQaJobsBtn element clicked");


  }


}
