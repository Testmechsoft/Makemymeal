package Test_Cases;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import lib_methods.Browser_factory;

public class Delete_loyalty {

	public static WebDriver driver;
	public Browser_factory b;
	@BeforeSuite
	public void Openbrowser() throws InterruptedException {
		b = new Browser_factory();
		try {
			driver = b.initiate_browser("chrome");
		} catch (MalformedURLException e1) {

			e1.printStackTrace();
		}
		driver.get("https://login.clienttoolbox.com/admin.php");
		driver.manage().window().maximize();

	}
	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='login-module']/div/div/div/form/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("mmmdeepak");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='login-module']/div/div/div/form/table/tbody/tr[4]/td[2]/input"))
				.sendKeys("temp7719");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='login-module']/div/div/div/form/table/tbody/tr[5]/td[2]/button"))
				.click();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void search() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='manage_customer_records']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@name='find_customer']")).click();
	}
	@Test(priority = 3)
	public void delete() throws InterruptedException {

		for (int i = 1; i < 1500; i++) {

			try {
				driver.findElement(By.xpath("//img[@height='17']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='lertButtons']/a[1]")).click();
				Thread.sleep(2000);
				
				
				if (driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td[2]/button")).isDisplayed()){
					driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td[2]/button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath(".//*[@name='find_customer']")).click();
					Thread.sleep(5000);
					
					try {
						JavascriptExecutor js =(JavascriptExecutor)driver;
						js.executeScript("arguments[0].style='border:3px solid red;background: #6A755C;' ",driver.findElement(By.xpath("//*[@class='page_number' and contains(text(),5)]")));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					driver.findElement(By.xpath("//*[@class='page_number' and contains(text(),5)]")).click();
					Thread.sleep(2000);
				}
				
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
