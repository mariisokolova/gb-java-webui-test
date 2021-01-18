package crm.enums;

import org.openqa.selenium.By;

public enum NavigationBarTabs {
    PROJECTS("//span[@class='title' and text()='Проекты']");
    // Add more tabs here if needed

    private final By by;

    NavigationBarTabs(String xpath){
        this.by = By.xpath(xpath);
    }

    public By getBy(){
        return by;
    }
}
