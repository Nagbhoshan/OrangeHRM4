
Feature: Admin login


  @tag1
  Scenario: Admin login with valid input
    Given i lunch chrome browser
    When i open with url "http://orangehrm.qedgetech.com"
    Then i should see admin login page
    When i enter username as "Admin"
    And i enter userpassword as "Qedge123!@#"
    And i click login 
    Then i should see admin modul displayed
    When i click logout
    Then i should see admin login page
    When  i close the Browser 

   @tag2
  Scenario Outline: Admin login with invalid input
    Given i lunch chrome browser
    When i open with url "http://orangehrm.qedgetech.com"
    Then i should see admin login page
    When i enter username as "<username>"
    And i enter userpassword as "<password>"
    And i click login 
    Then i should see erorr message
    When  i close the Browser 
    Examples: 
      | username| password | 
      |Admin|    jahfd | 
      | gfatrs |   1425 |
