package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    private WebElement firstWalkFreeButton;

    public PromotionPage clickFirstWalkFreeButton(){
        firstWalkFreeButton.click();
        return new PromotionPage(driver);
    }
    @FindBy(css = ".sc-ifAKCX.fHUled")
    private List<WebElement> mainMenu;

    public LoginPage clickLoginButton(){
        mainMenu.get(3).click();
        return new LoginPage(driver);
    }


}
