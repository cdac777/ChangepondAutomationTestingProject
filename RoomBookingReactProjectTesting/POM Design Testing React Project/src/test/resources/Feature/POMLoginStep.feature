

@tag2
Feature: Login page POMDesign automation of RoomBookingReactProject application

Scenario Outline: Check login is successful with valid credentials

Given User is on Login Page
When User enters valid "<username>" and "<password>"
And clicks on login button
Then Logo is visible
Then title is visible
Then clicks on navigation button
Then clicks on Users_List
Then clicks on Room_Add
Then clicks on Edit_and_Update
Then clicks on Logout button
And Close the Browser


    Examples: 

      | username  | password |

      | ikfan | Ikfan@2k1 |
        
      #| nirmal | Nirmal@2k1 |
      #
      #| sanjai | Sanjai@2k1 |
      #
      #| kamal | Kamal@2k1 |
        #
      #| ajith | Ajith@2k1 |
      #
      #| vijay | Vijay@2k1 |
         #
     #	| suriya | Suriya@2k1 |
      #
      #| vikram | Vikram@2k1 |
        #
      #| rajini | Rajini@2k1 |
      #
      #| kishore | Kishore@2k1 |
        #
      #| kamalesh | Kamalesh@2k1 |
              #
      #| fail | fail@2k1 |
