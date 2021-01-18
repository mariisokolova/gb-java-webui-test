package geekbrains.features.search;

import geekbrains.base.BaseTest;
import io.qameta.allure.Feature;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import geekbrains.page.HomePage;
import geekbrains.page.SearchPage;
import static org.hamcrest.Matchers.*;


@Feature("Поиск на Geekbrains")
public class SearchTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @Test
    @DisplayName("Проверка поиска")
    public void checkSearch() {

        HomePage homePage = new HomePage(driver);

        SearchPage searchPage = new SearchPage(driver);

        // Example of JavascriptExecutor
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("document.querySelector('.gb-top-menu__item > .show-search-form').click();");

        homePage.getHeaderMenu().getSearchIcon().click();
        homePage.getHeaderMenu().getSearchField().sendKeys("java");

        wait15second.until(ExpectedConditions.textToBePresentInElement(
                searchPage.getProfessionHeader(), "Профессии"));

//      Проверка - Есть одна (1) или более профессий
        int professionNumber = Integer.parseInt(searchPage.getProfessionCounter().getText());
        MatcherAssert.assertThat(professionNumber, greaterThanOrEqualTo(1));
    }
}