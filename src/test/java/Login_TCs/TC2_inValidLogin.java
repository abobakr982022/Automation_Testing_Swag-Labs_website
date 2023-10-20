package Login_TCs;

import Base.Base;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_inValidLogin extends Base {
Base base = new Base();
    LoginPage loginPage = new LoginPage(base.webDriver);

    @Test
    public void ValidLogin() throws InterruptedException {
        System.out.println("webdrivers is " +base.webDriver);
        System.out.println("webdrivers is " +new LoginPage(base.webDriver));
        loginPage.InsertUsername("invalid");
        loginPage.InsertPassword("invalid");
        Thread.sleep(1000);
        loginPage.ClickOnLoginButton();
        Thread.sleep(3000);
        System.out.println("validation of logout" + loginPage.Assertion_InvalidLogin());
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",loginPage.Assertion_InvalidLogin(),"the expected message != the actual message");

    }

}
