package Page;

import BasesClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultMacBook extends BasePage {


    public SearchResultMacBook(WebDriver driver) {
        super(driver);
    }

    public WebElement btnBacked() {
        return driver.findElement(By.xpath("//app-buy-button[@goods_id=\"245161903\"]"));
    }

    public WebElement rozBuyUpButton() {
        return driver.findElement(By.xpath("//li[@class='header-actions__item header-actions__item--cart']"));
    }



}
