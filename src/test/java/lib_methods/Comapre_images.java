package lib_methods;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Comapre_images {

	private String imagepath = "E:\\Siddhartha\\Projects\\Automation-neon\\MMM.zip_expanded\\com.Makemymeal_\\src\\test\\resources\\TestData\\";

	public WebDriver driver;

	public Comapre_images(WebDriver drv) {
		this.driver = drv;

	}

	public boolean compare_image(WebElement ele, String imagename) {

		try {
			Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, ele);
			BufferedImage actualImage = logoImageScreenshot.getImage();

			BufferedImage expectedImage = ImageIO.read(new File(imagepath + imagename));
			
			Thread.sleep(3000);

			ImageDiffer imgDiff = new ImageDiffer();
			ImageDiff diff = imgDiff.makeDiff(actualImage,expectedImage);
			
			boolean d =diff.hasDiff();
			
			
			Assert.assertFalse(diff.hasDiff(), "Images are not Same");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return true;

	}
}
