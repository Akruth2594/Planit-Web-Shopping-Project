package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Web_Shop_Base_Class;

public class WebShop_Price_Verfication extends Web_Shop_Base_Class{
    
	//
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement ShoppingCartNew;
	
	//Created WebElement to hover
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement HoveronShoppingCart;
	
	//Wrote Xpath to click on Check Box 
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement TermsConditionCheckBox;
	
	//Wrote Xpath for CheckOut Box
	@FindBy(xpath="//button[@id='checkout']")
	WebElement CheckOutButton;
	
	
	
	public  WebShop_Price_Verfication(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void ShoppingCartNewClick() {
		ShoppingCartNew.click();
	}
	
	
	
	//Created below method to use Action class
	public WebElement HovertoShoppingCart() {
		HoveronShoppingCart();
		return HoveronShoppingCart;
	}
	
	//Created below method to select mandatory check box
	public void ClickonTermsConditionCheckBox() {
		TermsConditionCheckBox.click();
	}
	
	//Created below method to click on check out 
	public void ClickonCheckOutButton() {
		CheckOutButton.click();
	}
	
	
	
	
	private void HoveronShoppingCart() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
}
