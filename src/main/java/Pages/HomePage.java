package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Pages to visit
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }/*
    public HoverPage clickHoverPage(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public JsAlertsPage clickJsAlerts(){
        clickLink("JavaScript Alerts");
        return new JsAlertsPage(driver);
    }
    public SubmitFilePage clickSubmitfilePage(){
        clickLink("File Upload");
        return new SubmitFilePage(driver);
    }*/
    public EntryAdPage clickEntryAdPage(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    // Useful method
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
