Feature: Admin test

  Background: I am on homepage
    @sanity @regression
  Scenario: verify That Admin Should Delete The User SuccessFully.
  When I Login To The application
  And I click On "Admin" Tab
  Then I Verify "System Users" Text
  And I enter Username
  And I Select User Role "Admin"
  And I Select status "Disable"
  And I Click on Search Button
  Then I Verify the User should be in Result list.
  And I Click on Check box
  And I Click on Delete Button
  And Popup will display
  And I Click on Ok Button on Popup
  Then I verify message Successfully Deleted

@smoke @regression
  Scenario: search The Deleted User And Verify The Message NoRecord Found.
  When I Login To The application
  And I click On "Admin" Tab
  Then I Verify "System Users" Text
  And I enter Username
  And I Select User Role "Admin"
  And I Select status "Disable"
  And I Click on Search Button
  Then I verify message No Records Found