package geekbrains.page;

import geekbrains.block.HeaderMenu;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.PageFactory.initElements;


public class HomePage {

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;

    private HeaderMenu headerMenu;

    public HomePage(WebDriver driver) {
        initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }

}
