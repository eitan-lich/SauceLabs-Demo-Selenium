package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By removeBtn = By.cssSelector(".btn_secondary cart_button");
    By checkoutBtn = By.cssSelector(".checkout_button");
    By continueShoppingBtn = By.linkText("CONTINUE SHOPPING");
    By itemPrice = By.cssSelector(".inventory_item_price");


    public void removeItem() {
        click(removeBtn);
    }

    public CheckoutPage checkOut() {
        click(checkoutBtn);
        return new CheckoutPage(driver);
    }

    public void continueShopping() {
        click(continueShoppingBtn);
    }

    public String getItemPrice() {
        return find(itemPrice).getText();
    }
}
