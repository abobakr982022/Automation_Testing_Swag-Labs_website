package Cart_TCs;

import Base.Base;
import Pages.CartPage.Nav_To_Cart;
import Pages.CartPage.Remove_Item_From_Cart;
import Pages.ProductPage.AddToCartFunction;
import org.testng.annotations.Test;

public class Remove_From_Cart extends Base {
    Base base = new Base();
    Remove_Item_From_Cart remove_item_from_cart =new Remove_Item_From_Cart(base.webDriver);
    AddToCartFunction addToCartFunction = new AddToCartFunction(base.webDriver);
    Nav_To_Cart nav_to_cart = new Nav_To_Cart(base.webDriver);
    @Test
    public void Remove_Item_From_Cart() throws InterruptedException {
        System.out.println(new Remove_Item_From_Cart(base.webDriver));
        System.out.println(new AddToCartFunction(base.webDriver));
        System.out.println(new Nav_To_Cart(base.webDriver));
        addToCartFunction.AddToCartButtonClick(1);
        Thread.sleep(1000);
        nav_to_cart.Nav_To_Cart();
        Thread.sleep(1000);
        remove_item_from_cart.RemoveItemFromCart(1,1);
        Thread.sleep(1000);
    }
}
