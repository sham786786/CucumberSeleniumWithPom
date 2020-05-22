Feature: Free CRM application test 

Scenario: Login to Free CRM HomePage 

	Given user open the browser 
	When user is on login page 
	Then user click on Login button 
	And user enter username and password 
		| username			   | password	 |
		| ms.shameer@gmail.com | Shameer@123 |
	And user clicks Log button 
	And validate logged in username 
	And close application 
	
	
Scenario: Create Contacts 

	Given user open the browser 
	When user is on login page 
	Then user click on Login button 
	And user enter username and password 
		| username			   | password	 |
		| ms.shameer@gmail.com | Shameer@123 |
	And user clicks Log button 
	And user clicks on contacts 
	And user click on Contacts new button 
	And user enters contact details 
		|firstname	|lastname	|email			|
		|test1		|last1		|test@123		|
	And click on save 
	And verify contact saved 
	And user clicks back on contacts 
	And verify contact record displayed 
	And close application 
	
Scenario: Create Deals 

	Given user open the browser 
	When user is on login page 
	Then user click on Login button 
	And user enter username and password 
		| username			   | password	 |
		| ms.shameer@gmail.com | Shameer@123 |
	And user clicks Log button 
	And user click on deals
	And user clicks on Deals New button
	And enter deals details 
		|title	|assignedTo	|company	|amount	|commission	|
		|dealsTitle1 |Shameer Mulla1 |deals company1 |500|5|
		|dealsTitle2 |Shameer Mulla2 |deals company2 |600|5|
		#And save deals
	#And verify deals submitted 
	And navigate back on deals 
	And verify deals record displayed 
	And close application 
