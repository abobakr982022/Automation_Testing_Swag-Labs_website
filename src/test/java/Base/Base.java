package Base;
import Pages.LoginandLogout.LoginPage;
import Pages.LoginandLogout.LogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Base {

     public static WebDriver webDriver ;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        Thread.sleep(2000);
        webDriver.get("https://www.saucedemo.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
        Thread.sleep(2000);
        System.out.println(webDriver);
    }
    @BeforeMethod
    public void Login() throws InterruptedException {
        Thread.sleep(1000);
        LoginPage loginPage = new LoginPage(webDriver);
        System.out.println("webdrivers is " +webDriver);
        System.out.println("webdrivers is " +new LoginPage(webDriver));
        loginPage.InsertUsername("standard_user");
        loginPage.InsertPassword("secret_sauce");
        Thread.sleep(1000);
        loginPage.ClickOnLoginButton();
        Thread.sleep(3000);
        Assert.assertEquals("Products",loginPage.Assertion_validLogin(),"Login doesn't complete");
    }
    @AfterMethod
    public void Logout() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Thread.sleep(2000);
        logoutPage.ClickOnHumburgerIcon();
        Thread.sleep(1000);
        logoutPage.Logout();
        Thread.sleep(1000);
    }
    @AfterTest
    public void Exit(){
        webDriver.quit();
    }
}
