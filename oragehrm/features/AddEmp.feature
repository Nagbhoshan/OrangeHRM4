

@tag
Feature: ADD Employee Registration
  

  @tag1
  Scenario: Add new employee reg...valid inputs
    Given i lunch chrome browser
    When i open with url "http://orangehrm.qedgetech.com"
    Then i should see admin login page
    When i enter username as "Admin"
    And i enter userpassword as "Qedge123!@#"
    And i click login
    When i goto add employee page
    When i enter first name "Nagabhooshan"
    And i enter last name "Kohli"
    And i click save
    Then i shoud see employee personal details
    When i click Employee list
    Then i should see registered employee in employee list
    When i click logout
    Then i should see admin login page
    When  i close the Browser 