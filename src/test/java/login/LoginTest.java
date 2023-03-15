package login;

import java.io.IOException;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class LoginTest extends BaseTest {

	public LoginTest() throws IOException {
		super();
	}

	@Test
	public void loginCorrect() {
		loginPage.setUsernameInput("standard_user");
		loginPage.setPasswordInput("secret_sauce");
		StorePage storePage = loginPage.clickLoginBtn();
		storePage.addBackPack();
	}
}
