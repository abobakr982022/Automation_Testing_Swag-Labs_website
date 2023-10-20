package Pages.CheckOut;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    static WebDriver webDriver;

    public Checkout(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void ClickOnCheckOut(){
        webDriver.findElement(By.id("checkout")).click();
    }
    public void FillCheckOutInfo(String fName , String Lname , String postalcode ){
        webDriver.findElement(By.id("first-name")).sendKeys(fName);
        webDriver.findElement(By.id("last-name")).sendKeys(Lname);
        webDriver.findElement(By.id("postal-code")).sendKeys(postalcode);
    }
    public void ClickOnContinueButton(){
        webDriver.findElement(By.id("continue")).click();
    }
    public void ClickOnFinishButton(){
        webDriver.findElement(By.id("finish")).click();
    }
    public String OrderCompeletionAssertion(){
        String completeheader= webDriver.findElement(By.className("complete-header")).getText();
        return completeheader ;
    }

}
