package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UserSteps {
    @And("^I click On \"([^\"]*)\" Tab$")
    public void iClickOnTab(String arg0)  {
        new AdminPage().clickOnAdminTab();

    }

    @Then("^I Verify \"([^\"]*)\" Text$")
    public void iVerifyText(String arg0)  {
        new AdminPage().verifySystemUserText();

    }

    @And("^I click On Add button$")
    public void iClickOnAddButton() {
        new AdminPage().clickOnAddButton();
    }

    @And("^I Select User Role \"([^\"]*)\"$")
    public void iSelectUserRole(String arg0)  {
        new AddUserPage().enterUserName();

    }

    @And("^I enter Employee Name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String arg0)  {
        new AddUserPage().enterEmployee();

    }

    @And("^I enter Username$")
    public void iEnterUsername() {
        new AddUserPage().enterUserName();
    }

    @And("^I Select status \"([^\"]*)\"$")
    public void iSelectStatus(String arg0)  {
        new AddUserPage().selectStatus();

    }

    @And("^I enter psaaword$")
    public void iEnterPsaaword() {
        new AddUserPage().enterPassword();
    }

    @And("^I enter Confirm Password$")
    public void iEnterConfirmPassword() {
        new AddUserPage().enterConfirmPassword();
    }

    @And("^I click On \"([^\"]*)\" Button$")
    public void iClickOnButton(String arg0)  {
        new AddUserPage().clickOnSaveBtn();

    }

    @Then("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String arg0)  {
        new AddUserPage().verifyMessage();

    }

    @Then("^I Verify the User should be in Result list\\.$")
    public void iVerifyTheUserShouldBeInResultList() {
        new ViewSystemUserPage().userResultList();
    }

    @And("^I Click on Search Button$")
    public void iClickOnSearchButton() {
        new ViewSystemUserPage().clickOnSearchBtn();
    }
}

