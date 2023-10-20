package Login_TCs;

import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class ValidLogin_TC extends Base {
Base base = new Base();
    LoginPage loginPage = new LoginPage(base.webDriver);

    @Test
    public void ValidLogin() throws InterruptedException {
        System.out.println("webdrivers is " +base.webDriver);
        System.out.println("webdrivers is " +new LoginPage(base.webDriver));
        loginPage.InsertUsername();
        loginPage.InsertPassword();
        Thread.sleep(3000);
    }

}
