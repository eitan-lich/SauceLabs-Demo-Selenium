package checkout;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;

import java.io.IOException;

public class CheckoutTests extends BaseTest {

    private CheckoutPage checkoutPage;

    public CheckoutTests() throws IOException {
        super();
    }


    @BeforeMethod
    public void getCheckoutPage() {
        StorePage storepage = loginPage.loginWith("standard_user","secret_sauce");
        CartPage cartpage = storepage.addItemAndToCart();
        checkoutPage = cartpage.checkOut();
    }

    @Test
    public void missingFirstName() throws InterruptedException {
        checkoutPage.typeLastName("Test");
        checkoutPage.typePostalCode("12345");
        checkoutPage.clickContinueBtn();
        Thread.sleep(2000);
    }

    @Test
    public void missingLastName() {

    }


    @Test
    public void missingPostalCode() {

    }
}
