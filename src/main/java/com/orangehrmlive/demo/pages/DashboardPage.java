package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/span[1]/h6[1]")
    WebElement dashboardMsg;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[1]/a[1]/div[2]/img[1]")
    WebElement launchApp;

    @CacheLookup
    @FindBy(xpath = "//body/nav[1]/div[1]/a[1]")
    WebElement verifyLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Accept Cookies')]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]/img[1]")
    WebElement profileLogo;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")
    WebElement downArrow;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement clickOnLogout;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]")
    WebElement loginPanel;



    public String verifyDashboardMsg(){
        log.info("Verify Dashboard msg : " + dashboardMsg.toString());
        return getTextFromElement(dashboardMsg);
    }
    public void launchApp(){
        log.info("Click on launch app : " + launchApp.toString());
        clickOnElement(launchApp);
    }
    public String verifyLogo(){
        log.info("Verify Logo: " + verifyLogo.toString());
        return getTextFromElement(verifyLogo);
    }
    public void clickOnAcceptCookies(){
        log.info("Click on  Accept cookies : " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }
   public void clickOnProfileLogo(){
       log.info("Click on Profile logo : " + profileLogo.toString());
        clickOnElement(profileLogo);
   }
   public void clickOnDownArrow(){
       log.info("Click on Down arrow : " + downArrow.toString());
        clickOnElement(downArrow);
   }
   public void mouseHoverAndClick(){
       log.info("Mouse hover and click : " + clickOnLogout.toString());
        mouseHoverToElementAndClick(clickOnLogout);
   }
 public String verifyLoginPanel(){
     log.info("Verify login panel : " + loginPanel.toString());
       return getTextFromElement(loginPanel);
 }
}
