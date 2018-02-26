package Test_Cases;

import org.testng.annotations.*;

public class t extends config.Configuration {

	@Test
	public void Restaurant_Management() throws InterruptedException {

		reg.select_category("North Indian Veg");
	}

}
