#Vijay kumar
#10/07/24

Feature: Login Page automation of saucedemo application

Scenario: Check admin login is successful with valid credentials

Given admin in our login page
When admin enters valid "<useremail>" and "<password>"
And admin clicks on login button
Then user is navigated to the home page
And admin is navigated to exam table page
Then admin is selecting all the exams
And Logout the admin page
Then Logout alert


Examples:
| useremail | password |
|admin@gmail.com|admin|


Scenario: Check Teacher login is successful with valid credentials

And Teacher in our login page
When Teacher enters valid "<useremail>" and "<password>"
And Teacher clicks on login button
Then Teacher is navigated to the home page
And Teacher is navigated to Vouchers page
Then Teacher is navigated to exam table page
And Teacher is navigated to add exam page
Then Teacher is navigated to view results page
And Logout the Teacher page
Then Logout alert


Examples:
| useremail | password |
|jaya@gmail.com|12345678|

Scenario: Check Student login is successful with valid credentials

And Student in our login page
When Student enters valid "<useremail>" and "<password>"
And Student clicks on login button
Then Student enters the voucher code "<voucher>"
And Student clicks on start quiz
Then Close the browser

Examples:
| useremail | password |voucher|
|kata@gmail.com|12345678|12345|

