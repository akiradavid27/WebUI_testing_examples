package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {
    private WebDriver driver;
    //Locators
    @FindBy(id = "email")
    private WebElement emailBox;
    @FindBy(id = "form_submit")
    private WebElement retrieveButton;
    @FindBy(tagName = "h1")
    private WebElement acErrorMess;
    //Constructor
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    //Methods
    public void setEmail(String email){
        emailBox.sendKeys(email);
    }
    public ForgotPasswordPage clickButton(){
        retrieveButton.click();
        return new ForgotPasswordPage(driver);
    }
    public String getAcceptedError(){
        return acErrorMess.getText();
    }
}
