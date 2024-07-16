@tag2
Feature: Checking Registration Page automation of Room Booking application

Scenario Outline: Checking Registration is working with given credentials

    Given User is on Login page
    
    And clicks on Login button
    
    And clicks on signup button
    
    When User enters valid "<name>" and "<contact>" and "<email>" and "<username>" and "<password>"
       
    When clicks on Signup button
    
    Then User enters_valid "<username>" and "<password>"
    
   	And clicks on login Button
   
    Then clicks on Logout Button
    
          
    And Close the browser
   



    Examples: 

      |  name | contact | email | username  | password |

      | Admin | 9988776655 | admin@cp.com | Admin | Admin@2k1 |
