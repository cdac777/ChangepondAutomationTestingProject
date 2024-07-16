@tag1
Feature: Registration Page ParamterizationTesting automation of RoomBookingReactProject application

Scenario Outline: Check Registration Page is successful with valid credentials

Given User is on Login page
And clicks on Login button
And clicks on signup button
When User enters valid "<name>" and "<contact>" and "<email>" and "<username>" and "<password>"
When clicks on Signup button
#When User is on login page
#And clicks on login button
Then User enters_valid "<username>" and "<password>"
And clicks on login_button
Then clicks on Logout_button
And Close the browser
   

    Examples: 

|name | contact | email | username  | password |

|Manoj| 9988776656 | manoj@cp.com | Manoj| Manoj@2k1 |
|Raghul| 9988774455 | raghul@cp.com | Raghul| Raghul@2k1 |
|Vijay| 9988772233 | vijay@cp.com | Vijay| Vijay@2k1 |
|Deva| 9988771122 | deva@cp.com | Deva| Deva@2k1 |