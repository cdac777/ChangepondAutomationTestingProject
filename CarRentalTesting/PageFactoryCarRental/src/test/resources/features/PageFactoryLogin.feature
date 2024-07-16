#Sureshmanikandan
#10/7/2024


@tag1
Feature: Login page automation of saucedemo application
Scenario: Check login is successful with valid credentials

    Given User is on Dashboard pages
    When User enters valid "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to the Luxurious car page
    Then user is navigated to the sports car page
    Then user is navigated to the vintage car page
    Then user is navigated to the superlux car page
    Then user is navigated to the userinfo car page
    And Close the browser


    Examples: 
      | username  | password |
      | sandeep123@gmail.com | sandeep234 |

      
@tag2    
Scenario: Check login for admin is successful with valid credentials

    Given User is on Dashboards page
    When User enter valid "<username>" and "<password>"
    And clicks on Adminlogin button
    Then user is navigated to the add page
    Then user is navigated to the userdetail page
    Then user is navigated to the bookedcar page
    Then user is navigated to the feedback page
    And Close the firefox


    Examples: 
      | username  | password |
      | victor@gmail.com | victor123 |

      