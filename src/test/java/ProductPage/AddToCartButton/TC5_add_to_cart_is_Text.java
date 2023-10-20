package ProductPage.AddToCartButton;

import Base.Base;
import Pages.ProductPage.AddToCartButtonExistence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5_add_to_cart_is_Text extends Base {
    Base base = new Base();

    AddToCartButtonExistence addToCartButtonExistence = new AddToCartButtonExistence(base.webDriver);
    @Test
    public void Existence(){
        System.out.println("addToCartButtonExistence webdrivers is " +base.webDriver);
        System.out.println("new AddToCartButtonExistence(base.webDriver)" +new AddToCartButtonExistence(base.webDriver));
        Assert.assertEquals(addToCartButtonExistence.AddToCartButtonText(),"Add to cart");
    }
}
