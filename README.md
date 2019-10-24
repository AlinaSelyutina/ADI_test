# Test Project
In this project are implemented tests for the searching functionality in https://en.wikipedia.org/ site. In this project were  implemented tests according BDD approach.

## Test Automation architecture consists of 4 layers
1. Features
2. Runner
3. Page Objects
4. Step definitions


## Why BDD?
There are many advantages of BDD. First of all it allows managers, developers and testers communicate more efficiently. Also the beheavioral approach defines acceptence criteria prior to developer.


## Tools
  - **Junit** allows us to run tests
  - **Serenity BDD Framework** allows us get the informative reports about scenarios runs
  - **Cucmber** allows us run the human readable test cases writing in Gherkin
  - **Gradle** is open-source build and automation tool. Thanks to Gradle we can get very scalable and high-performance builds. Also, it's very easy to use.

#### Example of feature:
```
Feature: As a User I want to go to Wikipedia and search for a few fruits
  @NegativeRegressionSuit
  Scenario Outline: Finding a few fruits
    Given I am on the Wikipedia main page
    When I search for <query>
    Then I get error message <error message>

        Examples:
          | query            | error message                            |
          | edealsdfjself    | There were no results matching the query.|
          | edealsdf123jself | There were no results matching the query.|
```

#### Example of Runner class:
```
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/article_about_fruit.feature"
        ,tags = {"@PositiveRegressionSuit"}
)
public class PositiveTestsRunner {
}
```


## How to axecute
1. Clone project
2. Run gradle.build file
3. Open in browser report index.html into folder target/site/serenity
5. In addition, you can run tests with runners from test/java/runners package
