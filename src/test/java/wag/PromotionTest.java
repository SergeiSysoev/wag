package wag;

import org.junit.Assert;
import org.junit.Test;

public class PromotionTest extends BaseTest {

    private HomePage homePage;
    private PromotionPage promotionPage;

    @Test
    public void testPromotion(){
        homePage = new HomePage(driver);
        promotionPage = homePage.clickFirstWalkFreeButton();

        promotionPage.clickFirstName();
        promotionPage.clickLastName();
        promotionPage.clickEmail();
        promotionPage.clickPhone();
        promotionPage.clickPassword();


        String actualResult1 = promotionPage.getEmailRequired();
        String actualResult2 = promotionPage.getFirstRequired();
        String actualResult3 = promotionPage.getLastRequired();
        String actualResult4 = promotionPage.getPhoneRequired();


        System.out.println(actualResult1);
        System.out.println(actualResult2);
        System.out.println(actualResult3);
        System.out.println(actualResult4);


        Assert.assertEquals("required", actualResult1);
        Assert.assertEquals("required", actualResult2);
        Assert.assertEquals("required", actualResult3);
        Assert.assertEquals("required", actualResult4);

    }
}
