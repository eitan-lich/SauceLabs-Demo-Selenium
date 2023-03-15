package cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.StorePage;

import java.io.IOException;

public class AddItemTest extends BaseTest {

    public AddItemTest() throws IOException {
        super();
    }


    @Test
    public void addBackpack() {
        StorePage storePage = loginPage.loginWith("standard_user", "secret_sauce");
        CartPage cartPage = storePage.addItemAndToCart();
        double backpackPrice = Double.parseDouble(cartPage.getItemPrice());
        System.out.println(backpackPrice);
        Assert.assertEquals(backpackPrice, 29.99);
    }
}
