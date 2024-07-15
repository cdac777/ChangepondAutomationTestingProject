#Nirmal Raj S
#10/07/24

Feature: Login Page automation of saucedemo application
  

 
  Scenario: Check Login is successful with valid credentials
    Given User is on the home page
    And clicks on navigate login button
    Then user is navigated to the login page
    When User enters valid "<username>" and "<password>" and "<usertype>"
    And clicks on login button
    Then user is navigated to the home page "<home>"
    And close the browser

  

    Examples: 
      | username  | password | usertype| home |
      | student | student | Student | Dear Student Welcomeback |
      |   | student | Student | Dear Student Welcomeback |
      |  students |  | Student | Dear Student Welcomeback |
      | admin | admin | Admin | Dear Admin Welcomeback |
      | trainer | trainer | Trainer | Dear Trainer Welcomeback |
      |   |  |  |  |
      

