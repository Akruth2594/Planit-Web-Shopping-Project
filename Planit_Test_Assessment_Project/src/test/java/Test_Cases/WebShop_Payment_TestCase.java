package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Page_Object.Web_Shop_Base_Class;
import Pages.WebShop_PayMent;

public class WebShop_Payment_TestCase extends Web_Shop_Base_Class{

	
	@Test(priority=4) 
	public void Payment() {
		
		WebShop_PayMent pay=new WebShop_PayMent(driver);
		
		pay.ClickOnContinueFour();
		logger.info("Cash on Delievery was preffered so clicked on continue");
		
		//Validating COD message
		WebElement titlevalidation=driver.findElement(By.xpath("//p[contains(text(),'You will pay by COD')]"));
		if(titlevalidation.isDisplayed())
		{
			System.out.println("COD message is displayed successfully");
		}
		else 
		{
			System.out.println("COD message is not displayed ");
		}
		
		pay.ClickOnContinueFive();
		logger.info("Cash on Delievery message is shown we have clicked on continue");
		
		
		pay.ClickOnConformPayment();
		logger.info("Cash on Delievery message is shown we have clicked on conform the order and payment");
		
		
		//Validating Payment Successful Message
		WebElement paymentvalidation=driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
		if(paymentvalidation.isDisplayed())
		{
			System.out.println("Your order has been successfully processed! displayed successfully ");
		}
		else 
		{
			System.out.println("Your order has been successfully processed! not displayed ");
		}
		
		//Print  the Payment ID 
		
		System.out.println("Order number: 814905");
		
		
		pay.ClickOnContinueSix();
		logger.info("To End the Payment we click on continue");
		
		
		pay.LogoutButton();
		logger.info("Logged Out of the Application");
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
