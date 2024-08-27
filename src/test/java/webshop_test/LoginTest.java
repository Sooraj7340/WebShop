package webshop_test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import basepackage.BaseTest;
import junit.framework.Assert;
import webshop_objects.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void login() {
		LoginPage page = new LoginPage(driver);
	
		page.logout();
		page.login();
		
		Assert.assertEquals(true, page.loginMsg());
		
		page.email(mail);
		page.password("181818");
		page.loginBtn();
		
		List<WebElement> list = page.links();
		for(WebElement ele:list) {
			Assert.assertEquals(true, ele.isDisplayed());
			Assert.assertEquals(true, ele.isEnabled());
		}
		
		list = page.category();
		for(WebElement ele:list) {
			Assert.assertEquals(true, ele.isDisplayed());
			Assert.assertEquals(true, ele.isEnabled());
		}
	}

}
