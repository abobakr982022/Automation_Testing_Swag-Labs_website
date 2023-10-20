package ProductPage.AddToCartButton;

import Base.Base;
import Pages.ProductPage.AddToCartButtonExistence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_add_to_cart_is_displayed extends Base {
    Base base = new Base();
    AddToCartButtonExistence addToCartButtonExistence = new AddToCartButtonExistence(base.webDriver);
    @Test
    public void IsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("AddToCartButtonExistence webdrivers is " +base.webDriver);
        System.out.println("new AddToCartButtonExistence(base.webDriver)" +new AddToCartButtonExistence(base.webDriver));
        Assert.assertTrue(addToCartButtonExistence.AddToCartButtonIsDisplayed());
    }
}
