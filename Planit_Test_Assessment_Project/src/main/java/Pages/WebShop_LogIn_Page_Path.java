package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Web_Shop_Base_Class;

public class WebShop_LogIn_Page_Path extends Web_Shop_Base_Class{
    
	//Wrote Xpath for the Login button which navigate to Login credientials 
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement Logincl;
	
	
	//Wrote Xpath for the Please Sign in Text to check the validity of the Text
	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement SigninText;
	
	
	//Used Id locator to navigator for location Email box
	@FindBy(id="Email")
	WebElement EmailButton;
	
	//Used Id locator to navigator for location password box
	@FindBy(id="Password")
	WebElement PasswordButton;
	
	
	//Used Xpath locator to navigator for location Login button 
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")
	WebElement LoginButton;
	
	//Added Simple Computer
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[3]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[3]/div[2]/input[1]")
	WebElement SimpleComputer;
	
	//Clicked on the proccessor
	@FindBy(xpath="//input[@id='product_attribute_75_5_31_96']")
	WebElement proccessor;
	
	//Simple computer Cart to the computer after selecting the processor
	@FindBy(xpath="//input[@id='add-to-cart-button-75']")
	WebElement SimpleComputertoCart;
	
	
	
	
	
	public WebShop_LogIn_Page_Path(WebDriver driver) {
	PageFactory.initElements( driver, this);
	}
    
	
	
	
	
	// Created a method which can be used in Test Case and gave action to be provided by using Login method
	public void ClickL() {
		Logincl.click();
	}
	
	
	// Created a method which can be used in Test Case and gave action to be validate the text functionality
	public void ValidTextMessage() {
		SigninText.getText();
	}
	
	
	// Created a method which can be used in Test Case and gave paramater so that I can extract from object repository 
	public void OnlineShoppingEmail(String nam) {
		EmailButton.sendKeys(nam);
	   }
	
	
	// Created a method which can be used in Test Case and gave paramater so that I can extract from object repository
	public void OnlineShoppingPassword(String psd) {
		PasswordButton.sendKeys(psd);
	   }
	
	// Click on the Login Button 
	public void ClickLogin() {
		LoginButton.click();
	   }
	
	//Click on the Simple Computer to put the product in the cart 
	public void ClickOnSimpleComputer() {
		SimpleComputer.click();
	   }
	
	//Click on the Simple Proccessor as it is mandatory field
	public void ClickonProccessor() {
		proccessor.click();
	   }
	
	
	public void ClickonSimpleComputertoTheCart() {
		SimpleComputertoCart.click();
	   }
	
	
	
	
	
	
}
