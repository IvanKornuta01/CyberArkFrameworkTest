package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

@Slf4j
abstract public class AbstractBaseTest {

    @Getter
    protected static WebDriver driver;
    protected WebDriverWait wait;
    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(30);

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.safaridriver().setup();

        driver = new SafariDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME);
        log.info("===>>> Setup driver: " + driver);
    }

//    @BeforeTest
//    public void openChromeBrowser() {
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--allowed-ips=*");
//
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//
//        wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME);
//
//        log.info("===>>> Setup driver: " + driver);
//    }


    @AfterClass
    public void closeBrowser() {
        log.info("===>>> Close driver: " + driver);
        driver.quit();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    protected boolean urlContains(String urlPath) {
        return driver.getCurrentUrl().contains(urlPath);
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitUntilNumberOfTabToBe(int tabNumber) {
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
        } catch (WebDriverException e) {
            log.error("No tabs with this number: " + tabNumber);
            throw new AssertionError("No tabs with this number: " + tabNumber);
        }
    }

    public void goToNextTab(int tabNumber) {
        waitUntilNumberOfTabToBe(tabNumber);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber - 1));
    }

    public void switchToNewTab() {
        String currentWindowHandle = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void switchToNewTab1(String window1) {
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (window.equals(window1)) {
                driver.switchTo().window(window1);
                break;
            }
        }
    }

    public String getMainWindowHandle() {
        return driver.getWindowHandle();
    }

    public Set<String> getAllWindowHandles() {
        return driver.getWindowHandles();
    }

    public void switchToWindow(String windowHandle) {
        driver.switchTo().window(windowHandle);
    }

    public void switchToMainWindow(String mainWindowHandle) {
        driver.switchTo().window(mainWindowHandle);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void switchToIframe(WebElement iframe) {
        driver.switchTo().frame(iframe);
    }

}
