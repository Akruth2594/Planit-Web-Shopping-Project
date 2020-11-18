package Test_Cases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Web_Shop_Base_Class;
import Pages.WebShop_Price_Verfication;

public class WebShop_Price_Verfication_Test_Case extends Web_Shop_Base_Class{

	@Test(priority=2)
	public void PriceVerfication() {
		
		//Creating constructor to Price Verfication Page
		
		 WebShop_Price_Verfication pricereferencesvariable=new  WebShop_Price_Verfication(driver);
		
		 
		 pricereferencesvariable.ShoppingCartNewClick();
		 logger.info("Shopping cart is opened before Hovering");
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(pricereferencesvariable.HovertoShoppingCart()).build().perform();
		 logger.info("Mouse hovered to the Shopping Cart");
		 
		
		
		
		
		 pricereferencesvariable.ClickonTermsConditionCheckBox();
		 logger.info("Mandatory checkbox ticked");
		 
		 pricereferencesvariable.ClickonCheckOutButton();
		 logger.info("Clicked on the Checkout Button");
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
