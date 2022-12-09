Feature: Login and adding a country
 Scenario: Login and adding a country
When User opens URL "https://xlogist.pisystindia.com/admin/login"
And User enters Email as "admin@gmail.com" and password as "Charlie123"
And Click on Login
When User Click on country
When User Click on add country
And Enter the country name as "India"
When user click on add
And Close Browser

