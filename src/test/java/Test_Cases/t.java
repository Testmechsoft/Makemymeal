package Test_Cases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class t {
	private WebDriver driver;
	private String baseUrl;
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Siddhartha\\Selenium\\Browser Drivers\\chrome\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		baseUrl = "https://www.makemymeal.ae/makemymealdev/Register/Restaurant";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testT() throws Exception {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("comm_email_id")).clear();
		driver.findElement(By.id("comm_email_id")).sendKeys("test111@b.com");
		driver.findElement(By.id("Rest_name")).clear();
		driver.findElement(By.id("Rest_name")).sendKeys("testkkkkk");
	}

}
