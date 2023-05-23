package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AdminSteps {
    @And("^I Click on Check box$")
    public void iClickOnCheckBox() {
        new ViewSystemUserPage().clickOnCheckBox();
    }

    @And("^I Click on Delete Button$")
    public void iClickOnDeleteButton() {
        new ViewSystemUserPage().clickOnDeleteBtn();
    }

    @And("^Popup will display$")
    public void popupWillDisplay() {

    }

    @And("^I Click on Ok Button on Popup$")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUserPage().acceptThatAlert();
    }

    @Then("^I verify message Successfully Deleted$")
    public void iVerifyMessageSuccessfullyDeleted() {
        new ViewSystemUserPage().verifyDeleteMessage();
    }

    @Then("^I verify message No Records Found$")
    public void iVerifyMessageNoRecordsFound() {
        new LoginPage().verifyResultList();
    }
}
