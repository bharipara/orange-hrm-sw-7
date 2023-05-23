package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text--after'])[1]")
    WebElement dropDown ;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
    WebElement dropDowmStatus;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement statusToSelect;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement resultList;


    public void clickOnDropdown() {
        log.info("Click on Drop down : " + dropDown.toString());
        clickOnElement(dropDown);
    }

    public void selectUserRole() {
        log.info("Select user role : " + userRole.toString());
        clickOnElement(userRole);
    }

    public void clickOnDropDownToSelect() {
        log.info("Click on Drop down to select : " + dropDowmStatus.toString());
        clickOnElement(dropDowmStatus);
    }

    public void selectStatus() {
        log.info("Select status : " + statusToSelect.toString());
        clickOnElement(statusToSelect);
    }

    public void clickOnSearchBtn() {
        log.info("Click on search button: " + searchButton.toString());
        clickOnElement(searchButton);
    }

    public String verifyResultList() {
        log.info("Verify Result list : " + resultList.toString());
        return getTextFromElement(resultList);
    }
}
