package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //WebDriver
    private WebDriver driver;
    //Locators
    @FindBy(id="username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(css = "#login button")
    private WebElement loginButton;
    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Methods
    public boolean isLoginPageOpen(){
        return (driver.getTitle() != null );
    }
    public void setUsernameField(String username){
        //driver.findElement(By.id("username")).sendKeys(username);
        usernameField.sendKeys(username);
    }
    public void setPasswordField(String password){
        //driver.findElement(By.id("password")).sendKeys(password);
        passwordField.sendKeys(password);
    }
    public SecureAreaPage ClickLoginButton(){
        loginButton.click();
        return new SecureAreaPage(driver);
    }
}
