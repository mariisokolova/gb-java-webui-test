package crm.pages;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import crm.base.BasePage;
import crm.base.NavigationBar;

import static org.hamcrest.Matchers.*;

public class HomePage extends BasePage {

    private NavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        super(driver);
        this.navigationBar = new NavigationBar(driver);
    }

    public void checkUrl(String baseUrl) {
        MatcherAssert.assertThat(driver.getCurrentUrl(), equalTo(baseUrl));
    }

    public NavigationBar getPageNavigation() {
        return navigationBar;
    }

}
