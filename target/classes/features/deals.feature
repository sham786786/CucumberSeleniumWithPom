Feature: Deals data creation

Scenario: Free CRM Login page

Given user is on landing page
When title of login page is Free CRM
Then user enters username and password
|ms.shameer@gmail.com	|Shameer@123	|
And user is on home page
And user click on new deals
And deals form opened
And click on new button
And enter deals details click on save
|test deals	|100	|50	|10	|
And verify new deals created
And close the browser

