package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.html.HTMLInputElement;

public class AlloHomePage extends BasePage {

    public AlloHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement btnRegistration() {
        return findElement("//div[@class='mh-profile']");
    }

    public WebElement newProfile() {
        return findElement("//li[@class='login-tab']");
    }

    public WebElement getFieldNewName() {
        return findElement("//input[@id='v-register-name']");
    }

    public WebElement getFieldNumberTelephone() {
        return findElement("//input[@id='v-register_telephone_number']");
    }

    public WebElement getFieldEmail() {
        return findElement("//input[@id='v-register-email']");
    }

    public WebElement getPassword() {
        return findElement("//input[@id='vregister-password']");
    }

    public WebElement btnNewRegistration() {
        return findElement("//button[@name='send']");
    }

    public WebElement getListCategories() {
        return findElement("//ul[@class='mm__list']//a[@href='https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/']");
    }

    public WebElement getFieldSmartphone() {
        return findElement("//ul[@class='mm__list']//a[@href='https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/']");
    }

    public WebElement btnIphone14Pro() {
        return findElement("//a[@href='https://allo.ua/ua/products/mobile/serija_smartfony-iphone_14_pro/'][1]");
    }

    public WebElement fieldLoginAllo() {
        return findElement("//input[@id='auth']");
    }


    public WebElement fieldPaswordAllo() {
        return findElement("//input[@id='v-login-password']");
    }

    public WebElement btnEnterAccount() {
        return findElement("//button[@class='modal-submit-button']");
    }

    public WebElement btnMyOrder() {
        return findElement("//a[@class='mh-button orders']");
    }

    public WebElement getFieldSearchByAllo() {return findElement("//input[@id='search-form__input']");    }


}
