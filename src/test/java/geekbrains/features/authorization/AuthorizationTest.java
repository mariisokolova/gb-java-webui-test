package geekbrains.features.authorization;

import geekbrains.base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import geekbrains.page.AuthorizationPage;
import geekbrains.page.HomePage;

import static geekbrains.common.Configuration.*;


public class AuthorizationTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/login");
    }

    @Test
    @DisplayName("Проверка авторизации на сайте")
    public void authorizationTest() {

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        HomePage homePage = new HomePage(driver);
        new AuthorizationPage(driver).authorization(LOGIN,PASSWORD);
        homePage.checkNamePage(HOMEPAGENAME);

    }
}
