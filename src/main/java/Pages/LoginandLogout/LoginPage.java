package Pages.LoginandLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
     static WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void InsertUsername(String username) {
        By insertUsername = By.id("user-name");
        webDriver.findElement(insertUsername).sendKeys(username);
    }
    public void InsertPassword(String password) {
        By insertPassword = By.id("password");
        webDriver.findElement(insertPassword).sendKeys(password);
    }
    public void ClickOnLoginButton() {
        By click_on_login_button= By.id("login-button");
        webDriver.findElement(click_on_login_button).click();
    }
    public String Assertion_validLogin(){
        String validation =webDriver.findElement(By.cssSelector("span[class='title']")).getText();
        return validation;
    }
    public String Assertion_InvalidLogin() throws InterruptedException {
        Thread.sleep(2000);
        String validation =webDriver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        return validation;
    }
}