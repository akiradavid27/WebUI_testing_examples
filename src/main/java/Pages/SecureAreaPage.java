package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage {
    //WebDriver
    private WebDriver driver;
    //Locators
    @FindBy(id="flash")
    private WebElement statusAlert;
    //Constructor
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Methods
    public String getAlertText(){
        return statusAlert.getText();
    }
}
