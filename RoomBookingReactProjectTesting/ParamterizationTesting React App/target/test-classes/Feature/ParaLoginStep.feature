

@tag2
Feature: Login page ParamterizationTesting automation of RoomBookingReactProject application

Scenario Outline: Check login is successful with valid credentials

Given User is on Login Page
When User enters valid "<username>" and "<password>"
And clicks on login button
Then Logo is visible
Then title is visible
Then clicks on navigation button
Then clicks on Home
Then User clicks on select Room
Then User verify the booked room
Then clicks on Logout button
And Close the Browser


    Examples: 

| username  | password |

| Manoj| Manoj@2k1 |
| Raghul| Raghul@2k1 |
| Vijay| Vijay@2k1 |
| Deva| Deva@2k1 |
| fail | Fail@2k1 |



