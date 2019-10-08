package wag;

import org.junit.Assert;
import org.junit.Test;

public class ValueTest extends BaseTest {
    private HomePage homePage;
    private PromotionPage promotionPage;

    @Test
    public void testValue (){
        homePage = new HomePage(driver);
        promotionPage = homePage.clickFirstWalkFreeButton();
        promotionPage.inputEmail(user.getEmail());
        promotionPage.inputFirstName(user.getFirstName());
        promotionPage.inputLastName(user.getLastName());
        promotionPage.inputPhone(user.getPhone());
        promotionPage.inputPassword(user.getPassword());

        String actualResult5 = promotionPage.getInputEmail();
        String actualResult6 = promotionPage.getInputFirsName();
        String actualResult7 = promotionPage.getInputLastName();
        String actualResult8 = promotionPage.getInputPhone();
        String actualResult9 = promotionPage.getInputPassword();

         Assert.assertEquals(user.getEmail(), actualResult5);
         Assert.assertEquals(user.getFirstName(), actualResult6);
         Assert.assertEquals(user.getLastName(), actualResult7);
         Assert.assertEquals(user.getPhone(), actualResult8);
         Assert.assertEquals(user.getPassword(), actualResult9);
    }
}
