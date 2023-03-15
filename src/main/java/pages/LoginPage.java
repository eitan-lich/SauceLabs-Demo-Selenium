package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	By usernameInput = By.id("user-name");
	By passwordInput = By.id("password");
	By loginBtn = By.id("login-button");

	public void setUsernameInput(String username) {
		type(username, usernameInput);
	}

	public void setPasswordInput(String password) {
		type(password, passwordInput);
	}

	public StorePage clickLoginBtn() {
		click(loginBtn);
		return new StorePage(driver);
	}


	public StorePage loginWith(String username, String password) {
		setUsernameInput(username);
		setPasswordInput(password);
		return clickLoginBtn();
	}
}
