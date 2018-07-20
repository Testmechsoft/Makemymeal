package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib_methods.Scroll;
import lib_methods.heighlight;

public class Meal_list extends basepage {

	public WebDriver driver;
	public heighlight h;
	public Scroll s;

	public Meal_list(WebDriver drv) {

		super(drv);
		h = new heighlight(driver);
		s = new Scroll(driver);

	}

	@FindBy(xpath = ".//*[@id='btn_']")
	@CacheLookup
	WebElement ele;

	@FindBy(xpath = ".//*[contains(text(),'VAT')]")
	@CacheLookup
	WebElement POPUP;

	@FindBy(xpath = ".//*[@type='radio']")
	@CacheLookup
	WebElement radio;

	@FindBy(xpath = ".//*[@id='dvContainer2']/button")
	@CacheLookup
	WebElement submit;

	@FindBy(xpath = ".//*[contains(text(),'CONFIRM ORDER')]")
	@CacheLookup
	WebElement CONFIRM;

	public void click_add() throws InterruptedException {
		
		Thread.sleep(3000);

		ele.click();
	}

	public void select_pakage() throws InterruptedException {

		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(POPUP));

		radio.click();

		Thread.sleep(1000);

		submit.click();

	}
	public void confirm_order() throws InterruptedException {

		h.h(CONFIRM);
		CONFIRM.click();
	}
	


}
