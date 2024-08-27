package webshop_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoFooterPage {
	WebDriver driver;
	
	public LogoFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = ".header-logo")
	WebElement logo;
	
	@FindBy(css = ".footer-poweredby")
	WebElement footerMsg;
	
	@FindBy(css = ".footer-disclaimer")
	WebElement footer;
	
	public boolean logo() {
		return logo.isDisplayed();
	}
	
	public String footerMsg() {
		return footerMsg.getText();
	}
	
	public WebElement footer() {
		return footer;
	}
}
