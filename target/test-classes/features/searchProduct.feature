Feature: Search Product and place the order for products
@OffersPage
Scenario Outline: Search Experience for product search in both home page and offers page

Given User is on green cart landing page
When user search with short name <Name> and extracts actual name of the product
Then user searched for <Name> shortname in offers page 
And validate product name in offers page matches with landing page

Examples:
| Name |
| Tom  |
| Beet |