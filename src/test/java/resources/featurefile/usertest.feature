Feature: User Test

  Background: I am on homepage
    @sanity @regression
  Scenario: Admin Should Add User SuccessFully.
   When I Login To The application
  And I click On "Admin" Tab
  Then I Verify "System Users" Text
  And I click On Add button
  Then I Verify "Add User" Text
  And I Select User Role "Admin"
  And I enter Employee Name "Ananya Dash"
  And I enter Username
  And I Select status "Disable"
  And I enter psaaword
  And I enter Confirm Password
  And I click On "Save" Button
  Then I verify message "Successfully Saved"

@smoke @regression
  Scenario: search The User Created And VerifyIt.
    When I Login To The application
  And I click On "Admin" Tab
  Then I Verify "System Users" Text
  And I enter Username
  And I Select User Role "Admin"
  And I Select status "Disable"
  And I Click on Search Button
  Then I Verify the User should be in Result list.