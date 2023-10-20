package Base;

import Pages.LoginPage;
import Pages.LogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
//    @AfterClass
//    public void Logout() throws InterruptedException {
//        LogoutPage logoutPage = new LogoutPage(webDriver);
//        Thread.sleep(2000);
//        logoutPage.ClickOnHumburgerIcon();
//        Thread.sleep(1000);
//        logoutPage.Logout();
//        Thread.sleep(1000);
//    }
    @AfterTest
    public void Exit(){
        webDriver.quit();
    }

}
