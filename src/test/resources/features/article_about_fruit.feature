Feature: As a User I want to go to Wikipedia and search for a few fruits
  @NegativeRegressionSuit
  Scenario Outline: Finding a few fruits
    Given I am on the Wikipedia main page
    When I search for <query>
    Then I get error message <error message>

    Examples:
      | query         | error message                             |
      | edealsdfjself | There were no results matching the query. |
      | edealsdf123jself | There were no results matching the query. |


  @PositiveRegressionSuit
  Scenario Outline: Finding a few fruits
    Given I am on the Wikipedia main page
    When I search for <query>
    Then I get article with title <title>

    Examples:
      | query  | title  |
      | Carambola | Carambola |
      | Apple  | Apple  |

