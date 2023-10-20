package ProductPage.AddToCartFunction;

import Base.Base;
import Pages.ProductPage.AddToCartFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC7_AddToCartButtonToRemoveButton extends Base {
     Base base = new Base();
     AddToCartFunction addToCartFunction = new AddToCartFunction(base.webDriver);
     @Test
    public void ToRemoveButtonAssertion() throws InterruptedException {
         System.out.println(new AddToCartFunction(base.webDriver));
         addToCartFunction.AddToCartButtonClick(1);
         Assert.assertEquals("Remove" +
                 "",addToCartFunction.ButtonIsConvertToRemove(1));
         Thread.sleep(1500);
     }

}
