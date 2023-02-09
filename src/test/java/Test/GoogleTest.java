package Test;

import BasesClass.TestInit;
import Page.GoogleHomePage;
import Page.SearchResultGoogle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends TestInit {

    @Test
    public void the_Right_Advertisement() {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        SearchResultGoogle searchResultGoogle = new SearchResultGoogle(driver);

        openUrl("google.com.ua/");
        googleHomePage.getSearchFieldGoogle().sendKeys("Pen\n");

        Assert.assertEquals(searchResultGoogle.textPen().getText(),"Український ПЕН");
    }

    @Test
    public void testGoogleSearch() {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        openUrl("google.com.ua");
        googleHomePage.getSearchFieldGoogle().sendKeys("Кавомашина\n");


        Assert.assertEquals(googleHomePage.getNameRoleHeader().getText(),"Купити: Кавомашина");
    }
}