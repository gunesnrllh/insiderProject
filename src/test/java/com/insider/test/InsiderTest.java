package com.insider.test;
import com.insider.page.*;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class InsiderTest extends BaseTest {
    HomePage homePage;
    CareersPage careersPage;
    JobsPage jobsPage;
    public static Logger logger;


    @Test
    @Order(1)
    public void homePage(){
        homePage = new HomePage(driver);
        homePage.acceptCookie();
        homePage.checkUrl();
        homePage.moreBar();
        homePage.checkCareer();
        careersPage = new CareersPage(driver);
        careersPage.checkTeamsBar();
        careersPage.lifeBar();
        careersPage.checkLocationsBar();
        careersPage.seeAllTeams();
        careersPage.goToQaTeam();
        careersPage.seeJobs();
        jobsPage= new JobsPage(driver);
        jobsPage.openLocationList();
        jobsPage.selectLocation();
        jobsPage.openDepartmentList();
        jobsPage.selectDepartment();
        jobsPage.checkJobs();
        jobsPage.viewRole();
        jobsPage.openJobAd();
        jobsPage.checkUrl();


    }
}

