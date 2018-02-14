package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import lib_methods.*;

public class Restaurant_Reg {
	public WebDriver driver;
	public heighlight h;

	public Restaurant_Reg(WebDriver drv) {

		this.driver = drv;
		h = new heighlight(driver);
	}

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
	public String enter_email(String email) {
		h.h(Email);
		Email.sendKeys(email);
		return email;
	}
	
}
