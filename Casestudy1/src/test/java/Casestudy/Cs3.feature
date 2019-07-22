
Feature: TestMeApp

  Scenario: User moves to cart without adding any item
    Given I want to registered into TestMeApp
    And search the product like HeadPhone
    When Proceed to payment without adding any item in the cart
    Then TestMe doesn't displayes the cart item

  