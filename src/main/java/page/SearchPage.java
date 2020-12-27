package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.PageFactory.initElements;


public class SearchPage {

    @FindBy(css = "[id=\"professions\"] h2")
    private WebElement professionHeader;

    @FindBy(xpath = "//div[@id='professions']//header[@class='search-page-block__header']//span")
    private WebElement professionCounter;

    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

    public WebElement getProfessionHeader() {
        return professionHeader;
    }

    public WebElement getProfessionCounter() {
        return professionCounter;
    }

}
