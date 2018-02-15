package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Verify_dashboard extends config.Configuration {

	@Test(enabled = false)
	public void Headerlinks() {

		Boolean links = dashbaord.verify_Headerlinks();

		if (links) {

			System.out.println("*************Headers Links are verified************");
		} else {

			System.err.println("*************Headers Links are not verified************");
		}
	}

	@Test(enabled = false)
	public void verify_cart() throws IOException {
		dashbaord.verify_cart();

	}

	@Test
	public  void verify_resto() throws IOException, InterruptedException {
	
		dashbaord.verify_restautants();

	}


	@Test(enabled = false)
	public void verify_contact() {

		dashbaord.vefify_contact();

	}

	@Test(enabled = false)
	public void verify_quicklinks() throws IOException, InterruptedException {

		dashbaord.verify_Quicklinks();

	}

	@Test(enabled = false)
	public void verify_location() throws IOException, InterruptedException {

		dashbaord.verify_location();

	}

	@Test(enabled = false)
	public void verify_rights() throws IOException, InterruptedException {

		dashbaord.verify_rights();

	}

	@Test(enabled = false)
	public void take_screenshot() throws IOException, InterruptedException {

		dashbaord.take_screenshot();

	}

}
