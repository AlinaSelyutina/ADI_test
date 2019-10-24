package steps;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import pages.ArticlePage;
import pages.SearchPage;
import pages.SearchResultPage;

public class SearchSteps {
    private SearchPage searchPage;
    private ArticlePage articlePage;
    private SearchResultPage searchResultPage;

    @Step("Open Wiki Page")
    public void openPage(){
        searchPage.open();
    }

    @Step("Get article title text")
    public String getTitle(){
        return articlePage.title.getText();
    }

    @Step("Verify error message is displayed and has the right text")
    public void verifyErrorMessage(String errorText){
        Assertions.assertThat(searchResultPage.errorMessage.isDisplayed());
        Assertions.assertThat(searchResultPage.errorMessage.getText().equalsIgnoreCase(errorText));
    }

    @Step("Verify that empty result page is opened")
    public void verifyEmptyResultPageIsOpened(){
        Assertions.assertThat(searchResultPage.searchInput.isDisplayed());
        Assertions.assertThat(searchResultPage.searchInput.getText().isEmpty());
    }
    @Step("Press Enter")
    public void pressEnter(){
        searchPage.searchInput.submit();
    }

    @Step("Type query")
    public void typeQuery(String query){
        searchPage.searchInput.sendKeys(query);
    }

    @Step("Click on the search button")
    public void clickOnTheSearchButton(){
        searchPage.searchButton.click();
    }

}
