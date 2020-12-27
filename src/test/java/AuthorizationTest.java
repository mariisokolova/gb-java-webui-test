import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.AuthorizationPage;
import page.HomePage;


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

        String login = "ijwqlxsckorgmpxvzd@miucce.com";
        String password = "ijwqlxsckorgmpxv3zd";
        String nameHomePage = "Главная";

        logger.info("Начало теста авторизации");
        new AuthorizationPage(driver).authorization(login,password);

        logger.info("Проверка заголовка домашней страницы");
        homePage.checkNamePage(nameHomePage);

    }
}
