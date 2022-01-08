Feature: Add to Cart

  @scenario1
  Scenario Outline: Add Product from Store page
    Given I am on Store Page
    Then I add "<product_name>" to the cart
    Then I see 1 "<product_name>" to the cart
    Examples:
      | product_name |
      |   Blue Shoes |