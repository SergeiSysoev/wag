package wag;

import org.junit.Assert;
import org.junit.Test;

public class ResetLoginTest extends BaseTest{
    private HomePage homePage;
    private LoginPage loginPage;


    @Test
    public void testResetLogin()throws InterruptedException{
        homePage = new HomePage(driver);

        loginPage = homePage.clickLoginButton();

        Thread.sleep(1000);

        loginPage.clickResetButton();
        Thread.sleep(5000);

        loginPage.inputResetEmail(user.getEmail());
        Thread.sleep(5000);

        loginPage.clickSecondResetButton();

        Thread.sleep(5000);
        String actualResult9 = loginPage.getMessageSendEmail();

        Thread.sleep(5000);
        Assert.assertEquals("Your request was successfully sent.", actualResult9);


    }
}
