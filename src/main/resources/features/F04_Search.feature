@smoke
Feature: F04_Search | User Can Search by Product Name or SKU Number
  Scenario Outline: User Search by Product Name
    When User Enter "<Product Name>"
    And User clicks on Search Button
    Then url contains "https://demo.nopcommerce.com/search?q=" And search shows relevant results
    Examples:
      | Product Name |
      #|    book      |
      |   laptop     |
      |     nike     |

  Scenario Outline: User Search by SKU Number
    When User Search With "<SKU Number>"
    And User clicks on Search Button
    Then SKU Numbers Used in Search equals SKU Numbers in the Product Page
    Examples:
      | SKU Number |
      | SCI_FAITH  |
      | APPLE_CAM  |
      | SF_PRO_11  |


