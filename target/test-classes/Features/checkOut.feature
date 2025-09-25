Feature: Search and place the order for the product
@placeOrder
Scenario Outline: Search Experience for the product search in both home and offer page
Given user is on GreenCart Landing page
When user searched with shortname <Name> and extract the actual name of the product
And Add <qty> items selected product to the cart
Then user proceeds to checkout Page and verify <Name> items in the checkout page
And verify user have option to enter the promo code in checkout page

Examples:
| Name | qty |
| Tomato | 3 |
| Cauliflower | 2 |
| Pot | 4 |
