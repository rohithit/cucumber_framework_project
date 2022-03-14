$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/demo.feature");
formatter.feature({
  "name": "test login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "As a user i want to login sucessful",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login is sucessful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinationlogin.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters user name and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_enters_user_name_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_is_navigated_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click on marketing Tracking",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_is_click_on_marketing_Tracking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the marketing Menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_is_on_the_marketing_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Marketing tracking",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_is_on_Marketing_tracking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Add new option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_click_on_Add_new_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Marketing Trcking Option",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_is_on_the_Marketing_Trcking_Option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Valid Campaign Name",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_enter_Valid_Campaign_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Description part",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_enter_Description_part()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Tracking code",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_enter_Tracking_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Examples",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_Examples()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill all the details",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_fill_all_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_clicks_on_save_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validation message should appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationlogin.validation_message_should_appeared()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to marketing section",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.user_navigates_to_marketing_section1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid Tracking Code in Tracking code input box",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationlogin.user_enters_valid_Tracking_Code_in_Tracking_code_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationlogin.clicks_on_filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Campaign Name along with all details should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationlogin.campaign_Name_along_with_all_details_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/demo1.feature");
formatter.feature({
  "name": "Admin check login Functionality",
  "description": "  I want to Login Sucessful to my retail section",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Admin check user able to login sucessful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to opens URL \"http://retailm1.upskills.in/admin\"",
  "keyword": "When "
});
formatter.step({
  "name": "I want to enters username \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "admin click on login",
  "keyword": "And "
});
formatter.step({
  "name": "i want to see Page title should be \"Dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "name": "admin move to catlog section",
  "keyword": "And "
});
formatter.step({
  "name": "admin navigates to manufacturer section",
  "keyword": "And "
});
formatter.step({
  "name": "admin move to add new section",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin want to write manufacturer name in Manufacturers field option",
  "keyword": "And "
});
formatter.step({
  "name": "I want to set store as deafault",
  "keyword": "And "
});
formatter.step({
  "name": "I want to write SEO URL",
  "keyword": "And "
});
formatter.step({
  "name": "I want to write sort order as sort order",
  "keyword": "When "
});
formatter.step({
  "name": "I want to click on save option",
  "keyword": "And "
});
formatter.step({
  "name": "I want to get the validation message",
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
        "admin",
        "Admin@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Admin check user able to login sucessful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationManufacturer.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to opens URL \"http://retailm1.upskills.in/admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to enters username \"admin\" and password as \"Admin@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_enters_username_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin click on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.admin_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i want to see Page title should be \"Dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_see_Page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin move to catlog section",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.admin_move_to_catlog_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin navigates to manufacturer section",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.admin_navigates_to_manufacturer_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin move to add new section",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationManufacturer.admin_move_to_add_new_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin want to write manufacturer name in Manufacturers field option",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.admin_want_to_write_manufacturer_name_in_Manufacturers_field_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to set store as deafault",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_set_store_as_deafault()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to write SEO URL",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_write_SEO_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to write sort order as sort order",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_write_sort_order_as_sort_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click on save option",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_click_on_save_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to get the validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationManufacturer.i_want_to_get_the_validation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Edit",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@editManufacturer"
    }
  ]
});
formatter.step({
  "name": "User clicks  on the edit button",
  "keyword": "Given "
});
formatter.step({
  "name": "User edits the information \"\u003cm_name\u003e\" \"\u003cseo_url\u003e\" \"\u003csort_order\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Clicks on save button",
  "keyword": "And "
});
formatter.step({
  "name": "Success message is displayed and edit is confirmed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "m_name",
        "seo_url",
        "sort_order"
      ]
    },
    {
      "cells": [
        "Techn",
        "https://www.amazon.in/",
        "14"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Edit",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@editManufacturer"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks  on the edit button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationManufacturer.user_clicks_on_the_edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User edits the information \"Techn\" \"https://www.amazon.in/\" \"14\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationManufacturer.user_edits_the_information(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinationManufacturer.clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Success message is displayed and edit is confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationManufacturer.success_message_is_displayed_and_edit_is_confirmed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});