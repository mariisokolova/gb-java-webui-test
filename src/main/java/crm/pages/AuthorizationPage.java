package crm.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import crm.base.BasePage;

public class AuthorizationPage extends BasePage {

    @FindBy(css = "input[name='_username']")
    private WebElement inputLogin;

    @FindBy(css ="input[name='_password']")
    private WebElement inputPassword;

    @FindBy(css = "button[name='_submit']")
    private WebElement buttonSignIn;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Ввод логина")
    public AuthorizationPage enterLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    @Step("Ввод пароля")
    public AuthorizationPage enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    @Step("Отправка формы")
    public HomePage clickLoginButton() {
        buttonSignIn.click();
        return new HomePage(driver);
    }

    public HomePage authorize(String login, String password) {
        enterLogin(login);
        enterPassword(password);
        clickLoginButton();
        return new HomePage(driver);
    }
}
