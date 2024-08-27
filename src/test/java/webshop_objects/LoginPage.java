package webshop_objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".ico-login")
	WebElement login;
	
	@FindBy(css = ".ico-logout")
	WebElement logout;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(css = ".login-button")	
	WebElement loginBtn;
	
	@FindBy(css = ".page-title")
	WebElement loginMsg;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li/a")
	List<WebElement> links;
	
	@FindBy(css = ".inactive")
	List<WebElement> category;
	
	public void login() {
		login.click();
	}
	
	public void logout() {
		logout.click();
	}
	public boolean loginMsg() {
		return loginMsg.isDisplayed();
	}
	
	public void email(String str) {
		email.sendKeys(str);
	}
	
	public void password(String str) {
		password.sendKeys(str);
	}
	
	public void loginBtn() {
		loginBtn.click();
	}
	
	public List<WebElement> links(){
		return links;
	}
	
	public List<WebElement> category(){
		return category;
	}
}
