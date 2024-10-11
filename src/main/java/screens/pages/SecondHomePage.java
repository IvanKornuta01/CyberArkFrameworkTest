package screens.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import screens.locators.SecondHomePageLocators;

public class SecondHomePage extends SecondHomePageLocators {

    public SecondHomePage(WebDriver driver) {
        super(driver);
    }

    public SecondHomePage checkSecondSiteOpened() {
        waitVisibilityOfElementLocated(By.xpath(SECOND_SITE_LOGO)).isDisplayed();
        return this;
    }

}
