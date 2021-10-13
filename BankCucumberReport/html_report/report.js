$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/feature/bankCucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test Guru99",
  "description": "",
  "id": "bank-test-guru99",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Basic login check",
  "description": "",
  "id": "bank-test-guru99;basic-login-check",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User open the browser and access the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on homepage and verifies the title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User gives \"mngr26593\" and \"1!\" to login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verifies that profile id is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click logout",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_open_the_browser_and_access_the_URL()"
});
formatter.result({
  "duration": 6352461400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_is_on_homepage_and_verifies_the_title()"
});
formatter.result({
  "duration": 192755000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr26593",
      "offset": 12
    },
    {
      "val": "1!",
      "offset": 28
    }
  ],
  "location": "stepDefinition.user_gives_and_to_login(String,String)"
});
formatter.result({
  "duration": 3580548200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifies_that_profile_id_is_displayed()"
});
formatter.result({
  "duration": 158420600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_logout()"
});
formatter.result({
  "duration": 6071502500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login check with Data Table",
  "description": "",
  "id": "bank-test-guru99;login-check-with-data-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User verifies the bank page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User inputs the credentials",
  "rows": [
    {
      "cells": [
        "mngr359049",
        "YnumYpy"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Checks that the profile ID is visible",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Decides to logout",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_opens_the_browser()"
});
formatter.result({
  "duration": 4923142800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_verifies_the_bank_page()"
});
formatter.result({
  "duration": 184598600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_inputs_the_credentials(DataTable)"
});
formatter.result({
  "duration": 3366336700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.checks_that_the_profile_ID_is_visible()"
});
formatter.result({
  "duration": 152692000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.decides_to_logout()"
});
formatter.result({
  "duration": 6297784900,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Valid login check with Maps",
  "description": "",
  "id": "bank-test-guru99;valid-login-check-with-maps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Title of the page matches",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enters the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 27
    },
    {
      "cells": [
        "mngr26593",
        "1!"
      ],
      "line": 28
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User checks the id for the profile is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Use decides to logout",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_bank_login_page()"
});
formatter.result({
  "duration": 4591406100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.title_of_the_page_matches()"
});
formatter.result({
  "duration": 128929000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_enters_the_username_and_password(DataTable)"
});
formatter.result({
  "duration": 3479567400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_checks_the_id_for_the_profile_is_displayed()"
});
formatter.result({
  "duration": 150146800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.use_decides_to_logout()"
});
formatter.result({
  "duration": 6474860300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "Create account",
  "description": "",
  "id": "bank-test-guru99;create-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User check the title and the URL of the page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and login",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User makes sure that the profile id is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User click on new customer",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User fills up the customer details",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User navigates back to profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User fills up the account details",
  "rows": [
    {
      "cells": [
        "CustomerID",
        "AccountType",
        "Deposit"
      ],
      "line": 44
    },
    {
      "cells": [
        "45804",
        "Savings",
        "5000"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User again navigates back",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User decides to click Logout button",
  "keyword": "Then "
});
formatter.examples({
  "line": 50,
  "name": "",
  "description": "",
  "id": "bank-test-guru99;create-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 51,
      "id": "bank-test-guru99;create-account;;1"
    },
    {
      "cells": [
        "mngr359057",
        "zyjAsyb"
      ],
      "line": 52,
      "id": "bank-test-guru99;create-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5015584000,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Create account",
  "description": "",
  "id": "bank-test-guru99;create-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User check the title and the URL of the page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters \"mngr359057\" and \"zyjAsyb\" and login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User makes sure that the profile id is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User click on new customer",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User fills up the customer details",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User navigates back to profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User fills up the account details",
  "rows": [
    {
      "cells": [
        "CustomerID",
        "AccountType",
        "Deposit"
      ],
      "line": 44
    },
    {
      "cells": [
        "45804",
        "Savings",
        "5000"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User again navigates back",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User decides to click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_check_the_title_and_the_URL_of_the_page()"
});
formatter.result({
  "duration": 133197900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr359057",
      "offset": 13
    },
    {
      "val": "zyjAsyb",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_enters_and_and_login(String,String)"
});
formatter.result({
  "duration": 3422017600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_makes_sure_that_the_profile_id_is_displayed()"
});
formatter.result({
  "duration": 154948600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_click_on_new_customer()"
});
formatter.result({
  "duration": 1032715900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_fills_up_the_customer_details()"
});
formatter.result({
  "duration": 4877045100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_navigates_back_to_profile_page()"
});
formatter.result({
  "duration": 1769462300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 927814500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_fills_up_the_account_details(DataTable)"
});
formatter.result({
  "duration": 4478149400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_again_navigates_back()"
});
formatter.result({
  "duration": 2073323800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_decides_to_click_Logout_button()"
});
formatter.result({
  "duration": 4475724800,
  "status": "passed"
});
formatter.after({
  "duration": 1814153100,
  "status": "passed"
});
});