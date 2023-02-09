package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultGoogle extends BasePage {
    public SearchResultGoogle  (WebDriver driver) {
        super(driver);
    }

    public WebElement textPen () {
        return findElement("//h2[@class='qrShPb kno-ecr-pt PZPZlf HOpgu q8U8x']");
    }
}
