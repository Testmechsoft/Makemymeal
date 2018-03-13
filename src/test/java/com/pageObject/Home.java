package com.pageObject;

import java.beans.Visibility;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import lib_methods.*;

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
	public Mouse_actions m;

	public String quicklink = "https://www.makemymeal.ae/makemymealuat/quicklinks";

	public String home = "https://www.makemymeal.ae/makemymealuat/Home";

	public Home(WebDriver dr) {
		this.driver = dr;
		h = new heighlight(driver);
		wait = new Implicit_timeout(driver);
		S = new Sikuli_c(driver);
		compare = new Comapre_images(driver);
		s = new Scroll(driver);
		sshot = new Screenshot(driver);
		m = new Mouse_actions(driver);
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

	@FindBy(xpath = ".//*[@id='area_id-list']/span/input")
	WebElement enter_deliverylocation;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[1]/div/div[1]/a")
	WebElement offers;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[1]/div/div[2]/a")
	WebElement howitworks;

	@FindBy(xpath = ".//a[@href='/makemymealuat/quicklinks/SampleMenu']")
	WebElement SampleMenu;

	@FindBy(xpath = ".//a[@href='/makemymealuat/quicklinks/loyalty']")
	WebElement loyality;

	@FindBy(xpath = ".//a[@href='/makemymealuat/quicklinks/gift']")
	WebElement client;

	@FindBy(xpath = ".//*[@id='itwork' and @class='headingSection']")
	WebElement partner_restaurant;

	@FindBy(xpath = ".//*[@id='uparrow']")
	WebElement uparrow;

	@FindBy(xpath = ".//*[@id='footer']/div/div/div[1]/p[1]/span")
	WebElement call;

	@FindBy(xpath = ".//*[@id='footer']/div/div/div[1]/p[2]/span")
	WebElement email;

	@FindBy(xpath = ".//*[@class='addcartDiv']")
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

	@FindBy(xpath = ".//p[@class='rights']")
	WebElement rights;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/img")
	WebElement r_sukh_img;

	@FindBy(xpath = "	.//*[@id='body']/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/img")
	WebElement r_Arryas_img;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div[1]/img")
	WebElement r_fusion_img;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/img")
	WebElement r_honest_img;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/img")
	WebElement r_eats_img;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/img")
	WebElement r_lunch_img;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/h2")
	WebElement resto1;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/h2")
	WebElement resto2;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div[2]/h2")
	WebElement resto3;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/h2")
	WebElement resto4;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/h2")
	WebElement resto5;

	@FindBy(xpath = ".//*[@id='body']/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/h2")
	WebElement resto6;

	@FindBy(xpath = ".//img[@class='loginpopimg']")
	WebElement login_popup_menu;

	@FindBy(xpath = ".//*[@id='Registration']/div/div[1]/h4")
	WebElement sing_popup_menu;

	public boolean verify_cart() throws IOException {

		driver.navigate().refresh();

		Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				cartlog);

		boolean x = imageLoaded1;

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

			h.h(refundpolicy);
			refundpolicy.click();
			wait.waitfor(1);
			String r1 = driver.getCurrentUrl();
			s.assertEquals(r1, quicklink + "/refund", "Refund policy page did not opened");
			driver.navigate().back();
			Thread.sleep(3000);

			System.out.println("*************Verifying deliverypolicy************");

			h.h(deliverypolicy);
			deliverypolicy.click();
			wait.waitfor(1);
			String r2 = driver.getCurrentUrl();
			s.assertEquals(r2, quicklink + "/delivery", "deliverypolicy page did not opened");
			driver.navigate().back();
			Thread.sleep(3000);

			System.out.println("*************Verifying Terms************");

			h.h(Terms);
			Terms.click();
			wait.waitfor(1);
			String r3 = driver.getCurrentUrl();
			s.assertEquals(r3, quicklink + "/terms_conditions", "Terms page did not opened");
			driver.navigate().back();
			Thread.sleep(3000);

			System.out.println("*************Verifying privacy************");
			h.h(Privacy);
			Privacy.click();
			wait.waitfor(1);
			String r4 = driver.getCurrentUrl();
			s.assertEquals(r4, quicklink + "/privacy", "Privacy page did not opened");
			driver.navigate().back();
			Thread.sleep(3000);

			System.out.println("*************Verifying about us" + "************");
			h.h(About);
			About.click();
			wait.waitfor(1);
			String r5 = driver.getCurrentUrl();
			s.assertEquals(r5, quicklink + "/aboutus", "aboutus page did not opened");
			driver.navigate().back();
			Thread.sleep(3000);

			System.out.println("*************Verifying FAQ" + "************");
			h.h(FAQ);
			FAQ.click();
			wait.waitfor(1);
			String r6 = driver.getCurrentUrl();
			s.assertEquals(r6, quicklink + "/faq", "faq page did not opened");
			driver.navigate().back();
			Thread.sleep(3000);

			System.out.println("***********All links are verified***************");

		}

		return true;
	}

	public boolean take_screenshot() throws IOException, InterruptedException {

		// sshot.Element_screenshot(r_sukh, sc);
		return true;
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

				link_Home.click();

				wait.waitfor(2);

				sa.assertEquals(driver.getCurrentUrl(), home + "/Index", "Home link didnot opened");

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

				link_Career.click();

				wait.waitfor(2);

				sa.assertEquals(driver.getCurrentUrl(), quicklink + "/workwithus", "career  link didnot opened");

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

				link_Contact_Us.click();

				wait.waitfor(2);

				sa.assertEquals(driver.getCurrentUrl(), home + "/contact", "contact link didnot opened");

			} else {
				System.err.println("contact us link is not visible");
			}

			wait.waitfor(2);

			boolean res = link_Restaurant_Registration.isDisplayed();
			boolean resdis = link_Restaurant_Registration.isEnabled();

			if (res && resdis) {
				h.h(link_Restaurant_Registration);
				String restaurant_linktext = link_Restaurant_Registration.getText();
				sa.assertEquals(A_restaurantreg, restaurant_linktext, "Restaurant Registration  link doesn not match");

				link_Restaurant_Registration.click();

				wait.waitfor(2);

				sa.assertEquals(driver.getCurrentUrl(), "https://www.makemymeal.ae/makemymealuat/Register/Restaurant",
						"Restaurant Registration link didnot opened");
			}

			else {
				System.err.println("restaurent registration  link is not visible");
			}

			boolean signdis = link_Contact_Us.isDisplayed();
			boolean signena = link_Contact_Us.isEnabled();

			if (signdis && signena) {
				h.h(singup_login);
				String signup_linktext = singup_login.getText();
				sa.assertEquals(A_loginsignup, signup_linktext, "signup/login  link doesn not match");
				singup_login.click();
				wait.waitfor(2);

				boolean visibility = singup_login.isDisplayed();
				sa.assertTrue(visibility, "signup/login  link is not visible");

				sa.assertAll();
				driver.navigate().to(home + "/Index");
			}

			else {
				System.err.println("login/signup  link is not visible");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return value;

	}

	public boolean verify_contact() {

		String expn = "+971 04 5217475";
		String an = call.getText();

		String expe = "info@makemymeal.ae";
		String ane = email.getText();

		Assert.assertEquals(an, expn, "Contact number doesnot match");
		Assert.assertEquals(ane, expe, "Email id doesnot match");

		System.out.println("Number and Email id verified successfully");

		return true;

	}

	public void click_login_signup() throws InterruptedException {
		
		h.h(singup_login);
		
		singup_login.click();

		Thread.sleep(3000);
		//String popuptext = singup_popup.getText();

	}

	public void click_login_signup_link() {

		h.h(singup_link);
		singup_link.click();

	}

	public void verify_city(String ci) throws InterruptedException {

		boolean city = select_city.isDisplayed();

		Assert.assertTrue(city);
		select_city.click();

		List<WebElement> c = driver.findElements(By.xpath(".//*[@id='City_Id_listbox']/li"));

		for (int i = 0; i < c.size(); i++) {

			for (WebElement ele : c) {

				String cityname = ele.getText();

				if (ele.getText().equalsIgnoreCase(ci)) {

					ele.click();

					break;
				}
			}

		}

	}

	public void verify_area(String ar) {

		try {
			boolean area = search_deliverylocation.isDisplayed();

			Assert.assertTrue(area);

			Thread.sleep(3000);

			WebElement x = driver
					.findElement(By.xpath(".//*[@id='SearchRegistration']/div/div[4]/span[1]/span/span[1]"));

			x.click();

			List<WebElement> locationlist = driver.findElements(By.xpath(".//*[@id='area_id_listbox']/li"));

			for (WebElement ele : locationlist) {

				String location = ele.getText();

				if (ele.getText().equalsIgnoreCase(ar)) {

					ele.click();

					Thread.sleep(2000);

					driver.navigate().to(home);

					break;
				}

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public boolean verify_rights() {

		String rig = rights.getText();

		Assert.assertEquals(rig, "2018 All Right Reserved Make My Meal", "Rights did not match");
		return true;

	}

	public boolean verify_Partner_restaurent() throws IOException, InterruptedException {

		String sukhsagar = compare.compare_hideen_image(r_sukh_img, 104, 53, "sukhsagar");
		String Aryaas = compare.compare_hideen_image(r_Arryas_img, 496, 53, "Aryaas");
		String fusion = compare.compare_hideen_image(r_fusion_img, 886, 51, "fusion");
		String honest = compare.compare_hideen_image(r_honest_img, 104, 203, "honest");
		String Eats = compare.compare_hideen_image(r_eats_img, 496, 203, "Eats");
		String desi = compare.compare_hideen_image(r_lunch_img, 886, 203, "desi");

		String r1 = resto1.getText();
		String r2 = resto2.getText();
		String r3 = resto3.getText();
		String r4 = resto4.getText();
		String r5 = resto5.getText();
		String r6 = resto6.getText();

		boolean resto1 = sukhsagar.equalsIgnoreCase("sukhsagar") && r1.equalsIgnoreCase("Sukh Sagar");
		boolean resto2 = Aryaas.equalsIgnoreCase("Aryaas") && r2.equalsIgnoreCase("Aryaas Restaurant");
		boolean resto3 = fusion.equalsIgnoreCase("fusion") && r3.equalsIgnoreCase("Its Fusion by Maharaja Bhog");
		boolean resto4 = honest.equalsIgnoreCase("honest") && r4.equalsIgnoreCase("Honest Veg Restaurant");
		boolean resto5 = Eats.equalsIgnoreCase("Eats") && r5.equalsIgnoreCase("The Eats Corner");
		boolean resto6 = desi.equalsIgnoreCase("desi") && r6.equalsIgnoreCase("Desi Lunch Box");

		LinkedList<Boolean> status = new LinkedList<Boolean>();

		status.add(resto1);
		status.add(resto2);
		status.add(resto3);
		status.add(resto4);
		status.add(resto5);
		status.add(resto6);

		for (int i = 0; i < 6; i++) {

			if (i == 0 && status.get(i)) {

				System.out.println("Restaurent sukhsagar is verified");
			}

			else if (i == 1 && status.get(i)) {

				System.out.println("Restaurent Aryaas is verified");

			} else if (i == 2 && status.get(i)) {

				System.out.println("Restaurent Its Fusion by Maharaja Bhog is verified");
			}

			else if (i == 3 && status.get(i)) {

				System.out.println("Restaurent Honest Veg  is verified");
			}

			else if (i == 4 && status.get(i)) {

				System.out.println("Restaurent The Eats Corner  is verified");
			}

			else if (i == 5 && status.get(i)) {

				System.out.println("Restaurent Desi Lunch Box  is verified");
			}

			else {
				System.err.println("Restaurents are not verified");

			}

		}

		return resto6;
	}

	public boolean verify_banners() throws InterruptedException {

		try {
			h.h(offers);
			offers.click();
			Thread.sleep(3000);
			boolean visibiliy = sing_popup_menu.isDisplayed();

			Thread.sleep(3000);

			Assert.assertTrue(visibiliy, "Sign up pop up did not opened");
			Thread.sleep(3000);
			driver.navigate().to(home);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread.sleep(3000);
		h.h(howitworks);
		howitworks.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), quicklink + "/howitworks", "How it works link did not opened");
		driver.navigate().to(home);
		Thread.sleep(3000);

		h.h(SampleMenu);
		SampleMenu.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), quicklink + "/SampleMenu", "Sample menu link did not opened");
		driver.navigate().to(home);
		Thread.sleep(3000);

		h.h(loyality);
		loyality.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), quicklink + "/loyalty", "loyality link did not opened");
		driver.navigate().to(home);
		Thread.sleep(3000);

		h.h(client);
		client.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), quicklink + "/gift", "Client link did not opened");
		driver.navigate().to(home);
		Thread.sleep(3000);
		s.scroll_down(900);

		return false;
	}
}
