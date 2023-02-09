package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyprofielOrderPage extends BasePage {
    public MyprofielOrderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFieldHello___() {
        return findElement("//h2[@class='customer-account__title']");
    }
}
