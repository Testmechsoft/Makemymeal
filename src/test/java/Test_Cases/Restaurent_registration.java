package Test_Cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;
import lib_methods.ExcelSheetDriver;

public class Restaurent_registration extends config.Configuration {

	public String data = "E:\\Siddhartha\\Projects\\Automation-neon\\MMM.zip_expanded\\com.Makemymeal_\\src\\test\\resources\\dataprovider\\testdata.xls";
	public ExcelSheetDriver excel;

	@Test(dataProvider = "data")
	public void Restaurant_Management(String email, String cemail, String rname, String pass, String type
		, String category, String weekoff, String area //, String cod, String pause, String code, String contact,
//			String address, String captcha, String firstname, String lastname, String pcod, String pcontact, String add,
//			String rimg, String mimg

	) throws IOException, InterruptedException, BiffException {

		try {
			reg.enter_email(email);
			Thread.sleep(1000);
			reg.enter_cemail(cemail);
			Thread.sleep(1000);
			reg.enter_restaurantname(rname);
			Thread.sleep(1000);
			reg.enter_restauranpassword(pass);
			Thread.sleep(1000);
			reg.select_restauranType(type);
			Thread.sleep(5000);
			 reg.select_category(category);
			 Thread.sleep(3000);
			 reg.select_weekoff(weekoff);
			 Thread.sleep(2000);
			 reg.select_area(area);
			 Thread.sleep(2000);
//			 reg.select_cod(cod);
//			 Thread.sleep(1000);
//			 reg.Enter_pausecount(pause);
//			 Thread.sleep(1000);
//			 reg.select_code(code);
//			 Thread.sleep(1000);
//			 reg.Enter_contactno(contact);
//			 Thread.sleep(1000);
//			 reg.Enter_address(address);
//			 Thread.sleep(1000);
//			 reg.Enter_firstname(firstname);
//			 Thread.sleep(1000);
//			 reg.Enter_lastname(lastname);
//			 Thread.sleep(1000);
//			 reg.selec_pcode(pcod);
//			 Thread.sleep(1000);
//			 reg.Enter_pcontactno(pcontact);
//			 Thread.sleep(1000);
//			 reg.Enter_address(add);
//			 Thread.sleep(1000);
//			 reg.upload_restuarantimage(rimg);
//			 Thread.sleep(1000);
//			 reg.upload_menuimage(mimg);
//			Thread.sleep(1000);
//			reg.enter_captcha();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@DataProvider(name = "data")
	public Object[][] passdata() throws BiffException, IOException {

		excel = new ExcelSheetDriver(data, "Dashboard");
		int RowCount = ExcelSheetDriver.RowCount();

		Object[][] data = new Object[RowCount][8];

		for (int i = 0; i < RowCount; i++) {

			data[i][0] = ExcelSheetDriver.ReadCell(0, i);
			data[i][1] = ExcelSheetDriver.ReadCell(1, i);
			data[i][2] = ExcelSheetDriver.ReadCell(2, i);
			data[i][3] = ExcelSheetDriver.ReadCell(3, i);
			data[i][4] = ExcelSheetDriver.ReadCell(4, i);
			data[i][5] = ExcelSheetDriver.ReadCell(5, i);
			data[i][6] = ExcelSheetDriver.ReadCell(6, i);
			data[i][7] = ExcelSheetDriver.ReadCell(7, i);
//			data[i][8] = ExcelSheetDriver.ReadCell(8, i);
//			data[i][9] = ExcelSheetDriver.ReadCell(9, i);
//			data[i][10] = ExcelSheetDriver.ReadCell(10, i);
//			data[i][11] = ExcelSheetDriver.ReadCell(11, i);
//			data[i][12] = ExcelSheetDriver.ReadCell(12, i);
//			data[i][13] = ExcelSheetDriver.ReadCell(13, i);
//			data[i][14] = ExcelSheetDriver.ReadCell(14, i);
//			data[i][15] = ExcelSheetDriver.ReadCell(15, i);
//			data[i][16] = ExcelSheetDriver.ReadCell(16, i);
//			data[i][17] = ExcelSheetDriver.ReadCell(17, i);
//			data[i][18] = ExcelSheetDriver.ReadCell(18, i);
//			data[i][19] = ExcelSheetDriver.ReadCell(19, i);

		}
		return data;

	}

}
