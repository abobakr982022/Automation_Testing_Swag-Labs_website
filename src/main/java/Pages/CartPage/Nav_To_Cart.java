package Pages.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nav_To_Cart {
    static WebDriver webDriver;
    public Nav_To_Cart(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void Nav_To_Cart(){
        webDriver.findElement(By.className("shopping_cart_link")).click();

    }

}
