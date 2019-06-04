Feature: User move Product to cart

Example Mapping:
Business Rule1 : With Product Add to cart
Acceptance Criteria : Registered user should be Select the product and Add to cart


Example : Alex wants to purchase a product , so he select the product,click ADD TO CART link

Scenario: first without product
Given Alex enter the URL and launch the Application
When user moves to cart without adding the product

Scenario: second with product
When user moves to cart with product and payment
Then verify
