$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Free CRM HomePage",
  "description": "",
  "id": "free-crm-application-test;login-to-free-crm-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "ms.shameer@gmail.com",
        "Shameer@123"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks Log button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "validate logged in username",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "close application",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_open_the_browser()"
});
formatter.result({
  "duration": 33714561810,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 330164991,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 21555079934,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1897088411,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_clicks_log_button()"
});
formatter.result({
  "duration": 8356214900,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 779300128,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.close_application()"
});
formatter.result({
  "duration": 2350772177,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Create Contacts",
  "description": "",
  "id": "free-crm-application-test;create-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22
    },
    {
      "cells": [
        "ms.shameer@gmail.com",
        "Shameer@123"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks Log button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user clicks on contacts",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click on Contacts new button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user enters contact details",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email"
      ],
      "line": 28
    },
    {
      "cells": [
        "test1",
        "last1",
        "test@123"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "click on save",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verify contact saved",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user clicks back on contacts",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "verify contact record displayed",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "close application",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_open_the_browser()"
});
formatter.result({
  "duration": 14837345571,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 72799375,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 14366544546,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 5678367783,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_clicks_log_button()"
});
formatter.result({
  "duration": 8451902683,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.user_clicks_on_contacts()"
});
formatter.result({
  "duration": 4955219910,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.user_click_on_contacts_new_button()"
});
formatter.result({
  "duration": 5523753489,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.user_enters_contact_details(DataTable)"
});
formatter.result({
  "duration": 10497568577,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.click_on_save()"
});
formatter.result({
  "duration": 3943511030,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.verify_contact_saved()"
});
formatter.result({
  "duration": 130951794,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.user_clicks_back_on_contacts()"
});
formatter.result({
  "duration": 3443497411,
  "status": "passed"
});
formatter.match({
  "location": "contactSteps.verify_contact_record_displayed()"
});
formatter.result({
  "duration": 133170647,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.close_application()"
});
formatter.result({
  "duration": 4029349964,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Create Deals",
  "description": "",
  "id": "free-crm-application-test;create-deals",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 42
    },
    {
      "cells": [
        "ms.shameer@gmail.com",
        "Shameer@123"
      ],
      "line": 43
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks Log button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user click on deals",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user clicks on Deals New button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "enter deals details",
  "rows": [
    {
      "cells": [
        "title",
        "assignedTo",
        "company",
        "amount",
        "commission"
      ],
      "line": 48
    },
    {
      "cells": [
        "dealsTitle1",
        "Shameer Mulla1",
        "deals company1",
        "500",
        "5"
      ],
      "line": 49
    },
    {
      "cells": [
        "dealsTitle2",
        "Shameer Mulla2",
        "deals company2",
        "600",
        "5"
      ],
      "line": 50
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 51,
      "value": "#And save deals"
    },
    {
      "line": 52,
      "value": "#And verify deals submitted"
    }
  ],
  "line": 53,
  "name": "navigate back on deals",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "verify deals record displayed",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "close application",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_open_the_browser()"
});
formatter.result({
  "duration": 14524481790,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 110685271,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 14776947063,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 5572596279,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.user_clicks_log_button()"
});
formatter.result({
  "duration": 8623901478,
  "status": "passed"
});
formatter.match({
  "location": "dealSteps.user_click_on_deals()"
});
formatter.result({
  "duration": 3703419780,
  "status": "passed"
});
formatter.match({
  "location": "dealSteps.user_clicks_on_deals_new_button()"
});
formatter.result({
  "duration": 3788533177,
  "status": "passed"
});
formatter.match({
  "location": "dealSteps.enter_deals_details(DataTable)"
});
formatter.result({
  "duration": 27037515232,
  "status": "passed"
});
formatter.match({
  "location": "dealSteps.navigate_back_on_deals()"
});
formatter.result({
  "duration": 4041163451,
  "status": "passed"
});
formatter.match({
  "location": "dealSteps.verify_deals_record_displayed()"
});
formatter.result({
  "duration": 136274119,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.close_application()"
});
formatter.result({
  "duration": 2261858191,
  "status": "passed"
});
});