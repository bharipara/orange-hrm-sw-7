package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/span[1]")
    WebElement systemUsers;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
    WebElement addButton;



    public void clickOnAdminTab(){
        log.info("Click on Admin Tab : " + adminTab.toString());
        clickOnElement(adminTab);
    }
    public String verifySystemUserText(){
        log.info("Verify System User Text : " + systemUsers.toString());
        return getTextFromElement(systemUsers);
    }
    public void clickOnAddButton(){
        log.info("Click on Add Button : " + addButton.toString());
        clickOnElement(addButton);
    }




    }

