package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends PageObject{
    @FindBy(tagName = "h1")
    public WebElement title;
}
