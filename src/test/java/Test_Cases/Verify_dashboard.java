package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Verify_dashboard extends config.Configuration {

	@Test(priority = 3)
	public void Headerlinks() {

		Boolean links = dashbaord.verify_Headerlinks();

		if (links) {

			System.out.println("*************Headers Links are verified************");
		} else {

			System.err.println("*************Headers Links are not verified************");
		}
	}

	@Test(priority = 2)
	public void verify_cart() throws IOException, InterruptedException {
		dashbaord.verify_cart();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void verify_location() throws IOException, InterruptedException {

		dashbaord.verify_city("Dubai");
		Thread.sleep(3000);
		dashbaord.verify_area("Airport Road");

	}

	@Test(priority = 4)
	public void vefiry_banner() throws InterruptedException {
		dashbaord.verify_banners();

	}

	@Test(priority = 5)
	public void verify_resto() throws IOException, InterruptedException {

		dashbaord.verify_Partner_restaurent();

	}

	@Test(priority = 6)
	public void verify_contact() {

		dashbaord.verify_contact();

	}

	@Test(priority = 7)
	public void verify_quicklinks() throws IOException, InterruptedException {

		dashbaord.verify_Quicklinks();

	}

	@Test(priority = 8)
	public void verify_rights() throws IOException, InterruptedException {

		dashbaord.verify_rights();

	}

}
