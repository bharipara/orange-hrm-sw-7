$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logintest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19787082800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 5,
  "name": "verify User Should Login SuccessFully",
  "description": "",
  "id": "login-test;verify-user-should-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Enter username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I Enter password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Verify \"WelCome\" Message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterUsername()"
});
formatter.result({
  "duration": 1775522500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPassword()"
});
formatter.result({
  "duration": 359760000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 228632500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WelCome",
      "offset": 10
    }
  ],
  "location": "LoginSteps.iVerifyMessage(String)"
});
formatter.result({
  "duration": 2639571800,
  "status": "passed"
});
formatter.after({
  "duration": 3550730200,
  "status": "passed"
});
});