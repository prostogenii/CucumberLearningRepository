Feature: Search and Place the order of products

  Scenario Outline: Search Experience for product search in both Home and Offers page

    Given User is on a GreenKart Landing page
    When User searched with shortname <Name> and extracted actual name of product
    Then User go and search for <Name> shortname in offers page to check if product exist same name

    Examples:
    | Name |
    | Tom |
    | Beet |


