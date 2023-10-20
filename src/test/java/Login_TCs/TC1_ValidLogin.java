package Login_TCs;

import Base.Base;
import Pages.LoginandLogout.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_ValidLogin extends Base {
Base base = new Base();
    LoginPage loginPage = new LoginPage(base.webDriver);

    @Test
    public void ValidLogin() throws InterruptedException {
        System.out.println("webdrivers is " +base.webDriver);
        System.out.println("webdrivers is " +new LoginPage(base.webDriver));
        //Assert.assertEquals("Products",loginPage.Assertion_validLogin(),"Login doesn't complete");

    }

}
