$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/org/tester/login/Cucumber/Addcustomer.feature");
formatter.feature({
  "name": "To test add customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test the generate customer Id  functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "rows": [
    {
      "cells": [
        "firstName",
        "test"
      ]
    },
    {
      "cells": [
        "lastName",
        "selenium"
      ]
    },
    {
      "cells": [
        "emailAddress",
        "test@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phoneNumber",
        "8686757644"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_fill_in_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the customer id generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessPageSteps.the_user_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test reset form functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details.",
  "rows": [
    {
      "cells": [
        "firstName",
        "test"
      ]
    },
    {
      "cells": [
        "lastName",
        "selenium"
      ]
    },
    {
      "cells": [
        "emailAddress",
        "test@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phoneNumber",
        "8686757644"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPageSteps.x(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click reset button.",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_click_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all the user details should be deleted.",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPageSteps.all_the_user_details_should_be_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test error message functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has mentioned gmail address wrong notation",
  "rows": [
    {
      "cells": [
        "firstName",
        "test"
      ]
    },
    {
      "cells": [
        "lastName",
        "selenium"
      ]
    },
    {
      "cells": [
        "emailAddress",
        "testgmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phoneNumber",
        "8686757644"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_has_mentioned_gmail_address_wrong_notation(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should display stating that email address is wrong.",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPageSteps.error_message_should_display_stating_that_email_address_is_wrong()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test popup message functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user left last name textbox empty",
  "rows": [
    {
      "cells": [
        "firstName",
        "test"
      ]
    },
    {
      "cells": [
        "lastName",
        "selenium"
      ]
    },
    {
      "cells": [
        "emailAddress",
        "testgmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phoneNumber",
        ""
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_left_last_name_textbox_empty(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPageSteps.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "popup message should display stating that please fill all fields.",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPageSteps.popup_message_should_display_stating_that_please_fill_all_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/main/java/org/tester/login/Cucumber/Addtariffplan.feature");
formatter.feature({
  "name": "To test add tariff plan functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To verify the sucess message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "the user is in add tariff plan page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user fill in valid tariff plan details \"\u003cmonthlyRental\u003e\",\"\u003cfreeLocal\u003e\",\"\u003cfreeInternational\u003e\",\"\u003cfreeSMS\u003e\",\"\u003clocal\u003e\",\"\u003cinternational\u003e\",\"\u003cSMS\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks submit button",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the sucess message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "monthlyRental",
        "freeLocal",
        "freeInternational",
        "freeSMS",
        "local",
        "international",
        "SMS"
      ]
    },
    {
      "cells": [
        "500",
        "100",
        "300",
        "100",
        "200",
        "100",
        "300"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the sucess message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid tariff plan details \"500\",\"100\",\"300\",\"100\",\"200\",\"100\",\"300\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanSteps.the_user_fill_in_valid_tariff_plan_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanSteps.the_user_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the sucess message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanSteps.the_user_should_see_the_sucess_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify the error popup message",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in add tariff plan page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user fills in valid tariff plan details \"\u003cmonthlyRental\u003e\",\"\u003cfreeLocal\u003e\",\"\u003cfreeInternational\u003e\",\"\u003cfreeSMS\u003e\",\"\u003clocal\u003e\",\"\u003cinternational\u003e\",\"\u003cSMS\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "should get popup message displayed like fill all fields",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "monthlyRental",
        "freeLocal",
        "freeInternational",
        "freeSMS",
        "local",
        "international",
        "SMS"
      ]
    },
    {
      "cells": [
        "500",
        "100",
        "300",
        "100",
        "200",
        "",
        "300"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the error popup message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in valid tariff plan details \"500\",\"100\",\"300\",\"100\",\"200\",\"\",\"300\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanSteps.the_user_fills_in_valid_tariff_plan_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should get popup message displayed like fill all fields",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanSteps.should_get_popup_message_displayed_like_fill_all_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});