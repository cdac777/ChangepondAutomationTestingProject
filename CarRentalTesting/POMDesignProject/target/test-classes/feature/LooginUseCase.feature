#Ravindiran
#10/07/24



Feature: Login page automation of saucedemo application

  
  Scenario: Check login is successful with valid credentials
  
  Given User is on Home Page

    When clicks on rent a car button

    When User enters valid "<username>" and "<password>"

    And clicks on login button

    When User is navigated to the SportsCar
    

    When User is navigated to Vintage Car

    When User is navigated to SuperDelux Car

    And Close the Browser

 

    Examples: 
      | username  | password  |
      | siva123@gmail.com | siva123 |
      #| sandeep123@gmail.com | sandeep234 |
      #| eeswaran123@gmail.com | eeswaran123 |
      #| basilahamed46@gmail.com | basil |
