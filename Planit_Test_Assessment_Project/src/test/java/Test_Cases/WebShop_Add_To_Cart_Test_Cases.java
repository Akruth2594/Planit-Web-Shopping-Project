package Test_Cases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Page_Object.Web_Shop_Base_Class;
import Pages.WebShop_Add_To_Cart;

public class WebShop_Add_To_Cart_Test_Cases extends Web_Shop_Base_Class{

	@Test(priority= 1)
	public void AddToCard() throws IOException {
		
		Properties properties=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//Resources//confiq.properties");
		properties.load(file);
		
		
		
		
		
		//Created String for Quantity value from the object repository
		String QuantityNumber=properties.getProperty("Quantity");
		
		
		// Created a constructor to Access the Methods frpm Web Shop Add to Cart POM page
		WebShop_Add_To_Cart CartReferences=new WebShop_Add_To_Cart(driver);
		
		CartReferences.ClickOnTheShoppingCart();
		logger.info("Clicked on Shopping Cart");
		
		
		
		CartReferences.ClickOnRemoveCheckBox();
		logger.info("Clicked on remove check box");
		
		
		CartReferences.ClickOnUpdateBox();
		logger.info("Clicked on Update Button");
		
		CartReferences.ClickOnBookOption();
		logger.info("Clicked on Books Section ");
		
		
		
		CartReferences.ClickHealthBookOption();
		logger.info("Clicked Health Book ");
		
		
		CartReferences.QuantityofTheBookClick();
		logger.info("Clicked Quantity tab ");
		
		
		
		CartReferences.QuantityofTheBookClear();
		logger.info("Erased the available data  ");
		
		
		
		CartReferences.QuantityofTheBook(QuantityNumber);
		logger.info("Added the quantity of the books ");
		
		
		
		CartReferences.ClickHonAddCartAfterSelectingModule();
		logger.info("Product is added to the cart ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
