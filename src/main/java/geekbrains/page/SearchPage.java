package geekbrains.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.PageFactory.initElements;


public class SearchPage {

    @FindBy(css = "[id=\"professions\"] h2")
    private WebElement professionHeader;

    @FindBy(xpath = "//*[@id=\"professions\"]/div[1]/header/ul/li/a/span")
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
