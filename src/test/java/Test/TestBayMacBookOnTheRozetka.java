package Test;

import BasesClass.TestInit;
import Page.PageListOrderRozetka;
import Page.RozetkaHomePage;
import Page.SearchResultMacBook;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestBayMacBookOnTheRozetka extends TestInit {

    @Test
    public void testHeader() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);

        openUrl("rozetka.com.ua");
        rozetkaHomePage.hamburgerByRozetka().isDisplayed();
        rozetkaHomePage.iconSmileRozetka().isDisplayed();
        rozetkaHomePage.catalogHeaderRozetka().isDisplayed();
        rozetkaHomePage.getSearchFieldRozetka().isDisplayed();
        rozetkaHomePage.btnBodyLogin().isDisplayed();
        rozetkaHomePage.rozBuyUpButtonHomePage().isDisplayed();


    }


    @Test
    public void bayMacBookOnTheRozetka() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        SearchResultMacBook searchResultMacBook = new SearchResultMacBook(driver);
        PageListOrderRozetka pageListOrderRozetka = new PageListOrderRozetka(driver);

        openUrl("rozetka.com.ua/");
        rozetkaHomePage.getSearchFieldRozetka().sendKeys("MacBook\n");
        sleep(5000);
        searchResultMacBook.btnBacked().click();
        sleep(5000);
        searchResultMacBook.rozBuyUpButton().click();
        searchResultMacBook.findElement("//a[contains(text(),' Оформить заказ ')]").click();


        Assert.assertEquals(pageListOrderRozetka.findElement("//dt[contains(text(),' 1 товар на сумму ')]").getText(),"1 товар на сумму");//Щас допишу що хочу перевірити
    }
}
