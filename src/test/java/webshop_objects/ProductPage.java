package webshop_objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "small-searchterms")
	WebElement searchBox;
	
	@FindBy(css = ".search-box-button")
	WebElement searchBtn;
	
	@FindBy(css = ".item-box")
	WebElement product;
	
	@FindBy(css = ".product-box-add-to-cart-button")
	WebElement addProduct;
	
	@FindBy(css = ".cart-label")
	WebElement cartLink;
	
	@FindBy(id = "CountryId")
	WebElement country;
	
	@FindBy(id = "ZipPostalCode")
	WebElement zipCode;
	
	@FindBy(css = ".estimate-shipping-button")
	WebElement estimate;
	
	@FindBy(id = "termsofservice")
	WebElement agree;
	
	@FindBy(id = "checkout")
	WebElement checkout;
	
	@FindBy(id = "BillingNewAddress_City")
	WebElement city;
	
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zip;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phoneNum;
	
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
	WebElement continue1;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement billCountry;
	
	@FindBy(id = "PickUpInStore")
	WebElement pickUp;
	
	@FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
	WebElement continue2;
	
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement continue3;
	
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement continue4;
	
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement confirm;
	
	@FindBy(css = ".order-completed-continue-button")
	WebElement finalContinue;
	
	
	public void searchBox(String str) {
		searchBox.sendKeys(str);
	}
	
	public void searchBtn() {
		searchBtn.click();
	}
	
	public WebElement product() {
		return product;
	}
	
	public void addProduct() {
		addProduct.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	public void cart() {
		cartLink.click();
	}
	
	public WebElement country() {
		return country;
	}
	
	public void zipCode(String str) {
		zipCode.sendKeys(str);
	}
	
	public void estimate() {
		estimate.click();
	}
	
	public void agree() {
		agree.click();
	}
	
	public void checkout() {
		checkout.click();
	}
	
	public WebElement billCountry() {
		return billCountry;
	}
	
	public void city(String str) {
		city.sendKeys(str);
	}
	
	public void address(String str) {
		address.sendKeys(str);
	}
	
	public void zip(String str) {
		zip.sendKeys(str);
	}
	
	public void phoneNum(String str) {
		phoneNum.sendKeys(str);
	}
	
	public WebElement continue1() {
		return continue1;
	}
	
	public WebElement continue2() {
		return continue2;
	}
	
	public WebElement continue3() {
		return continue3;
	}
	
	public WebElement continue4() {
		return continue4;
	}
	
	public WebElement pickup() {
		return pickUp;
	}
	
	public WebElement confirm() {
		return confirm;
	}
	
	public WebElement finalContinue() {
		return finalContinue;
	}
	
}
