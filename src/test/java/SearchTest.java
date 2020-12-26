import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.BaseTest;
import page.HomePage;
import page.SearchPage;
import static org.hamcrest.Matchers.*;


public class SearchTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @Test
    public void checkSearch() {

        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        homePage.getHeaderMenu().getSearchIcon().click();
        homePage.getHeaderMenu().getSearchField().sendKeys("java");

        wait15second.until(ExpectedConditions.textToBePresentInElement(
                searchPage.getProfessionHeader(), "Профессии"));

//      Проверка - Есть одна (1) или более профессий
        int professionNumber = Integer.parseInt(searchPage.getProfessionCounter().getText());
        MatcherAssert.assertThat(professionNumber, greaterThanOrEqualTo(1));
    }
}