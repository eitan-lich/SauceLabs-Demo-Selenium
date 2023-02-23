package cartTests;

import java.io.IOException;

import base.BaseTests;
import org.testng.annotations.Test;

public class ClickCartTest extends BaseTests {

	public ClickCartTest() throws IOException {
		super();
	}

	@Test
	public void clickCart()  {
		homePage.findCartBtn().click();
	}

}
