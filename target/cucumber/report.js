$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/BankAndCash.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 16,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "credit",
        "saving",
        "40,000",
        "438960376",
        "person",
        "7658946",
        "https://www.texanscu.org/home/home"
      ],
      "line": 17,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3005602900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "BankStepDef.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 1130423000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"credit\"and \"saving\"and \"40,000\"and \"438960376\"and \"person\"and \"7658946\"and \"https://www.texanscu.org/home/home\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "BankStepDef.user_enters_the_and(String,String)"
});
formatter.result({
  "duration": 201803700,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1270028500,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDef.user_should_be_able_to_see_the_dashboard()"
});
formatter.result({
  "duration": 30821700,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDef.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 2058025000,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDef.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 556125100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "credit",
      "offset": 32
    },
    {
      "val": "saving",
      "offset": 44
    },
    {
      "val": "40,000",
      "offset": 56
    },
    {
      "val": "438960376",
      "offset": 68
    },
    {
      "val": "person",
      "offset": 83
    },
    {
      "val": "7658946",
      "offset": 95
    },
    {
      "val": "https://www.texanscu.org/home/home",
      "offset": 108
    }
  ],
  "location": "BankStepDef.user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,int,int,String,int,String)"
});
formatter.result({
  "duration": 1430086700,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDef.user_should_be_able_to_validate_new_account_created()"
});
formatter.result({
  "duration": 298459700,
  "status": "passed"
});
formatter.after({
  "duration": 730880300,
  "status": "passed"
});
});