Feature:  Without Sign Functionality


  Scenario: Without Sign in website
    Given Navigate to homepage
    When User search an product
    Then User select product
    And User select product from two different seller
    Then  Navigate to cart
    And Check the cart