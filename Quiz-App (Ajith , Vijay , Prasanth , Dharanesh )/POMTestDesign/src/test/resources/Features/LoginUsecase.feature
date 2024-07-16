#Ajith Kumar
#10/07/24

Feature: Login Page automation of saucedemo application

		Scenario: Check login is successful with valid credentials

Given User is our login page
When User enters valid "<username>" and "<password>"
And clicks on login button
Then user is navigated to the home page
Then user is navigated to the Teacher page
When teacher enters valid "<tusername>" and "<tpassword>"
Then student is navigated to the student page
When student enters valid "<susername>" and "<spassword>"
Then student enter Voucher code and select exam
And Close the browser


Examples:
| username | password | tusername | tpassword | susername | spassword |
| admin@gmail.com | admin | panchasheel@gmail.com | PanchaSheel | dhanish@gmail.com | Dhansih |