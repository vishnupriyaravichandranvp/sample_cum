Feature: Login Test - search engine

- Description(optional) :Registered user can login into TestMeApp using proper crendentical
- Pre-Requiste :Registration module should be completed


Example Mapping:
Business Rule1 : Signin Link
Acceptance Criteria : Register user should be logged in success to TestMeApp for search product

Example : Alex Wish to purchase an item from testmeApp,he should login first

Scenario: Login with valid credentials
Given user launch chrome for online shopping app 
When user enter usrname in USERNAME field
When user entered pwd in PASSWORD field
When user entered productname in search_functionality as "Head"
When user clicks on FIND_DETAILS Button
Then verify result

