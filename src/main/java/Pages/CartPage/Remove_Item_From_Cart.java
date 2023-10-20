package Pages.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Remove_Item_From_Cart {
    static WebDriver webDriver;
    public Remove_Item_From_Cart(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void RemoveItemFromCart(int itemorder, int buttonorder) throws InterruptedException {
        String remove =String.format("//div[@class='cart_list']//div[@class='cart_item'][%1$s]//div[@class='item_pricebar']//button[%2$s]",itemorder,buttonorder);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(remove)).click();

    }

}
