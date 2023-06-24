package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage {
    //WebDriver
    private WebDriver driver;
    //Locators
    @FindBy(id = "range")
    private WebElement range;
    @FindBy(className = "sliderContainer")
    private WebElement slider;
    @FindBy(xpath = "input[@type='range']")
    private WebElement barItself;
    //Constructor
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    //Methods
    public void clickSlider(){
        barItself.click();
    }
    public void setSliderValue(double value){
        String valueText = range.getText();
        double valueWeb = Double.parseDouble(valueText);
        if(value < valueWeb){
            double valueStep = valueWeb - value;
            double amountStep = valueStep/0.5;
            int finalStep = (int) amountStep;
            for(int j=0; j<finalStep; j++){
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.build().perform();
            }
        } else if(value > valueWeb){
            double valueStep = value - valueWeb;
            double amountStep = valueStep/0.5;
            int finalStep = (int) amountStep;
            for(int j=0; j<finalStep; j++){
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.build().perform();
            }
        }
    }
}
