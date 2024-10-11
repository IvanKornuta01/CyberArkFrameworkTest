package screens.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import screens.locators.FirstHomePageLocators;

public class FirstHomePage extends FirstHomePageLocators {
    public FirstHomePage(WebDriver driver) {
        super(driver);
    }

    public FirstHomePage checkFirstSiteOpened() {
        waitVisibilityOfElementLocated(By.xpath(FIRST_SITE_LOGO)).isDisplayed();
        return this;
    }

    public FirstHomePage tapClickHereButton() {
        waitElementToBeClickable(By.xpath(CLICK_HERE_BUTTON)).click();
        return this;
    }

    public FirstHomePage tapElementalSeleniumButton() {
        waitElementToBeClickable(By.xpath(ELEMENTAL_SELENIUM_BUTTON)).click();
        return this;
    }

}
