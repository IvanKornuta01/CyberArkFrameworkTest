package screens.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import screens.locators.GoogleHomePageLocators;

public class GoogleHomePage extends GoogleHomePageLocators {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleHomePage checkGoogleLogoDisplayed() {
        waitVisibilityOfElementLocated(By.xpath(GOOGLE_LOGO)).isDisplayed();
        return this;
    }






}
