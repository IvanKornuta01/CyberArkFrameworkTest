package BasesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement findElement(String locator) {
      return driver.findElement(By.xpath(locator));
    }

    public void actionsMoveTo(WebElement element){
       Actions actions = new Actions(driver);
       actions.moveToElement(element).build().perform();
       }






}
