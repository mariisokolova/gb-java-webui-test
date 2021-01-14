package crm.base;

import crm.base.BasePage;
import crm.base.SubMenu;
import crm.base.SubMenuButtons;
import org.openqa.selenium.WebDriver;
import crm.enums.ProjectsSubMenuButtons;
import crm.pages.project.ProjectsPage;

public class ProjectsSubMenu extends SubMenu {


    public ProjectsSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectsSubMenuButtons){
            switch ((ProjectsSubMenuButtons) buttons){
                case ALL_PROJECTS:
                    driver.findElement((((ProjectsSubMenuButtons)buttons).getBy())).click();
                    return new ProjectsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else{
            throw new IllegalArgumentException("Not implemented yet");
        }
    }
}
