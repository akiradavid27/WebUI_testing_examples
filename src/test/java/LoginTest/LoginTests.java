package LoginTest;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void TestSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        Assert.assertTrue(loginPage.isLoginPageOpen());
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged"));
    }
}
