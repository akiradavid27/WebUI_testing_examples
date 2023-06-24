package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    //WebDriver
    private WebDriver driver;
    //Locators
    @FindBy(id = "dropdown")
    private WebElement dropdown;
    //Constructor
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Methods
    public boolean isDropdownPageOpen(){
        return (driver.getTitle()!=null);
    }
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements
                .stream()
                .map(e->e.getText())
                .collect(Collectors.toList());
    }
    private Select findDropdownElement(){
        return new Select(dropdown);
    }
}
