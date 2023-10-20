package ProductPage.AddToCartFunction;

import Base.Base;
import Pages.ProductPage.AddToCartFunction;
import org.testng.annotations.Test;

public class TC6_AddToCartFunction extends Base {
     Base base = new Base();
     AddToCartFunction addToCartFunction = new AddToCartFunction(base.webDriver);
     @Test
    public void ClickOnAddToCartBtn() throws InterruptedException {
         System.out.println(new AddToCartFunction(base.webDriver));
         addToCartFunction.AddToCartButtonClick(1);
         Thread.sleep(1500);
     }

}
