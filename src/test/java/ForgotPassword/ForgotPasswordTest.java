package ForgotPassword;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testForgotPassword() {
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("noobmaster@falsemail.com");
        var resultForgotPassword = forgotPasswordPage.clickButton();
        Assert.assertTrue(resultForgotPassword.getAcceptedError().contains("Internal Server Error"));
    }
}
