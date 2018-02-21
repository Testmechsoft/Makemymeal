package com.pageObject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import lib_methods.*;

public class Restaurant_Reg {
	public WebDriver driver;
	public heighlight h;
	public Scroll s;

	public Restaurant_Reg(WebDriver drv) {

		this.driver = drv;
		h = new heighlight(driver);
		s = new Scroll(driver);
	}

	/*******************************
	 * Restaurant Registration
	 ***************************************/

	@FindBy(xpath = ".//*[@id='email_id']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = ".//*[@id='comm_email_id']")
	@CacheLookup
	WebElement CEmail;

	@FindBy(xpath = ".//*[@id='Rest_name']")
	@CacheLookup
	WebElement Res_name;

	@FindBy(xpath = ".//*[@id='Rest_password']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = ".//*[@id='Rest_MealType']")
	@CacheLookup
	WebElement MealType;

	@FindBy(xpath = ".//*[@id='AddRestaurant']/div/div[2]/div/div/div/div[7]/div/div/span/div/button")
	@CacheLookup
	WebElement category;

	@FindBy(xpath = ".//*[@id='AddRestaurant']/div/div[2]/div/div/div/div[8]/div/div/span/div/button")
	@CacheLookup
	WebElement Weekendoff;

	@FindBy(xpath = ".//*[@id='AddRestaurant']/div/div[2]/div/div/div/div[9]/div/div/span/div/button")
	@CacheLookup
	WebElement Area;

	@FindBy(xpath = ".//*[@id='Rest_COD']")
	@CacheLookup
	WebElement COD;

	@FindBy(xpath = ".//*[@id='Rest_Code']")
	@CacheLookup
	WebElement Code;

	@FindBy(xpath = ".//*[@id='Rest_ContactNo']")
	@CacheLookup
	WebElement ContactNo;

	@FindBy(xpath = ".//*[@id='Rest_Address']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = ".//*[@id='Rest_Status']")
	@CacheLookup
	WebElement Status;

	@FindBy(xpath = ".//*[@id='Rest_Pause']")
	@CacheLookup
	WebElement Pause;

	@FindBy(xpath = ".//*[@id='Rest_CommissionType']")
	@CacheLookup
	WebElement CommissionType;

	@FindBy(xpath = ".//*[@id='Rest_DailyEmail']")
	@CacheLookup
	WebElement DailyEmail;

	@FindBy(xpath = ".//*[@id='first_name']")
	@CacheLookup
	WebElement first_name;

	@FindBy(xpath = ".//*[@id='last_name']")
	@CacheLookup
	WebElement last_name;

	@FindBy(xpath = ".//*[@id='Code']")
	@CacheLookup
	WebElement pCode;

	@FindBy(xpath = ".//*[@id='ContactNo']")
	@CacheLookup
	WebElement pContactNo;

	@FindBy(xpath = ".//*[@id='Address']")
	@CacheLookup
	WebElement pAddress;

	@FindBy(xpath = ".//*[@id='Rest_Profile']")
	@CacheLookup
	WebElement RestaurantImage;

	@FindBy(xpath = ".//*[@id='Menu_Profile']")
	@CacheLookup
	WebElement menuImage;

	@FindBy(css = "#txtCaptchaInput")
	WebElement ecaptcha;

	@FindBy(id = "txtCaptcha")
	WebElement acaptcha;

	/*******************************
	 * Restaurant Registration
	 ***************************************/

	public String enter_email(String email) {
		h.h(Email);
		Email.sendKeys(email);
		return email;
	}

	public String enter_cemail(String cemail) {
		h.h(CEmail);
		CEmail.sendKeys(cemail);
		return cemail;
	}

	public String enter_restaurantname(String rname) {
		h.h(Res_name);
		Res_name.sendKeys(rname);
		return rname;
	}

	public String enter_restauranpassword(String pass) {
		h.h(password);
		password.sendKeys(pass);
		return pass;
	}

	public boolean select_restauranType(String value) throws InterruptedException {

		h.h(MealType);
		Select s = new Select(MealType);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_category(String value) throws InterruptedException {

		h.h(category);

		Select s = new Select(category);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_weekoff(String value) throws InterruptedException {

		h.h(Weekendoff);

		Select s = new Select(Weekendoff);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_area(String value) throws InterruptedException {

		h.h(Area);

		Select s = new Select(Area);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_cod(String value) throws InterruptedException {

		h.h(COD);

		Select s = new Select(COD);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_pausecount(String value) throws InterruptedException {

		h.h(Pause);

		Pause.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean select_code(String value) throws InterruptedException {

		h.h(Code);

		Select s = new Select(Code);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_contactno(String value) throws InterruptedException {

		h.h(ContactNo);

		ContactNo.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_address(String value) throws InterruptedException {

		h.h(Address);

		Address.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	/*******************************
	 * Personal Information
	 ***************************************/

	public boolean Enter_firstname(String value) throws InterruptedException {

		h.h(first_name);

		first_name.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_lastname(String value) throws InterruptedException {

		h.h(last_name);

		last_name.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean selec_pcode(String value) throws InterruptedException {

		h.h(pCode);

		Select s = new Select(pCode);

		s.selectByValue(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_pcontactno(String value) throws InterruptedException {

		h.h(pContactNo);

		pContactNo.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean Enter_paddress(String value) throws InterruptedException {

		h.h(pAddress);

		pAddress.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean upload_restuarantimage(String value) throws InterruptedException {

		h.h(RestaurantImage);

		RestaurantImage.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean upload_menuimage(String value) throws InterruptedException {

		h.h(menuImage);

		menuImage.sendKeys(value);

		Thread.sleep(2000);

		return true;
	}

	public boolean enter_captcha() throws InterruptedException {

		// h.h(driver.findElement(By.xpath(".//*[@id='txtCaptcha']")));

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
