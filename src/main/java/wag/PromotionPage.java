package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PromotionPage extends BasePage {
    public PromotionPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;
    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement fistNameField;
    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;
    @FindBy(css = "input[name=\"phone\"]")
    private WebElement phoneField;
    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordField;
    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> required;

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }
    public void inputFirstName(String firstName) {
        fistNameField.sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }
    public void inputPhone(String phone){phoneField.sendKeys(phone);}
    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickEmail() {
        emailField.click();
    }
    public void clickFirstName() {
        fistNameField.click();
    }
    public void clickLastName() { lastNameField.click();}
    public void clickPhone() { phoneField.click(); }
    public void clickPassword() { passwordField.click(); }

    public String getInputEmail(){ return emailField.getAttribute("value"); }
    public String getInputFirsName(){ return fistNameField.getAttribute("value"); }
    public String getInputLastName(){ return lastNameField.getAttribute("value"); }
    public String getInputPhone(){ return phoneField.getAttribute("value"); }
    public String getInputPassword(){ return passwordField.getAttribute("value"); }

    public String getEmailRequired() {
        wait.until(ExpectedConditions.visibilityOf(required.get(0)));
        return required.get(0).getText();
    }

    public String getFirstRequired() { return required.get(1).getText(); }
    public String getLastRequired() { return required.get(2).getText(); }
    public String getPhoneRequired() { return required.get(3).getText(); }
}

