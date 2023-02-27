package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class storePage extends BasePage {


    By backPackLabel = By.id("item_4_title_link");
    By backpack = By.id("item_4_title_link");
    By addCartBtn = By.className(".btn_inventory");


    public storePage(WebDriver driver) {
        super(driver);
    }


    public boolean isProductLabelDisplayed() {
        return isDisplayed(backPackLabel);
    }

    public void addBackPack() {
        click(backpack);
        click(addCartBtn);
    }
}
