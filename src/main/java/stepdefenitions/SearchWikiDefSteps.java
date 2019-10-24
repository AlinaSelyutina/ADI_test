package stepdefenitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import steps.SearchSteps;

public class SearchWikiDefSteps {

    @Steps
    SearchSteps searchSteps;

    @Given("I am on the Wikipedia main page")
    public void open(){
        searchSteps.openPage();
    }

    @When("^I type (.*)$")
    public void typeQuery(String query){
        searchSteps.typeQuery(query);
    }

    @And("I press the search button")
    public void pressOnTheSearchButton(){
        searchSteps.clickOnTheSearchButton();
    }

    @And("I press Enter")
    public void pressEnter(){
        searchSteps.pressEnter();
    }

    @Then("^I get article with title (.*)$")
    public void verifyTitle(String query){
        Assertions.assertThat((searchSteps.getTitle()).equals(query));
    }

    @Then("^I get error message (.*)$")
    public void checkErrorMessage(String errorMessage) {
        searchSteps.verifyErrorMessage(errorMessage);
    }

    @Then("Empty result page is opened")
    public void checkThatEmptyResultPageIsOpened() {
        searchSteps.verifyEmptyResultPageIsOpened();
    }

}
