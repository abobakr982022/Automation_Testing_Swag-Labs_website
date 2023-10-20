package Pages.LoginandLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
     static WebDriver webDriver;

    public LogoutPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void ClickOnHumburgerIcon() {
        By humburgericon = By.id("react-burger-menu-btn");
        webDriver.findElement(humburgericon).click();
    }
    public void Logout() {
        By logout = By.id("logout_sidebar_link");
        webDriver.findElement(logout).click();
    }

}