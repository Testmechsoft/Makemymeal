package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Verify_links extends config.Configuration{

	@Test
	public void verify_links() throws IOException {
		
		Navigate.navigate_to("https://www.makemymeal.ae");
		
		vf.verify("https://www.makemymeal.ae");
	}

}
