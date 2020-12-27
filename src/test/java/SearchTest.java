import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Проверка поиска")
    public void checkSearch() {

        logger.info("Переход на страницу");
        HomePage homePage = new HomePage(driver);

        logger.info("Начало поиска");
        SearchPage searchPage = new SearchPage(driver);

        homePage.getHeaderMenu().getSearchIcon().click();
        homePage.getHeaderMenu().getSearchField().sendKeys("java");

        logger.info("Ожидание результата поиска");
        wait15second.until(ExpectedConditions.textToBePresentInElement(
                searchPage.getProfessionHeader(), "Профессии"));

//      Проверка - Есть одна (1) или более профессий
        logger.info("Проверка числа профессий");
        int professionNumber = Integer.parseInt(searchPage.getProfessionCounter().getText());
        MatcherAssert.assertThat(professionNumber, greaterThanOrEqualTo(1));
    }
}