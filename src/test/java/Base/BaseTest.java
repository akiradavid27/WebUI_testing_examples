package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("http://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void TearDown(){
        driver.quit();
    }
    public static void main(String[] args){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
