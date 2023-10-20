package CheckOut;

import Base.Base;
import Pages.CartPage.Nav_To_Cart;
import Pages.CheckOut.Checkout;
import Pages.ProductPage.AddToCartFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkout_TC extends Base {
    Base base = new Base();
    Checkout checkout=new Checkout(base.webDriver);
    AddToCartFunction addToCartFunction = new AddToCartFunction(base.webDriver);
    Nav_To_Cart nav_to_cart = new Nav_To_Cart(base.webDriver);
    @Test
    public void Checkout() throws InterruptedException {
        System.out.println(new AddToCartFunction(base.webDriver));
        System.out.println(new Nav_To_Cart(base.webDriver));
        System.out.println(new Checkout(base.webDriver));
        addToCartFunction.AddToCartButtonClick(1);
        Thread.sleep(1000);
        nav_to_cart.Nav_To_Cart();
        Thread.sleep(1000);
        checkout.ClickOnCheckOut();
        Thread.sleep(1000);
        checkout.FillCheckOutInfo("abubakr","ahmed","22222");
        checkout.ClickOnContinueButton();
        Thread.sleep(1000);
        checkout.ClickOnFinishButton();
        Thread.sleep(1000);
        Assert.assertEquals("Thank you for your order!",checkout.OrderCompeletionAssertion());



    }

}
