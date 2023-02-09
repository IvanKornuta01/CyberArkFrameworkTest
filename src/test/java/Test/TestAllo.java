package Test;

import BasesClass.TestInit;
import Page.AlloHomePage;
import Page.AlloIphonePage;
import Page.MyprofielOrderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestAllo extends TestInit {

    @Test
    public void testAlloRegistratoin() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);

        openUrl("allo.ua");
        alloHomePage.btnRegistration().click();
        alloHomePage.newProfile().click();
        alloHomePage.getFieldNewName().sendKeys("Vanya");
        alloHomePage.getFieldNumberTelephone().sendKeys("986727276");
        alloHomePage.getFieldEmail().sendKeys("klikolik46132@gmail.com");
        alloHomePage.getPassword().sendKeys("142536");
        alloHomePage.btnNewRegistration().click();

        Assert.assertEquals(alloHomePage.findElement("//button[@class='modal-submit-button blu-submit-button']").getText(),"Надіслати");

    }


    @Test

    public  void testAlloListChoise() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        AlloIphonePage alloIphonePage = new AlloIphonePage(driver);


        openUrl("allo.ua");
        alloHomePage.actionsMoveTo(alloHomePage.getFieldSmartphone());
        alloHomePage.btnIphone14Pro().click();

        Assert.assertEquals(alloIphonePage.getToolbarChoise().getText(),"iPhone 14 Pro");
    }

    @Test

    public void testLoginAllo() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        MyprofielOrderPage myprofielOrderPage = new MyprofielOrderPage(driver);

        openUrl("allo.ua");
        alloHomePage.btnRegistration().click();
        alloHomePage.fieldLoginAllo().sendKeys("+380986727275");
        alloHomePage.fieldPaswordAllo().sendKeys("142536");
        alloHomePage.btnEnterAccount().click();
        sleep(5000);
        alloHomePage.btnRegistration().click();
        alloHomePage.btnMyOrder().click();

        Assert.assertEquals(myprofielOrderPage.getFieldHello___().getText(),"Вітаємо, Vanya");
    }


    @Test
    public void testCheckBoxAllo() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);

        openUrl("allo.ua");
        alloHomePage.getFieldSearchByAllo().sendKeys("Мобільні телефони\n");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='accordion f-content__additional active']//a[@class='f-check']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }

        Assert.assertEquals(checkboxes.size(), 7);
    }
}
