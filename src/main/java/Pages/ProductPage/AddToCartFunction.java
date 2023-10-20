package Pages.ProductPage;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartFunction {
    static WebDriver webDriver;

    public AddToCartFunction(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void AddToCartButtonClick(int id){
        String productorder = String.format("//div[@class='pricebar']/button[%1$s]", id);
       webDriver.findElement(By.xpath(productorder)).click();
    }
    public String ButtonIsConvertToRemove(int itemorder,int id){
        String productorder = String.format("//div[@class='inventory_container']//div[@class='inventory_item'][%1$s]//button[%2$s]", itemorder,id);
        String converted_button = webDriver.findElement(By.xpath(productorder)).getText();
        System.out.println("get text() --> remove button" + converted_button);
        return converted_button;
    }
}
//div[@class='inventory_container']//div[@class='inventory_item'][1]//button[1]
