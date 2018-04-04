package Test_Cases;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.testng.annotations.Test;

public class loyalty_calculator {

	public int meal_price;
	public int VAT = 5;
	public int markup_percentage;
	public int commision_percentage;
	public double baseprice;
	public double loyality_amount;
	public double loyality_points;
	public double markup;
	public double commision;
	public double meal_price_with_markup;
	public double meal_price_with_commison;
	public double baseprice_Vat;

	@Test
	public void calculate_loyalty_markup() throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		System.err.print("Enter meal price :");

		Thread.sleep(1000);

		meal_price = scan.nextInt();

		System.err.print("Enter markup % :");

		Thread.sleep(1000);

		markup_percentage = scan.nextInt();

		markup = (meal_price * markup_percentage) / 100;

		meal_price_with_markup = meal_price + markup;

		System.out.println("meal_price:" + " " + meal_price_with_markup + " " + "AED");

		Thread.sleep(1000);

		baseprice_Vat = (meal_price_with_markup * 100) / (100 + markup_percentage);

		System.out.println("Base price + vat - markup:" + baseprice_Vat + " " + "AED");

		Thread.sleep(1000);

		baseprice = (baseprice_Vat * 100) / 105;

		DecimalFormat df = new DecimalFormat("#.##");
		Double d = new Double(baseprice);

		String b = df.format(d);

		double base = Double.parseDouble(b);

		System.out.println("Base price :" + base + " " + "AED");

		Thread.sleep(1000);

		loyality_amount = (2 * base) / 100;

		Double c = new Double(loyality_amount);

		String x = df.format(c);

		double l = Double.parseDouble(x);

		System.out.println("loyality_amount :" + " " + loyality_amount);
		Thread.sleep(1000);

		loyality_points = loyality_amount * 100;

		System.err.println("loyality_points :" + " " + loyality_points);
	}

	@Test(enabled = false)
	public void calculate_loyalty_commission() throws InterruptedException {

		Scanner scan = new Scanner(System.in);

		System.err.print("Enter meal price :");

		Thread.sleep(1000);

		meal_price = scan.nextInt();

		System.err.print("Enter commision % :");

		Thread.sleep(1000);

		commision_percentage = scan.nextInt();

		commision = (meal_price * commision_percentage) / 100;

		meal_price_with_commison = meal_price + commision;

		System.out.println("meal_price:" + " " + meal_price_with_commison + " " + "AED");

		Thread.sleep(1000);

		baseprice_Vat = (meal_price_with_commison * 100) / (100 + commision_percentage);

		System.out.println("Base price + vat - commission:" + baseprice_Vat + " " + "AED");

		Thread.sleep(1000);

		baseprice = (baseprice_Vat * 100) / 105;

		DecimalFormat df = new DecimalFormat("#.##");
		Double d = new Double(baseprice);

		String b = df.format(d);

		double base = Double.parseDouble(b);

		System.out.println("Base price :" + base + " " + "AED");

		Thread.sleep(1000);

		loyality_amount = (2 * base) / 100;

		Double c = new Double(loyality_amount);

		String x = df.format(c);

		double l = Double.parseDouble(x);

		System.out.println("loyality_amount :" + " " + loyality_amount);

		loyality_points = loyality_amount * 100;

		System.err.println("loyality_points :" + " " + loyality_points);
	}

}
