Feature: Admin check login Functionality
  I want to Login Sucessful to my retail section

  @tag1
  Scenario Outline: Admin check user able to login sucessful with valid credentials
    Given User launch chrome browser
    When I want to opens URL "http://retailm1.upskills.in/admin"
    And I want to enters username "<username>" and password as "<password>"
    And admin click on login
    Then i want to see Page title should be "Dashboard"
    And admin move to catlog section
    And admin navigates to manufacturer section
    Then admin move to add new section
    And Admin want to write manufacturer name in Manufacturers field option
    And I want to set store as deafault
    And I want to write SEO URL
    When I want to write sort order as sort order
    And I want to click on save option
    Then I want to get the validation message

    Examples: 
      | username | password  |
      | admin    | Admin@123 |
