Feature: Login to Pega Applications
#@nav
#Scenario: check and Login Pega Application

#Given browser is open
#And user is on login page
#When user enters userName and password
#And User clicks on login
#Then user is navigated to Home page



Scenario Outline: Validations on Mark for Test "<MarkForTest>"
#Given browser is open
#And user is on login page
#When user enters userName and password
#And User clicks on login
#Then user is navigated to Home page
#Then user create the multichannel Campaigns
Then user Mark for test in campaigns "<MarkForTest>"
Examples:
|MarkForTest|
|Y|
|N|