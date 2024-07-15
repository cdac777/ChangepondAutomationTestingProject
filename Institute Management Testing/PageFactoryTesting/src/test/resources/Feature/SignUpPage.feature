#Nirmal Raj S
#10/07/24

Feature: Login Page automation of saucedemo application
  

 
  Scenario: Check Sign Up is successful with valid data
  	Given user is on Home page
  	And clicks on navigate login button
    Then user is navigated to the login page 
  	And Clicks the sign up button
    Given User is on sign Up page
    When User enters valid "<rn>" and "<fn>" and "<dep>" and "<cn>" and "<em>" and "<gen>" and "<dob>" and "<add>" and "<pass>"
    Then user is navigated to the login page
    And close the browser

  

    Examples: 
      | rn  | fn |  dep | cn | em | gen | dob | add |pass|
      | 2 | Nirmal | CSE | 9876543210 | nirmalraj@gmail.com | Male | 15/06/2000 | Chennai | Nirmal@2|