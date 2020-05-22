Feature: Deals data creation

Scenario: Free CRM Login page

Given user is on landing page
When title of login page is Free CRM
Then user enters username and password
|username				|password		|
|ms.shameer@gmail.com	|Shameer@123	|
And user is on home page
And user click on new deals
And deals form opened
And click on new button
And enter deals details click on save
|title		|amount|probability|commission|
|test deals1|100	|50	|10	|
|test deals2|200	|60	|20	|
|test deals3|300	|70	|30	|
|test deals4|400	|80	|40	|
And verify new deals created
And close the browser

