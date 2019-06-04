Feature: Registration of TestMeApp

Example Mapping:
Business Rule1 : Signup Link
Acceptance Criteria : Register user should be logged in success to TestMeApp for search product

Example : Lalitha Wish to purchase an item from testmeApp, She should register first

Scenario: Register with valid credentials
Given user launch chrome browser And enter TestMeApp URL
When user entered username in username field as "Ravichandranvp"
When user entered firstname in firstname field "Ravichan"
When user entered Lastname in Lastname field "Chandran"
When user entered password in password field as "8220883885"
When user entered Confirm password in Confirm password field "8220883885"
When user select Gender in Radio button as "Female"
When user entered email in email field as "ravi@gmail.com"
When user entered Mobile Number in Mobile Number field "8220883885"
When user entered DOB in DOB field "22/06/1998"
When user entered Address in Address field as "37, Chokkampudhur,Coimbatore"
When user select Security Question in Dropdown field as "What is your Birth place"
When user entered Answer in Answer field as "coimbatore"
When user clicks on Register Button
Then verify result

