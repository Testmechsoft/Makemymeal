package com.pageObject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import lib_methods.*;

public class Restaurant_Reg {
	public WebDriver driver;
	public heighlight h;
	public Scroll s;
	public String cat;
	public String wk;
	public String Area;

	public Restaurant_Reg(WebDriver drv) {

		this.driver = drv;
		h = new heighlight(driver);
		s = new Scroll(driver);

	}

	/*******************************
	 * Restaurant Registration
	 ***************************************/

	@FindBy(xpath = ".//*[@id='Rest_Status']")
	@CacheLookup
	WebElement Status;

	@FindBy(xpath = ".//*[@id='Rest_CommissionType']")
	@CacheLookup
	WebElement CommissionType;

	@FindBy(xpath = ".//*[@id='Rest_DailyEmail']")
	@CacheLookup
	WebElement DailyEmail;

	@FindBy(css = "#txtCaptchaInput")
	WebElement ecaptcha;

	@FindBy(id = "txtCaptcha")
	WebElement acaptcha;

	/*******************************
	 * Restaurant Registration
	 ***************************************/

	public String enter_email(String email) {

		h.h(driver.findElement(By.xpath(".//*[@id='email_id']")));
		driver.findElement(By.xpath(".//*[@id='email_id']")).sendKeys(email);
		return email;
	}

	public String enter_cemail(String cemail) {
		h.h(driver.findElement(By.xpath(".//*[@id='comm_email_id']")));
		driver.findElement(By.xpath(".//*[@id='comm_email_id']")).sendKeys(cemail);
		return cemail;

	}

	public String enter_restaurantname(String rname) {
		h.h(driver.findElement(By.xpath(".//*[@id='Rest_name']")));
		driver.findElement(By.xpath(".//*[@id='Rest_name']")).sendKeys(rname);
		return rname;
	}

	public String enter_restauranpassword(String pass) {
		h.h(driver.findElement(By.xpath(".//*[@id='Rest_password']")));
		driver.findElement(By.xpath(".//*[@id='Rest_password']")).sendKeys(pass);
		return pass;
	}

	public boolean select_restauranType(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_MealType']")));
		Select s = new Select(driver.findElement(By.xpath(".//*[@id='Rest_MealType']")));

		s.selectByIndex(1);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_category(String value) throws InterruptedException {

		// Remove_character_from_string re = new Remove_character_from_string();
		if (value.contains("�")) {

			int index = value.indexOf("�");
			cat = Remove_character_from_string.removeCharAt(value, index);

		}

		boolean x = driver.findElement(By.xpath(".//*[@tabindex='6' ]")).isDisplayed();
		Thread.sleep(2000);

		if (x) {

			Thread.sleep(2000);

			Actions a = new Actions(driver);

			a.moveByOffset(714, 462);

			a.click();

			a.perform();

			Thread.sleep(2000);

			List<WebElement> l = driver.findElements(
					By.xpath(".//*[@id='AddRestaurant']/div[2]/div/div/div/div[9]/div/span/span/div/ul/li/a"));

			for (WebElement ele : l) {

				String category = ele.getText();

				String c = category.replaceAll("\\s+", "");

				if (c.contentEquals(cat)) {

					ele.click();

					a.moveByOffset(670, 462);

					a.click();

					a.perform();

					break;

				}
			}

		}

		return true;

	}

	public boolean select_weekoff(String value) throws InterruptedException {

		boolean x = driver.findElement(By.xpath(".//*[@tabindex='7' and @ type='button']")).isDisplayed();
		Thread.sleep(2000);

		if (x) {

			driver.findElement(By.xpath(".//*[@tabindex='7' and @ type='button']")).click();

			Thread.sleep(2000);

			List<WebElement> l = driver.findElements(
					By.xpath(".//*[@id='AddRestaurant']/div[2]/div/div/div/div[11]/div/span/div/ul/li/a"));

			for (WebElement ele : l) {

				String wkl = ele.getText();

				String c = wkl.replaceAll("\\s+", "");

				if (value.contains("�")) {

					int index = value.indexOf("�");
					wk = Remove_character_from_string.removeCharAt(value, index);

					if (c.contentEquals(wk)) {
						ele.click();

						Actions a = new Actions(driver);

						a.moveByOffset(462, 555);

						a.click();

						a.perform();

						break;
					}
				}

			}
		}

		return true;
	}

	public boolean select_area(String value) throws InterruptedException {

		if (value.contains("�")) {

			int index = value.indexOf("�");
			Area = Remove_character_from_string.removeCharAt(value, index);

		}

		boolean x = driver.findElement(By.xpath(".//*[@tabindex='8' ]")).isDisplayed();
		Thread.sleep(2000);

		if (x) {

			Thread.sleep(2000);

			Actions a = new Actions(driver);

			a.moveByOffset(339, 555);

			a.click();

			a.perform();

			Thread.sleep(2000);

			List<WebElement> l = driver.findElements(
					By.xpath(".//*[@id='AddRestaurant']/div[2]/div/div/div/div[12]/div/span/span/div/ul/li/a"));

			for (WebElement ele : l) {

				String category = ele.getText();

				String c = category.replaceAll("\\s+", "");

				if (c.contentEquals(Area)) {

					ele.click();

					try {
						a.moveByOffset(458, 521);

						a.click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				}
			}
		}
		return true;
	}

	public boolean select_cod(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_COD']")));

		Select s = new Select(driver.findElement(By.xpath(".//*[@id='Rest_COD']")));

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_pausecount(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_Pause']")));

		driver.findElement(By.xpath(".//*[@id='Rest_Pause']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_code(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_Code']")));

		Select s = new Select(driver.findElement(By.xpath(".//*[@id='Rest_Code']")));

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_contactno(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_ContactNo']")));

		driver.findElement(By.xpath(".//*[@id='Rest_ContactNo']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_address(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_Address']")));

		driver.findElement(By.xpath(".//*[@id='Rest_Address']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	/*******************************
	 * Personal Information
	 ***************************************/

	public boolean Enter_firstname(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='first_name']")));

		driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_lastname(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='last_name']")));

		driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean selec_pcode(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Code']")));

		Select s = new Select(driver.findElement(By.xpath(".//*[@id='Code']")));

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_pcontactno(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='ContactNo']")));

		driver.findElement(By.xpath(".//*[@id='ContactNo']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_paddress(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Address']")));

		driver.findElement(By.xpath(".//*[@id='Address']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean upload_restuarantimage(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Rest_Profile']")));

		driver.findElement(By.xpath(".//*[@id='Rest_Profile']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean upload_menuimage(String value) throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='Menu_Profile']")));

		driver.findElement(By.xpath(".//*[@id='Menu_Profile']")).sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean enter_captcha() throws InterruptedException {

		h.h(driver.findElement(By.xpath(".//*[@id='ContactNo']")));

		s.scroll_down(1000);

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='txtCaptcha']"));

		h.h(ele);

		String x = ele.getText();

		System.out.println(x);

		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath(".//*[@id='txtCaptchaInput']"));

		ele2.clear();

		ele2.sendKeys(x);

		Thread.sleep(3000);

		return true;
	}
}
