package screens;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

@Slf4j
public abstract class AbstractBasePage {

    protected WebDriver driver;
    protected Actions actions;
    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(30);

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    private WebDriverWait getWait(Long timeout) {
        Duration waitDuration = (timeout != null && timeout > 0) ? Duration.ofSeconds(timeout) : DEFAULT_WAIT_TIME;
        return new WebDriverWait(driver, waitDuration);
    }

    protected WebElement waitVisibilityOfElementLocated(By locator, Long timeout) {
        try {
            return getWait(timeout).until(visibilityOfElementLocated(locator));
        } catch (WebDriverException e) {
            log.error("No visibility of element located by: " + locator, e);
            throw e;
        }
    }

    protected WebElement waitVisibilityOfElementLocated(By locator) {
        return waitVisibilityOfElementLocated(locator, null);
    }

    protected WebElement waitElementToBeClickable(By locator, Long timeout) {
        try {
            return getWait(timeout).until(elementToBeClickable(locator));
        } catch (WebDriverException e) {
            log.error("No clickable element located by: " + locator, e);
            throw e;
        }
    }

    protected WebElement waitElementToBeClickable(By locator) {
        return waitElementToBeClickable(locator, null);
    }

    protected List<WebElement> waitVisibilityOfElementsLocated(By locator, Long timeout) {
        try {
            return getWait(timeout).until(visibilityOfAllElementsLocatedBy(locator));
        } catch (WebDriverException e) {
            log.error("No visible elements located by: " + locator, e);
            throw e;
        }
    }

    protected List<WebElement> waitVisibilityOfElementsLocated(By locator) {
        return waitVisibilityOfElementsLocated(locator, null);
    }

    protected List<WebElement> waitElementsToBeClickable(By locator, Long timeout) {
        try {
            getWait(timeout).until(elementToBeClickable(locator));
            return driver.findElements(locator);
        } catch (WebDriverException e) {
            log.error("No clickable elements located by: " + locator, e);
            throw e;
        }
    }

    protected List<WebElement> waitElementsToBeClickable(By locator) {
        return waitElementsToBeClickable(locator, null);
    }

    public void waitUrlContainsText(String urlPath, Long timeout) {
        try {
            getWait(timeout).until(urlContains(urlPath));
        } catch (WebDriverException e) {
            log.error("This URL path is missing: " + urlPath, e);
            throw new AssertionError("This URL path is missing: " + urlPath, e);
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    protected void moveCursor(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    protected void doubleClick(WebElement element) {
        actions.doubleClick(element).build().perform();
    }

}
