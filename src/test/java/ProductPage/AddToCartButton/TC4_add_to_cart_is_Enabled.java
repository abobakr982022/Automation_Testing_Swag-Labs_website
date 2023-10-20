package ProductPage.AddToCartButton;

import Base.Base;
import Pages.ProductPage.AddToCartButtonExistence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_add_to_cart_is_Enabled extends Base {
    Base base = new Base();

    AddToCartButtonExistence addToCartButtonExistence = new AddToCartButtonExistence(base.webDriver);
    @Test
    public void IsEnabled(){
        System.out.println("addToCartButtonExistence webdrivers is " +base.webDriver);
        System.out.println("new AddToCartButtonExistence(base.webDriver)" +new AddToCartButtonExistence(base.webDriver));
        Assert.assertTrue(addToCartButtonExistence.AddToCartButtonIsEnabled());
    }
}
