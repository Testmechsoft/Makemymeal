package lib_methods;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class fluent_wait {

	public WebDriver driver;

	public void fluentwait() {

		new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

	}
}

/*
 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
 * }
 * 
 * };
 */
