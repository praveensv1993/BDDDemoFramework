Feature: Search and place the order for the product
@productPage
Scenario Outline: Search Experience for the product search in both home and offer page
Given user is on GreenCart Landing page
When user searched with shortname <Name> and extract the actual name of the product
Then user search for same shortname <Name> in offers page to check if product exist
And compare landing page and offer page product name

Examples:
| Name |
| Tom |
| Ric |
