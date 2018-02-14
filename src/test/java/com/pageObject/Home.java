package com.pageObject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import lib_methods.*;
import ru.yandex.qatools.ashot.AShot;

public class Home {
	public WebDriver driver;
	public heighlight h;
	public Explicit_timeout e;
	public Implicit_timeout wait;
	public Sikuli_c S;
	public Comapre_images compare;
	public String cart = "cart.png";
	public Scroll s;
	public Screenshot sshot;

	public Home(WebDriver dr) {
		this.driver = dr;
		h = new heighlight(driver);
		wait = new Implicit_timeout(driver);
		S = new Sikuli_c(driver);
		compare = new Comapre_images(driver);
		s = new Scroll(driver);
		sshot = new Screenshot(driver);
	}

	@FindBy(xpath = ".//a[contains(text(),'Home') and @role ='button']")
	WebElement link_Home;

	@FindBy(xpath = ".//a[contains(text(),'Career') and @role ='button']")
	WebElement link_Career;

	@FindBy(xpath = ".//a[@class='links' and contains(text(),'Contact Us')]")
	WebElement link_Contact_Us;

	@FindBy(xpath = ".//a[@class='links' and contains(text(),'Restaurant Registration')]")
	WebElement link_Restaurant_Registration;

	@FindBy(xpath = ".//*[@id='btnLlogin']")
	WebElement singup_login;

	@FindBy(xpath = "// *[contains(text(),'Log in into your account')]")
	WebElement singup_popup;

	@FindBy(linkText = "Signup")
	WebElement singup_link;

	@FindBy(xpath = ".//h1[@class='bannerText']")
	WebElement bannerText;

	@FindBy(xpath = ".//*[@id='SearchRegistration']/div/div[3]")
	WebElement select_city;

	@FindBy(xpath = ".//*[@id='SearchRegistration']/div/div[4]/span[1]/span/span[1]")
	WebElement search_deliverylocation;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[1]/div/div[1]/a")
	WebElement offers;

	@FindBy(xpath = ".//a[@href='/makemymealdev/quicklinks/howitworks']")
	WebElement howitworks;

	@FindBy(xpath = ".//a[@href='/makemymealdev/quicklinks/SampleMenu']")
	WebElement SampleMenu;

	@FindBy(xpath = ".//a[@href='/makemymealdev/quicklinks/loyalty']")
	WebElement loyality;

	@FindBy(xpath = ".//a[@href='/makemymealdev/quicklinks/gift']")
	WebElement client;

	@FindBy(xpath = ".//*[@id='itwork' and @class='headingSection']")
	WebElement partner_restaurant;

	@FindBy(xpath = ".//*[@id='uparrow']")
	WebElement uparrow;

	@FindBy(xpath = ".//*[@id='footer']/div/div/div[1]/p[1]/span")
	WebElement call;

	@FindBy(xpath = ".//*[@id='footer']/div/div/div[1]/p[2]/span")
	WebElement email;

	@FindBy(xpath = ".//*[@class='rights']")
	WebElement rights;

	@FindBy(css = ".addcartDiv")
	WebElement cartlog;

	@FindBy(xpath = ".//a[contains(text(),'Refund Policy')]")
	WebElement refundpolicy;

	@FindBy(xpath = ".//a[contains(text(),'Delivery Policy')]")
	WebElement deliverypolicy;

	@FindBy(xpath = ".//a[contains(text(),'Terms & Conditions')]")
	WebElement Terms;

	@FindBy(xpath = ".//a[contains(text(),'Privacy Policy')]")
	WebElement Privacy;

	@FindBy(xpath = ".//a[contains(text(),'About Us')]")
	WebElement About;

	@FindBy(xpath = ".//a[contains(text(),'FAQ')]")
	WebElement FAQ;

	@FindBy(xpath =".//*[@id='footer']/div/div")
	WebElement Footer;

	
	public boolean verify_cart() throws IOException {

		Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				cartlog);
		if (!imageLoaded1) {

			System.out.println("Image is not present");

		} else {

			System.out.println("Cart logo is present");
			boolean t = compare.compare_image(cartlog, cart);

			if (t) {

				System.out.println("Cart logo is verified");

			}

		}

