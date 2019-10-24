package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageObject{
    @FindBy(className = "mw-search-nonefound")
    public WebElement errorMessage;

    @FindBy(name = "search")
    public WebElement searchInput;
}
