package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https:\\en.wikipedia.org")
public class SearchPage extends PageObject {
    @FindBy(id = "searchInput")
    public WebElement searchInput;
}
