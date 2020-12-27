package block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderMenu extends PageFactory {
    @FindBy(css = "[class*='gb-header__content']")
    private WebElement header;

    @FindBy(css = "[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    private WebElement searchIcon;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    private WebElement searchField;

    public HeaderMenu(WebDriver driver) {
        initElements(driver, this);
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchIcon(){
        return searchIcon;
    }
}
