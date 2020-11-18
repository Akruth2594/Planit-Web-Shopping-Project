package Test_Cases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page_Object.Web_Shop_Base_Class;
import Pages.WebShop_Addresses;

public class WebShop_Address_Shipment_Test_Cases extends Web_Shop_Base_Class{

	@Test(priority=3)
	public void AddressofDeleivery() throws IOException {
		Properties properties=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//Resources//confiq.properties");
		properties.load(file);
		
		//String NewAddress=properties.getProperty("BuildingAddress");
		String Frname=properties.getProperty("FirstName");
		String Ltname=properties.getProperty("LastName");
		String MailId=properties.getProperty("EmailId");
		
		String Countryname=properties.getProperty("Country");
		String Cityname=properties.getProperty("City");
		String DetailAddress=properties.getProperty("Address");
		String Zipname=properties.getProperty("Zip");
		String Phonenumber=properties.getProperty("Phone");
		
		 WebShop_Addresses pathadr=new  WebShop_Addresses(driver);
		 
		 Select dropdownone=new Select(pathadr.BuldingAddress());
		 dropdownone.selectByVisibleText("New Address");
		 logger.info("New Adress is Selected");
		 
		 pathadr.ClickFirname(Frname);
		 logger.info("First Name is given");
		 
		 pathadr.Clicklasname(Ltname);
		 logger.info("Last Name is given");
		 
		// pathadr.MailIdName(MailId);
		// logger.info("Mail id is given");
		 
		 
		 Select dropdowntwo=new Select(pathadr.CountrySelection());
		 dropdowntwo.selectByVisibleText("Antarctica"); 
		 logger.info("Country name is given");
		 
		 pathadr.ClickCityName(Cityname);
		 logger.info("CityName is given");
		 
		 pathadr.AddressName(DetailAddress);
		 logger.info("Adress is given");
		 
		 
		 pathadr.Zipnumber(Zipname);
		 logger.info("Zip is given");
		 
		 pathadr.Phnumber(Phonenumber);
		 logger.info("Phone is given");
		 
		 pathadr.Continuefirst();
		 logger.info("Clicked on Continue option");
		 
		 
		 Select dropdownthree=new Select(pathadr.ShippingAddress());
		 dropdownthree.selectByValue("1718651");
		 logger.info("Shipping address is given");
		 
		 
		 pathadr.ContinueSecond();
		 logger.info("Clicked on Continue option");
		 
		 pathadr.ClickonNextDayOnAir();
		 logger.info("Clicked on the iNext day on Air Option");
		
		 
		 pathadr.ContinueThree();
		 logger.info("Click on Continue option");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
