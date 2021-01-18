package crm.base;

import org.openqa.selenium.WebDriver;

public abstract class SubMenu extends BasePage{

    public SubMenu(WebDriver driver) {
        super(driver);
    }

    abstract public BasePage clickSubMenuButton(SubMenuButtons buttons);
}
