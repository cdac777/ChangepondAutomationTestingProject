#Dharanesh
#12/7/2024

Feature: Login page automation of saucedemo application
Scenario: Check login is successful with valid credentials

    Given User is on Dashboard page
    When User enters valid "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to the vochur code
    When clicks on start quiz button
    When User answers Java quiz questions
    Given I am on the Teacher Login page
    When I enter the username "<tusername>"
    And I enter the password "<tpassword>"
    And I click on the Login button
    Then I should be redirected to the Exam Table page
    Given the user is on the login page
    When the user enters the username "<ausername>"
    And the user enters the password "<apassword>"
    And the user clicks the login button
    Then the application admin page should be displayed
    Then the admin click the logout button
    And Close the browser
   
    Examples: 
      | username  | password | tusername  | tpassword | ausername  | apassword |
      |dhanish@gmail.com | Dhansih|  panchasheel@gmail.com  | PanchaSheel | admin2@gmail.com | 12345678 |
     