package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]")
    WebElement addUser;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement downArrow;

    @CacheLookup
    @FindBy(xpath ="//div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]" )
    WebElement selectAdmin;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement clickOnEmployee;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement clickOnSave;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement verifyMessage;


    public String verifyAddUser(){
        log.info("Verify Add User : " + addUser.toString());
        return getTextFromElement(addUser);
    }
    public void clickOnDownArrow(){
        log.info("Clicking on Down Arrow : " + downArrow.toString());
        clickOnElement(downArrow);

    }
    public void selectAdmin(){
        log.info("Select Admin Tab : " + selectAdmin.toString());
        clickOnElement(selectAdmin);
    }
    public void clickOnEmployeeName(){
        log.info("Clicking on Employee Name : " + clickOnEmployee.toString());
        clickOnElement(clickOnEmployee);
    }
    public void enterEmployee(){
        log.info("Enter Employee : " + employeeName.toString());
        sendTextToElement(employeeName,"Jas Lee");
        //sendTextToElement(employeeName, name);
        //mouseHoverToElementAndClick(selectUserOption);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By selectUserOption = null;
        clickOnElement(selectUserOption);
        clickOnElement(selectUserOption);
    }

    public void enterUserName(){
        sendTextToElement(userName,"ADash12");
    }
    public void selectStatus(){
        log.info("Select status : " +selectStatus.toString());
        selectByVisibleTextFromDropDown(selectStatus,"Disabled");
    }
    public void enterPassword(){
        log.info("Enter password : " + enterPassword.toString());
        sendTextToElement(enterPassword,"Dash@123");
    }
    public void enterConfirmPassword(){
        log.info("Enter confirm password : " + confirmPassword.toString());
        sendTextToElement(confirmPassword,"Dash@123");
    }
    public void clickOnSaveBtn(){
        log.info("Clicking on Save Button : " + clickOnSave.toString());
        clickOnElement(clickOnSave);
    }
    public String verifyMessage(){
        log.info("Verify message : " + verifyMessage.toString());
        return getTextFromElement(verifyMessage);
    }





}
