Feature: As a User I want to go to Wikipedia and search for a few fruits

  @PositiveRegressionSuit
  Scenario Outline: Finding article by search
    Given I am on the Wikipedia main page
    When I type <query>
    And I press Enter
    Then I get article with title <title>

    Examples:
      | query     | title     |
      | Carambola | Carambola |
      | Apple     | Apple     |

  @PositiveRegressionSuit
  Scenario Outline: Finding article by search
    Given I am on the Wikipedia main page
    When I type <query>
    And I press the search button
    Then I get article with title <title>

    Examples:
      | query     | title        |
      | Carambola | Carambola |
      | Apple     | Apple        |


  @NegativeRegressionSuit
  Scenario Outline: Type incorrect query
    Given I am on the Wikipedia main page
    When I type <query>
    And I press Enter
    Then I get error message <error message>

    Examples:
      | query           | error message                            |
      | edealsdfjself   | There were no results matching the query.|
      | edealsdf123jself| There were no results matching the query.|

  @NegativeRegressionSuit
  Scenario: Submit search with empty query
    Given I am on the Wikipedia main page
    When I press Enter
    Then Empty result page is opened