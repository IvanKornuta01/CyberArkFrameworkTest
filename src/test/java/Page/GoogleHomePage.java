package Page;

import BasesClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage(WebDriver driver) {

       super(driver);
    }

    public WebElement getSearchFieldGoogle() {
        return findElement("//input[@class='gLFyf']");
    }

private static final String ENTERBTN = "//a[contains(@class,' gb_ee gb_ed')]";
    public WebElement enterBtn(){
        return driver.findElement(By.xpath(ENTERBTN));
    }
    private static final String EMAILFIELD = "//input[contains(@type,'email')]";
    public WebElement emailField(){
        return driver.findElement(By.xpath(EMAILFIELD));
    }

    public WebElement resultLoginGoogle() {
        return driver.findElement(By.xpath("//h1[contains(@id,\"headingText\")]"));
    }

    public WebElement getNameRoleHeader() {
        return driver.findElement(By.xpath("//span[@class=\"N6sL8d RES9jf\"]"));
    }
}
