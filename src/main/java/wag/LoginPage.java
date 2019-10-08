package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailFieldLogin;
    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordFieldLogin;
    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement loginEnter;
    @FindBy(css = "[href=\"/forgot-password\"]")
    private WebElement resetButton;
    @FindBy(css = ".form-control")
    private WebElement emailResetField;
    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement secondResetButton;
    @FindBy(css = ".alert")
    private WebElement messageSendEmail;

    public void inputEmailLogin(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailFieldLogin));
        emailFieldLogin.sendKeys(email);
    }


    public void inputPasswordLogin(String password) {
        passwordFieldLogin.sendKeys(password);
    }
    public void clickLoginEnter(){loginEnter.click();}
    public void clickResetButton(){resetButton.click();}

    public void inputResetEmail(String email){emailResetField.sendKeys(email);}
    public void clickSecondResetButton(){secondResetButton.click();}
    public String getMessageSendEmail(){return messageSendEmail.getText();}
}
