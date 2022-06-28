Feature: Booking Hotel In Adactin Application 

Scenario: user Login In The Web Application 
	Given user Launch The Application 
	When user Enter The Username In Username Field 
	And user Enter Password in Password Field 
	Then user Click the Login Button 

Scenario: user Searching the Hotel 
	When user Selecting Location In The Dropdown 
	And user Selecting Hotel In The Dropdown 
	And user Selecting Room Type In The Dropdwon 
	And user Selecting Number of Rooms In The Dropdown 
	And user Selecting Entering Check In Date In Check In Field 
	And user Selecting Entering Check Out Date In Check Out Field 
	And user Selecting Number of Adults Per Room In The Dropdown 
	And user Selecting Childrens Per Room In The Dropdown 
	Then user Click The Search Button 
	
Scenario: User Selecting The Hotel 
	When user Selecting The Hotel 
	Then user Click Continue Button 
	
Scenario: User Verifying Hotel and Entering Name and Payment Details 
	When user Enters First Name In The First Name Field 
	And  user Enters Last Name In The Last Name Field 
	And user Enters Billing Address In The Adress Field 
	And user Enters The Credit Card Number In the Credit Card Number Field 
	And user Selects Credit Card Type In The Credit Card Type Dropdown 
	And user Selects Expiry Month In The Expiry Month Dropdown 
	And user selects Expiry Year In The Expiry Year Dropdown 
	And user Enters The Cvv Number In The Cvv Number Field 
	Then user Clicks The Book Now Field 
	
Scenario: User Confirming The Hotel and Logout From Application
	Then user Clicks The Logout Button