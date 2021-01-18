package crm.features.authorization;

import crm.base.BaseTest;
import crm.pages.AuthorizationPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static crm.common.Configuration.*;

@Feature("Авторизация CRM")
public class AuthorizationTest extends BaseTest {

    @Test
    @DisplayName("Проверка авторизации на сайте")
    void loginTest() {
        new AuthorizationPage(driver)
                .authorize(LOGIN, PASSWORD)
                .checkUrl(BASE_URL);
    }
}
