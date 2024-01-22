package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {


    By firstNameInput = By.xpath("//input[@data-test='firstName']");
    By lastNameInput = By.xpath("//input[@data-test='lastName']");
    By zipCodeInput = By.xpath("//input[@data-test='postalCode']");
    By continueBtn = By.xpath("//input[@type='submit']");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void typeFirstName(String text) {
        type(text, firstNameInput);
    }

    public void typeLastName(String text) {
        type(text, lastNameInput);
    }

    public void typePostalCode(String text) {
        type(text, zipCodeInput);
    }

    public void clickContinueBtn() {
        click(continueBtn);
    }

}
