package tests.homePageTest;

import org.testng.annotations.Test;
import screens.pages.FirstHomePage;
import screens.pages.SecondHomePage;
import tests.AbstractBaseTest;

import java.util.HashMap;

public class GoogleTest extends AbstractBaseTest {

    protected String URL = "https://the-internet.herokuapp.com/windows";

    @Test
    public void checkGoogleLogo() throws InterruptedException {

        FirstHomePage firstHomePage = new FirstHomePage(driver);
        SecondHomePage secondHomePage = new SecondHomePage(driver);

        HashMap<String, String> windowTitleMap = new HashMap<>();

        openUrl(URL);
        firstHomePage.checkFirstSiteOpened();

        windowTitleMap.put(firstHomePage.getTitle(), firstHomePage.getCurrentUrl());
        firstHomePage.tapClickHereButton();
        switchToNewTab();

        secondHomePage.checkSecondSiteOpened();
        windowTitleMap.put(secondHomePage.getTitle(), secondHomePage.getCurrentUrl());
        switchToNewTab();

        firstHomePage.checkFirstSiteOpened()
                .tapElementalSeleniumButton();
        switchToNewTab();

        switchToNewTab1(windowTitleMap.get("Google"));

    }

}
