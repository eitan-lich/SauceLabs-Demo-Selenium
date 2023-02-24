package loginTests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import base.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	public LoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void goBack() {
		driver.get(getUrl());
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

	@AfterMethod
	public void snap() throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File img = screenshot.getScreenshotAs(OutputType.FILE);
		int number = (int)((Math.random()*100)+10);
		File newFile = new File("C:\\Users\\Eitan\\Desktop\\sample\\"+number+".jpg");
		Files.copy(Paths.get(img.getAbsolutePath()), Paths.get(newFile.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
	}
}
