#Dhanish Kumar
#10/07/24

Feature: Login Page automation of saucedemo application

		Scenario: Check login is successful with valid credentials

Given User is our login page
When User enters valid "<username>" and "<password>"
And clicks on login button
Then user is navigated to the home page
And Close the browser


Examples:
| username | password |
| admin@gmail.com | secret_sauce |
| hr@gmail.com | hr@123 |
| user@gmail.com | user@123 |
| ajith619006@gmail.com | 123456789 |
| ajith@gmail.com | 123 |