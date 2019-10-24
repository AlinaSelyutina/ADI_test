package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
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

    @Step("Verify error message is displayed and has the correct text")
    public void verifyErrorMessage(String errorText){
        Assert.assertTrue("Error message should be displayed", searchResultPage.errorMessage.isDisplayed());
        Assert.assertEquals("Error message should contain expected text", searchResultPage.errorMessage.getText(), errorText);
    }

    @Step("Verify that empty result page is opened")
    public void verifyEmptyResultPageIsOpened(){
        Assert.assertTrue("Result page should be displayed",  searchResultPage.searchInput.isDisplayed());
        Assert.assertTrue("Search input should be empty", searchResultPage.searchInput.getText().isEmpty());
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
