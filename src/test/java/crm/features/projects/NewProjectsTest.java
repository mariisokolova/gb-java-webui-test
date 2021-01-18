package crm.features.projects;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import crm.enums.ProjectsSubMenuButtons;
import crm.pages.project.ProjectsPage;
import crm.pages.AuthorizationPage;
import crm.enums.NavigationBarTabs;
import crm.base.BaseTest;

import static crm.common.Configuration.*;

@Feature("Создание нового проекта в CRM")
public class NewProjectsTest extends BaseTest{

    @Test
    void createNewProjectsTest() throws InterruptedException {

        // Generate name for test user. See more at https://github.com/DiUS/java-faker
        Faker faker = new Faker();
        String fakeName = faker.name().fullName();

        ProjectsPage projectPage = (ProjectsPage) new AuthorizationPage(driver)
                .authorize(LOGIN, PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.PROJECTS)
                .clickSubMenuButton(ProjectsSubMenuButtons.ALL_PROJECTS);

        projectPage
                .clickOnCreateNewProjectsButton()
                .enterProjectName(fakeName)
                .clickDropDownOrganization()
                .choiceDropDownOrganization()
                .selectBusinessUnit(1)
                .clickDropDownContactPerson()
                .sendDropDownContactPerson()
                .choiceDropDownContactPerson()
                .enterCuratorName("Student Student")
                .enterRpName("Student Student")
                .enterAdministratorName("Student Student")
                .enterManagerName("Student Student")
                .clickSubmit()
                .checkNewProjectsPopUp();
    }
}
