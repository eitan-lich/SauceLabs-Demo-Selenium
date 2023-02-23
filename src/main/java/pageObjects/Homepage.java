package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class Homepage extends BasePage {

	private static WebDriver driver;

	public Homepage() throws IOException {
		super();
		driver = getDriver();
		driver.get(getUrl());
	}

	By cartBtn = By.cssSelector(".btn-inverse");
	By searchInput = By.cssSelector("div#search > input[name='search']");
	By searchBtn = By.cssSelector(".fa-search");
	By desktopLink = By.linkText("Desktops");
	By laptopNotebookLink = By.linkText("Laptops & Notebooks");
	By componentsLink = By.linkText("Components");
	By tabletsLink = By.linkText("Tables");
	By softwareLink = By.linkText("Software");
	By phonePdaLink = By.linkText("Phones & PDAs");
	By cameraLink = By.linkText("Cameras");
	By mp3PlayerLink = By.linkText("MP3 Players");

	public WebElement findCartBtn() {
		return driver.findElement(cartBtn);
	}

	public WebElement findsearchInput() {
		return driver.findElement(searchInput);
	}

	public WebElement findsearchBtn() {
		return driver.findElement(searchBtn);
	}

	public WebElement findDesktopLink() {
		return driver.findElement(desktopLink);
	}

	public WebElement findLaptopNotebookLink() {
		return driver.findElement(laptopNotebookLink);
	}

	public WebElement findComponentsLink() {
		return driver.findElement(componentsLink);
	}

	public WebElement findTabletsLink() {
		return driver.findElement(tabletsLink);
	}

	public WebElement findSoftwareLink() {
		return driver.findElement(softwareLink);
	}

	public WebElement findPhonePDAsLink() {
		return driver.findElement(phonePdaLink);
	}

	public WebElement findCameraLink() {
		return driver.findElement(cameraLink);
	}

	public WebElement findMp3PlayerLink() {
		return driver.findElement(mp3PlayerLink);
	}

}
