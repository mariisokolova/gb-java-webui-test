import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.AuthorizationPage;
import page.HomePage;


public class AuthorizationTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/login");
    }

    @Test
    public void authorizationTest() {

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        HomePage homePage = new HomePage(driver);

        String login = "ijwqlxsckorgmpxvzd@miucce.com";
        String password = "ijwqlxsckorgmpxv3zd";
        String nameHomePage = "Главная";

        new AuthorizationPage(driver).authorization(login,password);

        homePage.checkNamePage(nameHomePage);

    }
}
