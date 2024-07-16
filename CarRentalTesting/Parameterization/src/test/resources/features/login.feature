 #Dhanesh
#10/07/24

Feature: Login page automation of saucedemo application

  Scenario: Check login is successful with valid credentials
  
    Given User is on Main dashboard
    When Clicks on login button
    When User enters valid "<useremail>" and "<userpassword>"
    And Clicks on signIn button
    When Clicks on add button
    When Clicks on cart button
    Then User is navigated to the home page
    And Close the browser

    Examples: 
      | useremail  | userpassword |
      | siva123@gmail.com | siva123 |
      | sandeep123@gmail.com | sandeep34 |
      | eeswaran123@gmail.com | eeswaran123 |
      | basilahamed46@gmail.com | basil |

