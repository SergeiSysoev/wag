package wag;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {
    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testLogin() throws InterruptedException{

        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginButton();
//        Thread.sleep(1000);



        loginPage.inputEmailLogin(user.getEmail());
        loginPage.inputPasswordLogin(user.getPassword());

        loginPage.clickLoginEnter();
        Thread.sleep(3000);

        String expectedResult  = "https://app.wagwalking.com/signup/dog-info";
        Assert.assertEquals(expectedResult, driver.getCurrentUrl());
    }
}
