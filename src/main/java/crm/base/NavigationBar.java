package crm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import crm.enums.NavigationBarTabs;

public class NavigationBar extends BasePage {
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public SubMenu moveCursorToNavigationTab(NavigationBarTabs tab){
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();

        switch (tab){
            case PROJECTS:
                return new ProjectsSubMenu(driver);
            default:
                throw new IllegalArgumentException
                        ("Other tabs are not implemented");
        }
    }
}
