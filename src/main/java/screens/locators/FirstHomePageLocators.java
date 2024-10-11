package screens.locators;

import org.openqa.selenium.WebDriver;
import screens.AbstractBasePage;

public class FirstHomePageLocators extends AbstractBasePage {

    public FirstHomePageLocators(WebDriver driver) {
        super(driver);
    }

    public static final String FIRST_SITE_LOGO = "//div[@id='content']//h3";
    public static final String CLICK_HERE_BUTTON = "//div[@id='content']//a";
    public static final String ELEMENTAL_SELENIUM_BUTTON = "//div[@id='page-footer']//div/a";

}
