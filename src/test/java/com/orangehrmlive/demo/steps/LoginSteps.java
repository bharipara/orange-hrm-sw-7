package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I Enter username$")
    public void iEnterUsername() {
        new HomePage().enterUserName();
    }

    @And("^I Enter password$")
    public void iEnterPassword() {
        new HomePage().enterPassword();
    }

    @And("^I Click on Login Button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogin();
    }

    @Then("^I Verify \"([^\"]*)\" Message$")
    public void iVerifyMessage(String arg0)  {
      new DashboardPage().verifyDashboardMsg();
    }

    @When("^I Login To The application$")
    public void iLoginToTheApplication() {
        new DashboardPage().launchApp();
    }

    @Then("^I Verify Logo is Displayed$")
    public void iVerifyLogoIsDisplayed() {
        new DashboardPage().verifyLogo();
    }

    @And("^I Click on User Profile logo$")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnProfileLogo();
    }

    @And("^I Mouse hover on \"([^\"]*)\" and click$")
    public void iMouseHoverOnAndClick(String arg0) {
        new DashboardPage().mouseHoverAndClick();
    }

    @Then("^I Verify the text \"([^\"]*)\" is displayed$")
    public void iVerifyTheTextIsDisplayed(String arg0) {
        new DashboardPage().verifyLoginPanel();
    }
}
