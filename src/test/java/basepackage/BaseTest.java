package basepackage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	static Random rand = new Random();
	static int rand_int = rand.nextInt(10000);
	public static String mail = "sooraj" + rand_int +"@gmail.com";
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Goudar\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}
