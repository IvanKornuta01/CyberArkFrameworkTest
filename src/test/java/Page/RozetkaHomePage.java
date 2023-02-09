package Page;

import BasesClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchFieldRozetka() {
        return findElement("//input[@name='search']");
    }

    public WebElement hamburgerByRozetka() {
        return findElement("//button[@class='header__button ng-tns-c109-1']");
    }

    public WebElement iconSmileRozetka() {
        return findElement("//a[@class='header__logo']");
    }

    public WebElement catalogHeaderRozetka() {
        return findElement("//button[@id='fat-menu']");
    }

    public WebElement btnBodyLogin() {
        return findElement("//rz-user[@class='header-actions__component']");
    }

    public WebElement rozBuyUpButtonHomePage() {
        return findElement("//li[@class='header-actions__item header-actions__item--cart']");
    }

}
