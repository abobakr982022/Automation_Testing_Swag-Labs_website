package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
     static WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void InsertUsername() {
        By insertUsername = By.id("user-name");
        webDriver.findElement(insertUsername).sendKeys("standard_user");
    }
    public void InsertPassword() {
        By insertPassword = By.id("password");
        webDriver.findElement(insertPassword).sendKeys("secret_sauce");

    }
}