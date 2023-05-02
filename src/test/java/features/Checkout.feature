Feature: place the order for products

@PlaceOrder
Scenario Outline: Search Experience for product search in both home page and offers page

Given User is on green cart landing page
When user search with short name <Name> and extracts actual name of the product
And added "3" items to selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And verify the user as ability to enter the promo code and place the order
Examples:
| Name |
| Tom  |
