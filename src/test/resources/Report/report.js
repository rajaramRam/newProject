$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/base.feature");
formatter.feature({
  "name": "Validating the facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the login functionality with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter valid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User sholud click login button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Error message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ramkumar",
        "hello@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the login functionality with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepRun.user_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter valid \"ramkumar\" and invalid \"hello@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepRun.user_should_enter_valid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sholud click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepRun.user_sholud_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepRun.verify_Error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});