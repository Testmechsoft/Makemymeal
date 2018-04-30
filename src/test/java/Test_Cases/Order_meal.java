package Test_Cases;

import org.testng.annotations.Test;

import com.pageObject.Home;


import config.Configuration;
//import lib_methods.Record;

public class Order_meal extends Configuration {

	public String area;
	public String city;
	//public Record record = new Record(driver);

	@Test(priority = 1)
	public void select_area() throws InterruptedException {
		
		city = dashbaord.verify_city("Sharjah");
		Thread.sleep(3000);
		
		area = dashbaord.select_area("Abu Shagara Park");
		
	}

	@Test(priority = 2)
	public void select_restaurant() throws InterruptedException {
		rl.Resto_Menu(city, area, "TULI");
		Thread.sleep(3000);
	}

	@Test(priority = 3, dependsOnMethods = "select_restaurant")
	public void select_meal_delivery() throws InterruptedException {

		rl.cuisine_deliverytime();
		Thread.sleep(1000);

	}

	@Test(priority = 4, dependsOnMethods = "select_meal_delivery")
	public void select_meal() throws InterruptedException {
		meal.click_add();
		Thread.sleep(1000);
		meal.select_pakage();
	}

	@Test(priority = 4, dependsOnMethods = "select_meal")
	public void order_meal() throws InterruptedException {
		Thread.sleep(1000);
		meal.confirm_order();
		Thread.sleep(3000);
	}

	@Test(priority = 5, dependsOnMethods = "order_meal")
	public void signin() throws InterruptedException {
		Thread.sleep(2000);
		loginpage.Login("siddhartha.panda@mechsoftgroup.com", "123456");
		Thread.sleep(2000);

	}

	@Test(priority = 6, dependsOnMethods = "signin")
	public void address() throws InterruptedException {
		
		
		Thread.sleep(2000);
		checkout.select_date();
		Thread.sleep(2000);
		checkout.select_area("Abu Shagara Park");
		Thread.sleep(2000);
		checkout.Enter_address("test", "123", "test", "test");

	}

}
