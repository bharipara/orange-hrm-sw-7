Feature: Login Test
  Background: I am on homepage

    @sanity
  Scenario: verify User Should Login SuccessFully
  When I Enter username
  And I Enter password
  And I Click on Login Button
  Then I Verify "WelCome" Message

@smoke @regression
  Scenario: verify That The Logo Display On HomePage
    When I Login To The application
  Then I Verify Logo is Displayed

@regression
  Scenario: verifyUserShouldLogOutSuccessFully

  When I Login To The application
  And I Click on User Profile logo
  And I Mouse hover on "Logout" and click
  Then I Verify the text "Login Panel" is displayed