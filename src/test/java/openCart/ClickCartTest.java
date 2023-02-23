package openCart;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Homepage;

public class ClickCartTest {

	@Test
	public void clickCart() throws IOException {
		Homepage home = new Homepage();
		home.findCartBtn().click();
	}

}
