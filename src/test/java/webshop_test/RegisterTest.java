package webshop_test;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseTest;
import junit.framework.Assert;
import webshop_objects.RegisterPage;

public class RegisterTest extends BaseTest{
	
	@Test
	public void registerValid() {
		RegisterPage page = new RegisterPage(driver);
		   

		
		page.register();
		Assert.assertEquals(true, page.form());
		List<WebElement> list = page.inputs();
		for(WebElement ele:list) {
			Assert.assertEquals(true, ele.isDisplayed());
		}
		
		Assert.assertEquals(true, page.registerBtn().isEnabled());
		page.registerBtn().click();
		list = page.required();
		for(WebElement ele:list) {
			Assert.assertEquals(true, ele.isDisplayed());
		}
		
		
		page.email("sooraj.goudar");
		Assert.assertEquals(true, page.required().get(2).isDisplayed());
		
		page.password("Suraj1718");
		page.cnfPassword("Suraj1619");
		
		Assert.assertEquals(true, page.required().get(3).isDisplayed());
		
		page.gender();
		page.firstName("Sooraj");
		page.lastName("G");
		
		page.email(mail);
		page.password("181818");
		page.cnfPassword("181818");
		page.registerBtn().click();
	}
	
}
