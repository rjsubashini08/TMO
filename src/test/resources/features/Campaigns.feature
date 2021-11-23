Feature: Create the Campaigns

Scenario: Navigate to create the multichannel Campaigns on Sublevel
Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns


Scenario: Navigate to create the multichannel Campaigns on Banlevel
Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns

@campc
Scenario Outline: Running the multichannel Campaigns on Customer Level
Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns
Then user enter the Campaigns details on plan tab with "<contextVal>"
Then user enter the Campaigns details on build tab with "<Strategy>" and "<Segment>"
Then user can save the Campaigns
Then user can run the Campaigns
Then user can close the browser
Examples:
|contextVal|Strategy|Segment|
|Customer |W101 Reg strategy cust|QA KT Segment|


Scenario Outline: Running the multichannel Campaigns on Ban Level
Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns
Then user enter the Campaigns details on plan tab with "<contextVal>"
Then user enter the Campaigns details on build tab with "<Strategy>" and "<Segment>"
Then user can save the Campaigns
Then user can run the Campaigns
Then user can close the browser
Examples:
|contextVal|Strategy|Segment|
|Ban|Wave103RegressionBANLevelStrategy|AutoBANLevelSegment|

@mfty
Scenario Outline: Validations on Mark for Test "<MarkForTest>"

Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns
Then user Mark for test in campaigns "<MarkForTest>"
Then user can close the browser
Examples:
|MarkForTest|
|Y|
#|N|

@mftn
Scenario Outline: Validations on Mark for Test "<MarkForTest>"

Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns
Then user Mark for test in campaigns "<MarkForTest>"
Then user can close the browser
Examples:
|MarkForTest|
#|Y|
|N|

@loady
Scenario Outline: Validations on Load to VNBO "<LoadToVNBO>"

Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns
Then user Load to VNBO in campaigns "<LoadToVNBO>"
Then user can close the browser
Examples:
|LoadToVNBO|
|Y|
#|N|

@results
Scenario Outline: Search the Campaigns with WrapUp status
Given browser is open
And user is on login page
When user enters userName and password
And User clicks on login
Then user is navigated to Home page
Then user create the multichannel Campaigns
Then user enter the Campaigns details on plan tab with "<contextVal>"
Then user enter the Campaigns details on build tab with "<Strategy>" and "<Segment>"
Then user can save the Campaigns
Then user can run the Campaigns
Then user can validate the result section
Then user can close the browser
Examples:
|contextVal|Strategy|Segment|
|Customer |W101 Reg strategy cust|QA KT Segment|