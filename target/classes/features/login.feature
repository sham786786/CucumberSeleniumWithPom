Feature: Free CRM Login 


#Scenario: Free CRM Login page

#When title of login page is Free CRM
#Then user enters "ms.shameer@gmail.com" and "Shameer@123"
#And user is on home page
#And close the browser

#Scenario: create contact

#Given user is on landing page
#When title of login page is Free CRM
#Then user "ms.shameer@gmail.com" and "Shameer@123"
#And user is on home page
#And user click on new contacts
#And contact form opened
#And click on new button
#And enter details and click on save
#And verify new contact created
#And close the browser
Scenario Outline: Free CRM Login page
Given user is on landing page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
And user is on home page
And user click on new contacts
And contact form opened
And click on new button
And enter "<firstname>" and "<lastname>" click on save
And verify new contact created
And close the browser


Examples:
|username				|password	|firstname	|lastname	|
|ms.shameer@gmail.com	|Shameer@123|bb			|bb			|
|ms.shameer@gmail.com	|Shameer@123|cc			|cc			|
