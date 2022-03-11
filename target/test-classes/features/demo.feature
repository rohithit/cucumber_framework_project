Feature: test login Functionality

  Background: As a user i want to login sucessful

  Scenario: Check login is sucessful with valid credentials
    Given browser is open
    And user is on login page
    When user enters user name and password
    And user clicks on login
    When user is navigated to the homepage
    And user is click on marketing Tracking
    And user is on the marketing Menu
    When user is on Marketing tracking
    And User click on Add new option
    When user is on the Marketing Trcking Option
    When user enter Valid Campaign Name
    And user enter Description part
    And user enter Tracking code
    And user Examples
    When User fill all the details
    And user clicks on save option
    Then Validation message should appeared
    And User navigates to marketing section
    When User enters valid Tracking Code in Tracking code input box
    And Clicks on filter button
    Then Campaign Name along with all details should appear
