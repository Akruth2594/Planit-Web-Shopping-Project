package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Web_Shop_Base_Class;

public class WebShop_PayMent extends Web_Shop_Base_Class {
   
	//Xpath for the continue option is given 
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]")
	WebElement ClickOnContinue;
	
	
	//Xpath for the continue option is given 
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]")
	WebElement ClickOnContinuebutton;
	
	
	//Xpath for the Conform Payment is given
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]")
	WebElement ClickOnConformPayment;
	
	//Xpath for the continue Payment is given
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement ClickOnfinalContinuebutton;
	
	//Xpath for the Log Out Option
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement ClickOnLogOut;
	 
	
	
	
	public WebShop_PayMent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//ClickOn the Payment Continue button
	public void ClickOnContinueFour() {
	   ClickOnContinue.click();
	}
	
	
	//ClickOn the Payment Information Continue button
		public void ClickOnContinueFive() {
		ClickOnContinuebutton.click();
		}
	
		
	//ClickOn the Payment Information Conform 
	public void ClickOnConformPayment() {
		ClickOnConformPayment.click();
				}
	
	//ClickOn the Thank you Continue button
	public void ClickOnContinueSix() {
		ClickOnfinalContinuebutton.click();
			}
	
	
	//ClickOn the Thank you Continue
	public void LogoutButton() {
		ClickOnLogOut.click();
				}
	
	
	
}
