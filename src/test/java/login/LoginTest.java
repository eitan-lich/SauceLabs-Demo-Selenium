package login;

import java.io.IOException;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class LoginTest extends BaseTest {

	public LoginTest() throws IOException {
		super();
	}


	@BeforeMethod
	public void getLoginPage() {
		driver.get(getUrl());
	}

	@Test
	public void loginCorrect() {
		StorePage storePage = loginPage.loginWith("standard_user", "secret_sauce");
		storePage.addBackPack();
	}

	@Test
	public void loginWrong() {
		loginPage.loginWith("standard_user", "1234");
		Assert.assertEquals(loginPage.getErrorMessageWrongInfo(), "Epic sadface: Username and password do not match any user in this service");
	}

	@Test
	public void loginMissingUsername() {
		loginPage.loginWith("","secret_sauce");
		Assert.assertEquals(loginPage.getErrorMessageMissingUsername(), "Epic sadface: Username is required");
	}

	@Test
	public void loginMissingPassword() {
		loginPage.loginWith("standard_user\n","");
		Assert.assertEquals(loginPage.getErrorMessageMissingPassword(), "Epic sadface: Password is required");
	}

	@Test
	public void loginMissingBoth() {
		loginPage.loginWith("","");
		Assert.assertEquals(loginPage.getErrorMessageMissingUsername(), "Epic sadface: Username is required");
	}
}
