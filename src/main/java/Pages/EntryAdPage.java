package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryAdPage {
    //WebDriver
    private WebDriver driver;
    //Locators
    @FindBy(xpath = "//p[text()='Close']")
    private WebElement closeWindow;
    //Constructor
    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }
    //Methods
    public void clickClose(){
        closeWindow.click();
    }
}
