package com.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import lib_methods.Scroll;
import lib_methods.heighlight;

public class Checkout extends basepage {

	public WebDriver driver;
	public heighlight h;
	public Scroll s;

	public Checkout(WebDriver drv) {

		super(drv);
		h = new heighlight(driver);
		s = new Scroll(driver);

	}

	@FindBy(xpath = ".//*[@class='form-control datepicker hasDatepicker']")
	@CacheLookup
	WebElement startdate_cal;

	@FindBy(xpath = ".//*[@href='#' and contains(text(),'28')]")
	@CacheLookup
	WebElement startdate;

	@FindBy(xpath = ".//*[@id='btnAddress']")
	@CacheLookup
	WebElement address;
	
	
	@FindBy(xpath = ".//*[@id='FlatNo']")
	@CacheLookup
	WebElement FlatNo;
	
	@FindBy(xpath = ".//*[@id='FloorNo']")
	@CacheLookup
	WebElement FloorNo;
	
	@FindBy(xpath = ".//*[@id='BuildingName']")
	@CacheLookup
	WebElement BuildingName;
	
	@FindBy(xpath = ".//*[@id='Street']")
	@CacheLookup
	WebElement Street;
	
	@FindBy(xpath = ".//*[@id='Landmark']")
	@CacheLookup
	WebElement Landmark;
	
	@FindBy(xpath = ".//*[@id='btnSaveAdd']")
	@CacheLookup
	WebElement save;
	
	


	public void select_date() throws InterruptedException {

		h.h(startdate_cal);
		startdate_cal.click();

		Thread.sleep(1000);

		h.h(startdate);
		startdate.click();

		Thread.sleep(1000);

		h.h(address);
		address.click();

	}

	public void select_area(String ar) throws InterruptedException {
		Thread.sleep(2000);


		try {
			h.h(address);
			address.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread.sleep(1000);

		WebElement x = driver.findElement(By.xpath(".//*[@id='modallogin']/div/div/div[2]/div/div/div[2]/div[1]/span/span/span[1]"));

		x.click();
		
		Thread.sleep(1000);

		List<WebElement> locationlist = driver.findElements(By.xpath(".//*[@id='AreaByRest_listbox']/li"));

		for (WebElement ele : locationlist) {

			ele.getText();

			if (ele.getText().equalsIgnoreCase(ar)) {

				ele.click();

				Thread.sleep(2000);

				break;
			}
			
		}
		
	}
			public void Enter_address(String fno,String floorno,String bname,String landmark)throws InterruptedException {
				
				h.h(FlatNo);
				FlatNo.sendKeys(fno);
				
				Thread.sleep(1000);
				
				h.h(FloorNo);
				FloorNo.sendKeys(floorno);
				
				Thread.sleep(1000);
				
				h.h(BuildingName);
				BuildingName.sendKeys(bname);
				
				Thread.sleep(1000);
				
				h.h(Landmark);
				Landmark.sendKeys(landmark);
				
				
				h.h(save);
				save.click();
				
				Thread.sleep(1000);
				
			}
			

		
	
}
