package Test;

import BasesClass.TestInit;
import Page.GoogleHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginGoogleTest extends TestInit {
    @Test
    public void googleTestLogin() {
        GoogleHomePage google = new GoogleHomePage(driver);

        openUrl("google.com");
        google.enterBtn().click();
        google.emailField().sendKeys("vanya.kornuta01@gmail.com\n");
        sleep(5000);

        Assert.assertEquals(google.resultLoginGoogle().getText(), "Не вдається ввійти в обліковий запис");

    }
}
