Feature: Login TestMeApp

Scenario Outline: Login with valid credentials

Given user launching testmeapp
When user enter username as "<username>" And enter password as "<password>"
Then click ok
And verify login result

Examples:
|username|password|
|AlexUser|Alex@123|



