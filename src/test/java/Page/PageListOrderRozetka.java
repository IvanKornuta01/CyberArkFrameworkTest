package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageListOrderRozetka extends BasePage {
    public PageListOrderRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement checkOrder() {
        return findElement("//dt[contains(text(),' 1 товар на сумму ')]");
    }



}
