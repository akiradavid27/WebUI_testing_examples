package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage {
    //WebDriver
    private WebDriver driver;
    //Locators
    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement boxSection;
    //Constructor
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    //Methods
    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(boxSection);
        actions.build().perform();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void clickAcceptAlertBoz(){
        driver.switchTo().alert().accept();
    }
}
