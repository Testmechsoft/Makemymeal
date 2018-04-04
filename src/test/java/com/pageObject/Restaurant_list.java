package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib_methods.Scroll;
import lib_methods.heighlight;

public class Restaurant_list {

	public WebDriver driver;
	public heighlight h;
	public Scroll s;

	public Restaurant_list(WebDriver drv) {

		this.driver = drv;
		h = new heighlight(driver);
		s = new Scroll(driver);

	}

	@FindBy(xpath = ".//*[contains(text(),'Cuisine & Delivery Time')]")
	@CacheLookup
	WebElement cpopup;

	@FindBy(xpath = ".//span[@class='sssss'][contains(text(),'Indian Non Veg')]")
	@CacheLookup
	WebElement cusine_Indian_Non_Veg;

	@FindBy(xpath = ".//span[@class='sssss'][contains(text(),'Lunch')]")
	@CacheLookup
	WebElement delivery_Lunch;

	@FindBy(xpath = ".//*[@id='btnviewmenu']")
	@CacheLookup
	WebElement submit;

	public String Resto_Menu(String city, String area, String restoname) throws InterruptedException {

		WebElement rest_menu = driver.findElement(By.xpath("//a[contains(@onclick,'" + area
				+ "')  and contains(@onclick,'" + city + "') and contains(@onclick,'" + restoname + "') ]"));
		h.h(rest_menu);
		rest_menu.click();
		return restoname;
	}

	public void cuisine_deliverytime() throws InterruptedException {

		WebDriverWait w = new WebDriverWait(driver, 10);

		w.until(ExpectedConditions.visibilityOf(cpopup));

		h.h(cusine_Indian_Non_Veg);
		cusine_Indian_Non_Veg.click();

		Thread.sleep(2000);

		h.h(delivery_Lunch);
		delivery_Lunch.click();

		Thread.sleep(2000);

		h.h(submit);
		submit.click();

	}

}
