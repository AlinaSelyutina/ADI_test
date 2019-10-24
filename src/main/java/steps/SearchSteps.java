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

    @Step("Type query into input field")
    public void typeAndSubmitQuery(String query){
        searchPage.searchInput.sendKeys(query);
        searchPage.searchInput.submit();
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
}
