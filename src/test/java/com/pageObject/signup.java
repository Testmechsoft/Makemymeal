package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lib_methods.Scroll;
import lib_methods.heighlight;

public class signup {

	public WebDriver driver;
	public heighlight h;
	public Scroll s;

	public signup(WebDriver drv) {

		this.driver = drv;
		h = new heighlight(driver);
		s = new Scroll(driver);

	}

	@FindBy(xpath = ".//*[@id='Reg_email_id']")
	WebElement email;

	@FindBy(xpath = ".//*[@id='Reg_first_name']")
	WebElement firstname;

	@FindBy(xpath = ".//*[@id='Reg_last_name']")
	WebElement lastname;

	@FindBy(xpath = ".//*[@id='Reg_user_password']")
	WebElement password;

	@FindBy(xpath = ".//*[@id='Con_Reg_user_password']")
	WebElement cpassword;

	@FindBy(xpath = ".//*[@id='Reg_ContactNo']")
	WebElement contact;

	@FindBy(xpath = ".//*[@id='Reg_ContactNo1']")
	WebElement ccontact;

	@FindBy(xpath = ".//*[@id='birthdiv']")
	WebElement day;

	@FindBy(xpath = ".//*[@id='BirthMonthdiv']")
	WebElement month;

	@FindBy(xpath = ".//*[@id='codediv']")
	WebElement year;

	@FindBy(xpath = ".//*[@id='Reg_checkTC']")
	WebElement TC;

	@FindBy(xpath = ".//*[@id='Reg_checkRobot']")
	WebElement Robot;

	@FindBy(xpath = ".//*[@id='RefereeEmail']")
	WebElement Refer;

	@FindBy(xpath = ".//*[@id='btnSubmit']")
	WebElement Continue;

}
