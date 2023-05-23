package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());

    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement enterUserName;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement dropDown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input'][normalize-space()='Disabled']")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchBtn;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement userInResultList;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement deleteButton ;

    @CacheLookup
    @FindBy(xpath = " ")
    WebElement deleteMessage;


public void enterUserName(){
    log.info("Enter username : " + enterUserName.toString());
    sendTextToElement(enterUserName,"ADash12");
}
public void clickOnDropDown(){
    log.info("Click on drop down : " + dropDown.toString());
    clickOnElement(dropDown);
}
public void selectStatusBtn(){
    log.info("Select status : " + selectStatus.toString());
    clickOnElement(selectStatus);
}
public void clickOnSearchBtn(){
    log.info("Click on search button : " + searchBtn.toString());
    clickOnElement(searchBtn);
}
public String userResultList(){
    log.info("verify user result list : " + userInResultList.toString());
    return getTextFromElement(userInResultList);
}
public void clickOnCheckBox(){
    log.info("Click on Checkbox : " + checkBox.toString());
    clickOnElement(checkBox);
}
public void clickOnDeleteBtn(){
    log.info("Click on Delete Button : " + deleteButton.toString());
    clickOnElement(deleteButton);
}
public String verifyDeleteMessage(){
    log.info("Verify Delete Message : " + deleteMessage.toString());
    return getTextFromElement(deleteMessage);
}
    public String verifyTextFromAlert() {
        //log.info("Click on Admin Tab : " +.toString());
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }
    public void acceptThatAlert() {
        //log.info("Accept that Alert : " + a.toString());
        //acceptAlert();
    }


}
