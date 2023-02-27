package login;

import java.io.IOException;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	public LoginTest() throws IOException {
		super();
	}

	@Test
	public void loginCorrect() {
		loginPage.setUsernameInput("standard_user");
		loginPage.setPasswordInput("secret_sauce");
		loginPage.clickLoginBtn();
	}

	@Test
	public void loginWrongUsername() {
		loginPage.setUsernameInput("t");
		loginPage.setPasswordInput("secret_sauce");
		loginPage.clickLoginBtn();
	}

	@Test
	public void loginWrongPassword() {
		loginPage.setUsernameInput("standard_user");
		loginPage.setPasswordInput("342");
		loginPage.clickLoginBtn();
	}
}
