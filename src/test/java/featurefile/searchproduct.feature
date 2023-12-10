Feature: search and place the order for product

Background:
    Given User is on greencart landing page

  @offerpage
  Scenario Outline: Search experience for the product search in home page and offer page
    When User searched with shortname <Name> and extracted actual name of product
    Then User searched for same shortname <Name> in offerpage to check if product exist
    And Validate productname in offer page matches with landing page

    Examples: 
      | Name |
      | Tom  |
      | Beet |
      | cuc  |
      | car  |

  @checkoutpage
  Scenario Outline: search product in shortname place the order compare name with checkout page
    When User searched with shortname <Name> and extracted actual name of product
    And add "3" items of selectes porduct to cart
    Then user proceed to checkout and validate the <Name> item in checkout page
    And verify user has ablity to enter promocode and place the order

    Examples: 
      | Name |
      | Tom  |
      | cuc  |
