package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class StorePage extends BasePage {


    By backPackLabel = By.id("item_4_title_link");
    By backpack = By.id("item_4_title_link");
    By addCartBtn = By.className("btn_inventory");
    By cartBtn = By.cssSelector("svg[role='img']");


    public StorePage(WebDriver driver) {
        super(driver);
    }


    public boolean isProductLabelDisplayed() {
        return isDisplayed(backPackLabel);
    }

    public void addBackPack() {
        click(backpack);
        click(addCartBtn);
    }

    public CartPage addItemAndToCart() {
        addBackPack();
        click(cartBtn);
        return new CartPage(driver);
    }
}
