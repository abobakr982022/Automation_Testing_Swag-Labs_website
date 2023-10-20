package Pages.ProductPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartButtonExistence {
    static WebDriver webDriver;

    public AddToCartButtonExistence(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean AddToCartButtonIsDisplayed(){
        boolean add_to_cart_is_displayed = webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
        return add_to_cart_is_displayed;
    }
    public boolean AddToCartButtonIsEnabled(){
        boolean add_to_cart_is_enabled = webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isEnabled();
        return add_to_cart_is_enabled;
    }
    public String AddToCartButtonText(){
        String add_to_cart_text = webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).getText();
        return add_to_cart_text;
    }
}

