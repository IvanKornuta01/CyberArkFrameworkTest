package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloIphonePage extends BasePage {
    public AlloIphonePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getToolbarChoise() {
        return findElement("//div[@class='toolbar-block']//a[@data-id='serija_smartfony']");
    }
}