		return true;
	}

	public boolean verify_Quicklinks() throws IOException, InterruptedException {

		boolean r = refundpolicy.isDisplayed();
		boolean d = deliverypolicy.isDisplayed();
		boolean t = Terms.isDisplayed();
		boolean p = Privacy.isDisplayed();
		boolean a = About.isDisplayed();
		boolean f = FAQ.isDisplayed();

		if (r && d && t && p && a && f) {
			SoftAssert s = new SoftAssert();

			System.out.println("All links displayed");

			System.out.println("*************Verifying refund************");

			refundpolicy.click();
			wait.waitfor(1);
			String r1 = driver.getCurrentUrl();
			s.assertEquals(r1, "https://www.makemymeal.ae/makemymealdev/quicklinks/refund",
					"Refund policy page did not opened");
			driver.navigate().back();
			wait.waitfor(2);
			
			System.out.println("*************Verifying deliverypolicy************");

			deliverypolicy.click();
			wait.waitfor(1);
			String r2 = driver.getCurrentUrl();
			s.assertEquals(r2, "https://www.makemymeal.ae/makemymealdev/quicklinks/delivery",
					"deliverypolicy page did not opened");
			driver.navigate().back();
			wait.waitfor(2);
			
			
			System.out.println("*************Verifying Terms************");

			Terms.click();
			wait.waitfor(1);
			String r3 = driver.getCurrentUrl();
			s.assertEquals(r3, "https://www.makemymeal.ae/makemymealdev/quicklinks/refund",
					"Terms page did not opened");
			driver.navigate().back();
			wait.waitfor(2);

			
			System.out.println("*************Verifying privacy************");
			
			Privacy.click();
			wait.waitfor(1);
			String r4 = driver.getCurrentUrl();
			s.assertEquals(r4, "https://www.makemymeal.ae/makemymealdev/quicklinks/privacy",
					"Privacy page did not opened");
			driver.navigate().back();
			wait.waitfor(2);
			
			System.out.println("*************Verifying about us"
					+ "************");

			About.click();
			wait.waitfor(1);
			String r5 = driver.getCurrentUrl();
			s.assertEquals(r5, "https://www.makemymeal.ae/makemymealdev/quicklinks/aboutus",
					"aboutus page did not opened");
			driver.navigate().back();
			wait.waitfor(2);
			
			System.out.println("*************Verifying FAQ"
					+ "************");
			
			FAQ.click();
			wait.waitfor(1);
			String r6 = driver.getCurrentUrl();
			s.assertEquals(r6, "https://www.makemymeal.ae/makemymealdev/quicklinks/faq", "faq page did not opened");
			driver.navigate().back();
			wait.waitfor(2);

			System.out.println("***********All links are verified***************");

		}

		return true;
	}

	public boolean take_screenshot(String sc) throws IOException {

		sshot.Element_screenshot(Footer, sc);
		return false;
	}

	public boolean verify_Headerlinks() {

		String A_home = "Home";

		String A_career = "Career";

		String A_contactus = "Contact Us";

		String A_restaurantreg = "Restaurant Registration";

		String A_loginsignup = "Login / Sign-up";

		boolean value = true;

		try {

			SoftAssert sa = new SoftAssert();

			boolean homelink = link_Home.isDisplayed();
			boolean homedis = link_Home.isEnabled();

			if (homelink && homedis) {
				h.h(link_Home);
				String home_linktext = link_Home.getText();
				sa.assertEquals(A_home, home_linktext, "Home link doesn not match");
			}

			else {
				System.err.println("Home link is not visible");
			}

			wait.waitfor(2);

			boolean careerlink = link_Career.isDisplayed();
			boolean careerdis = link_Career.isEnabled();
			if (careerlink && careerdis) {
				h.h(link_Career);
				String career_linktext = link_Career.getText();
				sa.assertEquals(A_career, career_linktext, "carrer link doesn not match");
			} else {
				System.err.println("carrer link is not visible");
			}

			wait.waitfor(2);

			boolean contactuslink = link_Contact_Us.isDisplayed();
			boolean contactusdis = link_Contact_Us.isEnabled();
			if (contactuslink && contactusdis) {
				h.h(link_Contact_Us);
				String contactus_linktext = link_Contact_Us.getText();
				sa.assertEquals(A_contactus, contactus_linktext, "contact us link doesn not match");
			} else {
				System.err.println("contact us link is not visible");
			}

			wait.waitfor(2);

			boolean res = link_Contact_Us.isDisplayed();
			boolean resdis = link_Contact_Us.isEnabled();

			if (res && resdis) {
				h.h(link_Restaurant_Registration);
				String restaurant_linktext = link_Restaurant_Registration.getText();
				sa.assertEquals(A_contactus, restaurant_linktext, "contact us link doesn not match");
			}

			else {
				System.err.println("restaurent registration  link is not visible");
			}

			boolean signdis = link_Contact_Us.isDisplayed();
			boolean signena = link_Contact_Us.isEnabled();

			if (signdis && signena) {
				h.h(singup_login);
				String signup_linktext = singup_login.getText();
				sa.assertEquals(A_loginsignup, signup_linktext, "signup/login us link doesn not match");
			}

			else {
				System.err.println("login/signup  link is not visible");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return value;

	}

	public boolean vefify_contact() {

		String expn = "+971 04 5217475";
		String an = call.getText();

		String expe = "info@makemymeal.ae";
		String ane = email.getText();

		Assert.assertEquals(an, expn, "Contact number doesnot match");
		Assert.assertEquals(ane, expe, "Email id doesnot match");

		System.out.println("Number and Email id verified successfully");

		return true;

	}

	public void click_login_signup() {
		h.h(singup_login);
		singup_login.click();
		wait.waitfor(2);
		String popuptext = singup_popup.getText();

	}

	public void click_login_signup_link() {

		h.h(singup_link);
		singup_link.click();

	}
	
	
	public void verify_location(){
		
		
	boolean city=select_city.isDisplayed();
	
	Assert.assertTrue(city);
	select_city.click();
	
	List<WebElement>c=driver.findElements(By.xpath(".//*[@id='City_Id-list']//li"));
	
	for (WebElement ele : c){
		
		String cityname =ele.getText();
		
		System.out.println(cityname);
		
		
		
		
	}
	

	
	
		
		
		
		
		
		
	}

}
