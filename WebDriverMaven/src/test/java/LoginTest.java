import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void doLogin() throws Exception {
		//go to gmail
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("trainer@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcde");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
	
	
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
