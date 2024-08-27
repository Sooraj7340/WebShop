package webshop_test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepackage.BaseTest;
import junit.framework.Assert;
import webshop_objects.LogoFooterPage;

public class LogoFooterTest extends BaseTest {
	
	@Test
	public void logoFooterValid() {
		LogoFooterPage page = new LogoFooterPage(driver);
		
		Assert.assertEquals(true, page.logo());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		

		if(page.footerMsg().contains("Powered by nopCommerce")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		Assert.assertEquals(true, page.footer().isDisplayed());
		
	}

}
