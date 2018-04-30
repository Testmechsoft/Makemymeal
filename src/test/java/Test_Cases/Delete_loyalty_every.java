package Test_Cases;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import lib_methods.Browser_factory;

public class Delete_loyalty_every {

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
		driver.findElement(By.xpath(".//*[@id='customer_lookup_2363139538989361']")).click();
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input"))
				.sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void delete() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> ele = driver.findElements(By.xpath(".//img[@src='graphics/trashcan.gif']"));

		int x = ele.size();

		int y = 6;

		Thread.sleep(2000);

		for (int i = 0; i < x - y; i++) {

			driver.findElement(By.xpath(".//img[@src='graphics/trashcan.gif']")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath(".//*[@id='lertButtons']/a[1]")).click();

		}

	}

}
