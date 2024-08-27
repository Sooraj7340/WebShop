package webshop_test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepackage.BaseTest;
import webshop_objects.ProductPage;

public class ProductTest extends BaseTest {
	WebDriverWait wait;
	
	@Test
	public void orderPlace() {
		ProductPage page = new ProductPage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		page.searchBox("Smartphone");
		page.searchBtn();
		
		wait.until(ExpectedConditions.visibilityOf(page.product()));
		page.addProduct();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		page.cart();
		
		wait.until(ExpectedConditions.visibilityOf(page.country()));
		Select sel = new Select(page.country());
		sel.selectByVisibleText("India");
		
		page.zipCode("582103");
		page.estimate();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		page.agree();
		page.checkout();
		
		
		sel = new Select(page.billCountry());
		sel.selectByVisibleText("India");
		
		page.city("Gadag");
		page.address("Asundi");
		page.zip("582103");
		page.phoneNum("1234567890");
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(page.continue1())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(page.pickup())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(page.continue2())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(page.continue3())).click();
		wait.until(ExpectedConditions.elementToBeClickable(page.continue4())).click();
		
		js.executeScript("window.scrollBy(0,350)", "");
		wait.until(ExpectedConditions.elementToBeClickable(page.confirm())).click();
		wait.until(ExpectedConditions.elementToBeClickable(page.finalContinue())).click();
		
	}
	
}
