package crm.pages.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import crm.base.BasePage;

public class NewProjectsPage extends BasePage {

    @FindBy(name = "crm_project[name]")
    private WebElement projectsNameInput;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    private WebElement clickDropDownMenu_organization;

    @FindBy(xpath = "//div[@class='select2-result-label' and text()='Test Organisation_100']")
    private WebElement choiceDropDownMenu_organization;

    @FindBy(xpath = "//*[@class='select2-container select2']")
    private WebElement clickDropDownMenu_ContactPerson;

    @FindBy(css = ".select2-focused")
    private WebElement sendDropDownMenu_ContactPerson;

    @FindBy(css = ".select2-result-label")
    private WebElement choiceDropDownMenu_ContactPerson;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement businessUnitDropDownSelect;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement businessUnitNameInput;
    // Research & Development

    @FindBy(name = "crm_project[curator]")
    private WebElement curatorNameInput;
    // Student Student

    @FindBy(name = "crm_project[rp]")
    private WebElement rpNameInput;

    @FindBy(name = "crm_project[administrator]")
    private WebElement administratorNameInput;

    @FindBy(name = "crm_project[manager]")
    private WebElement managerNameInput;

    @FindBy(css = "button[class='btn btn-success action-button']")
    private WebElement submitAndSaveButton;

    public NewProjectsPage(WebDriver driver) {
        super(driver);
    }

    public NewProjectsPage enterProjectName(String description) {
        projectsNameInput.sendKeys(description);
        return this;
    }

    public NewProjectsPage clickDropDownOrganization() {
        clickDropDownMenu_organization.click();
        return this;
    }

    public NewProjectsPage choiceDropDownOrganization() {
        choiceDropDownMenu_organization.click();
        return this;
    }

    public NewProjectsPage clickDropDownContactPerson() {
        clickDropDownMenu_ContactPerson.click();
        return this;
    }

    public NewProjectsPage sendDropDownContactPerson() {
        sendDropDownMenu_ContactPerson.sendKeys("Fdgdg Fdgdfgdfgdfg");
        return this;
    }

    public NewProjectsPage choiceDropDownContactPerson() {
        choiceDropDownMenu_ContactPerson.click();
        return this;
    }

    public NewProjectsPage selectBusinessUnit(int value){
        Select businessUnitDropDown = new Select(businessUnitDropDownSelect);
        businessUnitDropDown.selectByIndex(value);
        return this;
    }

    public NewProjectsPage enterCuratorName(String description) {
        curatorNameInput.sendKeys(description);
        return this;
    }

    public NewProjectsPage enterRpName(String description) {
        rpNameInput.sendKeys(description);
        return this;
    }

    public NewProjectsPage enterAdministratorName(String description) {
        administratorNameInput.sendKeys(description);
        return this;
    }

    public NewProjectsPage enterManagerName(String description) {
        managerNameInput.sendKeys(description);
        return this;
    }

    public ProjectsPage clickSubmit() {
        submitAndSaveButton.click();
        return new ProjectsPage(driver);
    }
}
