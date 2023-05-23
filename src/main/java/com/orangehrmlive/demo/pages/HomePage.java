package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passWord;

    @CacheLookup
    @FindBy(tagName = "button")
    WebElement loginButton;



    public void enterUserName(){
        log.info("Enter User name : " + userName.toString());
        sendTextToElement(userName,"Admin");

    }
    public void enterPassword(){
        log.info("Enter password : " + passWord.toString());
        sendTextToElement(passWord,"admin123");
    }
    public void clickOnLogin(){
        log.info("Click on login : " + loginButton.toString());
        clickOnElement(loginButton);
    }


}
