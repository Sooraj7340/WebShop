package webshop_objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".ico-register")
	WebElement registerLink;
	
	@FindBy(css = ".registration-page")
	WebElement registerForm;
	
	@FindBy(css = ".text-box single-line")
	List<WebElement> inputs;
	
	@FindBy(id = "register-button")
	WebElement registerBtn;
	
	@FindBy(id = "gender-male")
	WebElement gender;
	
	@FindBy(id = "FirstName")
	WebElement firstName;
	
	@FindBy(id = "LastName")
	WebElement lastName;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	WebElement cnfPassword;
	
	@FindBy(css = ".field-validation-error")
	List<WebElement> required;
	
	public void register() {
		registerLink.click();
	}
	
	public boolean form() {
		return registerForm.isDisplayed();
	}
	
	public WebElement registerBtn() {
		return registerBtn;
	}
	
	public List<WebElement> inputs(){
		return inputs;
	}
	
	public List<WebElement> required(){
		return required;
	}
	
	public void email(String str) {
		email.clear();
		email.sendKeys(str);
	}
	
	public void password(String str) {
		password.clear();
		password.sendKeys(str);
	}
	
	public void cnfPassword(String str) {
		cnfPassword.clear();
		cnfPassword.sendKeys(str);
	}
	
	public void firstName(String str) {
		firstName.sendKeys(str);
	}
	
	public void lastName(String str) {
		lastName.sendKeys(str);
	}
	
	public void gender() {
		gender.click();
	}
	

}
