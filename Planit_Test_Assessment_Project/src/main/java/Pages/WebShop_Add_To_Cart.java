package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebShop_Add_To_Cart {

    //Wrote Xpath to click on Add to cart 
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement ClickonShoppingCart;
	
	//Wrote Name Locator to click on check box
	@FindBy(xpath="//tbody/tr[1]/td[1]/input[1]")
	WebElement ClickonRemovefromCartCheckBox;
	
	//Wrote Name Locator to click on update box
	@FindBy(name="updatecart")
	WebElement ClickonRemovefromCartUpdateCart;
	
	//Wrote Xpath to click on Book Option
	@FindBy(xpath="//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement ClickonBookLink;
	
	
	//Wrote Xpath to click on Health Book
	@FindBy(xpath="//a[contains(text(),'Health Book')]")
	WebElement ClickonHealthBook;
	
	//Wrote Xpath to click on Health Book quantity
	@FindBy(xpath="//input[@id='addtocart_22_EnteredQuantity']")
	WebElement ClickonChangeQuantitySpace;
	
	
	//Wrote Xpath to click on Health Book quantity to clear
		@FindBy(xpath="//input[@id='addtocart_22_EnteredQuantity']")
		WebElement ClickonChangeQuantityClear;
	
	
	
	//Wrote Xpath to click on to change the quantity of the 
	@FindBy(xpath="//input[@id='addtocart_22_EnteredQuantity']")
	WebElement ClickonChangeQuantity;
	
    //Wrote Xpath to click on to Add to cart after selecting product and give quantity
	@FindBy(xpath="//input[@id='add-to-cart-button-22']")
	WebElement ClickonAddtoCart;
	
	
	
	
	public WebShop_Add_To_Cart(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	//Created a method which is used for Clicking on Shopping cart to open cart module 
	public void ClickOnTheShoppingCart() {
		ClickonShoppingCart.click();
	}
	
	//Created a method which is used to select a check box to delete the added Cart books
	public void ClickOnRemoveCheckBox() {
		ClickonRemovefromCartCheckBox.click();
	}
	
	
	//Created a method which is used to select a update box option to update the status of the action
	public void ClickOnUpdateBox() {
		ClickonRemovefromCartUpdateCart.click();;
	}
	
	
	//Created a method to click Books options to check the Different Books 
	public void ClickOnBookOption() {
		ClickonBookLink.click();
	}
	
	//Created a method to click on Health which was selected
	public void ClickHealthBookOption() {
		 ClickonHealthBook.click();
	}
	
	//Click on the quality box
	public void QuantityofTheBookClick() {
		ClickonChangeQuantitySpace.click();
	   }
	
	
	//Click on the quality box
		public void QuantityofTheBookClear() {
			ClickonChangeQuantityClear.clear();
		   }
	
	
	//Created a method to send number of the quality
	public void QuantityofTheBook(String nameng) {
		ClickonChangeQuantity.sendKeys(nameng);
	   }
	
	
	//Created a method to click on Add to cart button
	public void ClickHonAddCartAfterSelectingModule() {
		ClickonAddtoCart.click();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
