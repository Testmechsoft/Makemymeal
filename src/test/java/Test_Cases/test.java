package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

public class test extends config.Configuration {

	@Test
	public void captcha() throws IOException, InterruptedException {
		
		reg.enter_captcha();

	}

}
