# Dhanish Kumar
# 10/07/24

Feature: Login Page automation of saucedemo application

  Scenario: Check login is successful with valid credentials
    Given User is on the homepage
    When User clicks on the signin button
    When User enters valid "<username>" and "<password>"
    When User clicks on the login button
    Then User is navigated to the home page
    When User click on truffle mushroom on view cart
    When User click on buy now
    When About as Page
    When clicks on add product button
	  When Users add values on product add page 
	  When Users clicks on contact page
	  When Logout page
	  And Close the browser
  Examples:
    | username      | password |
    | admin@gmail.com  | admin@123   |
