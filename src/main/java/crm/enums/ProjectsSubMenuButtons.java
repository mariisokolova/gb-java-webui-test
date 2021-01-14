package crm.enums;

import org.openqa.selenium.By;
import crm.base.SubMenuButtons;

public enum ProjectsSubMenuButtons implements SubMenuButtons {
    ALL_PROJECTS("//li[@data-route='crm_project_index']/a");

    private final By by;

    ProjectsSubMenuButtons(String xpath){
        this.by = By.xpath(xpath);
    }

    public By getBy(){
        return by;
    }
}