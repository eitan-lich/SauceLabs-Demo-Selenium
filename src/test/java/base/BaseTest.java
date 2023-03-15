package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;

public class BaseTest {
	private WebDriver driver;
	private String url;
	private Properties prop;
	protected LoginPage loginPage;


	public BaseTest() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\resources\\config.properties");
		prop.load(data);
	}

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		driver.get(getUrl());
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public WebDriver getDriver() {
		String browser = prop.getProperty("browser");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
			driver = new ChromeDriver(option);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver	",
					System.getProperty("user.dir") + "\\resources\\IEDriver.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("No such browser");

		}


		return driver;
	}

	public String getUrl() {
		url = prop.getProperty("url");
		return url;
	}

}
