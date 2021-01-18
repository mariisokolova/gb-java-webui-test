package crm.pages.project;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import crm.base.BasePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectsPage extends BasePage {
    @FindBy(xpath = "//a[@href='/project/create/']/parent::div")
    private WebElement createNewProjectsButton;

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Клик на кнопку создания проекта")
    public NewProjectsPage clickOnCreateNewProjectsButton() {
        createNewProjectsButton.click();
        return new NewProjectsPage(driver);
    }

    @Step("Проверка успешности создания проекта")
    public ProjectsPage checkNewProjectsPopUp() {
        String message = wait10second.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("div[class='message']")))
                .getText();
        assertTrue(message.contains("Проект сохранен"));
        return this;
    }
}
