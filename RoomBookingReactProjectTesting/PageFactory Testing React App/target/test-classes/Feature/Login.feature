

@tag1
Feature: Login page automation of Room Booking Web application

Scenario Outline: Checking Completely excluding of Registration Page
		
		Given User is on Landing Page
		
	  Then SKNM title is visible
	  
	  
	  Then Logo is visible
	  
	  
	  Then checks on carousel
	  
	  
	  Then clicks on home button
	  
	  Then checks on Home title 
	  
	  Then checks on deluxe_room title
	  
	  Then checks on executive_room title
	  
	  Then checks on family_room title
	  
	  Then checks on special_rooms title 
	  
	  
	  
	   Then clicks on services button
	   
	   Then checks on Our_Services Title 
	   
	   Then checks on Word_Press logo
	    
	   Then checks on Cart logo
	     
	   Then checks on Cloud_Download logo 
	     
	   Then checks on Language logo 
	     
	   Then checks on Group logo
	     
	   Then checks on Piechart logo 
	     
	     
	     
		 Then clicks on room button
		
		 Then checks for Rooms title
		
		 Then checks for Standard Room hover image  
			  
		 Then checks for Duplex Rooms hover image 
		
		 Then checks for Connecting Rooms hover image 
		
		 Then checks for Presidental Suite hover image 
		
	   Then checks for Bungalow hover image
		
  	 Then checks for Junior Suite hover image 
			  
			  
			  
		
		 Then clicks on Team button 
		
		 Then checks on Team Members photo _1 
		
	   Then checks on Team Members photo _2 
		
		 Then checks on Team Members photo _3
			  		
	   Then checks on Team Members photo _4 
		
		
		
		
		 Then clicks on contact button 
			  
		 Then checks on contact title 
			  
  	 Then checks on contact info 
			  
		 When User enters valid "<name>" and "<phone>" and "<email>" and "<query>"
			  	  			  
     Then clicks on submit button	
			  	  
			  	  
			  	  
		And clicks on login button_
		
    When User enters valid "<username>" and "<password>"

    When clicks on Login button_

    Then Logo is visible in Login Page
    
    Then title is visible
    
    Then clicks on navigation button
    
    Then clicks on Users_List
    
    Then clicks on Room_Add
    
    Then clicks on Edit_and_Update
    
    Then clicks on Logout button
    
    And Close the Browser_





    Examples: 

      | username  | password | name  | phone  | email  | query  |

      | ikfan | Ikfan@2k1 | Raghul | 6379616860 | rvmd@gmail.com | what will be the cost of executive room for two days |

