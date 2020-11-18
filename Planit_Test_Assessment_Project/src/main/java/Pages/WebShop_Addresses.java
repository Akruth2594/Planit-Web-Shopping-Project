package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Web_Shop_Base_Class;
import Utilities.xls_Reader;

public class  WebShop_Addresses extends Web_Shop_Base_Class{
	
	//Selecting the dropdown Address
	@FindBy(id="billing-address-select")
	WebElement DropDownSelectingAddress;
	
	//Select by the FirstName
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	WebElement FirstNameAddress;
	
	
	//Select by the LastName
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	WebElement LastNameAddress;
	
	//Select by the Email 
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	WebElement EmailAddress;
	
	
	//input[@id='BillingNewAddress_Email']
	
	//Selecting the dropdown Country
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement DropDownSelectingCountry;
	
	
	//Select by the City
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	WebElement CityNameAddress;
	
	//Select by the Address
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	WebElement AddressOne;
	
	//Select by the Zip
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement ZipAddress;
	
	//Select by the Phoneadress
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement 	PhoneAddress;
	
	//Select by the ContinueOne
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]")
	WebElement 	CountinueOne;
	
	//Selecting the dropdown ShippingAddress
	@FindBy(id="shipping-address-select")
	WebElement DropDownSelectingShippingAddress;
	
	//Select by the ContinueTwo
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]")
	WebElement 	CountinueTwo;
	
	//Select by the Next Day on Air
		@FindBy(xpath="//input[@id='shippingoption_1']")
		WebElement 	NextDayAir;
	
	
	//Select by the ContinueThree
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]")
	WebElement 	CountinueThree;
		
		
		 
	
	
    public WebShop_Addresses(WebDriver driver) {;
	PageFactory.initElements(driver, this); 
	
    }
    
    
    
    
    //Created Method to click on Building Adress DropDown
    public WebElement BuldingAddress() {
    	DropDownSelectingAddress();
		return  DropDownSelectingAddress;
	}

    //Created Method to write First Name
    public void ClickFirname(String fnam) {
    	FirstNameAddress.sendKeys(fnam);
    }
    
  //Created Method to write Last Name
    public void Clicklasname(String lnam) {
    	LastNameAddress.sendKeys(lnam);
    }
    
    //Created Method to write Email 
    public void MailIdName(String Enam) {
    	EmailAddress.sendKeys(Enam);
    }
    
    
    
  //Created Method to write Country DropDown
    public WebElement CountrySelection() {
    	DropDownSelectingCountry();
		return  DropDownSelectingCountry;
	}
    
  //Created Method to write City Name
    public void ClickCityName(String Cinam) {
    	CityNameAddress.sendKeys(Cinam);
    }
    
  //Created Method to write Address
    public void AddressName(String Adnam) {
    	AddressOne.sendKeys(Adnam);
    }
    
  //Created Method to write Zip
    public void Zipnumber(String Zinam) {
    	ZipAddress.sendKeys(Zinam);
    }
    
  //Created Method to write PhoneNumber
    public void Phnumber(String Phnam) {
    	PhoneAddress.sendKeys(Phnam);
    }
    
  //Created Method to Click on continue Button 
    public void Continuefirst() {
    	CountinueOne.click();
    }
    
    
    
    
   //Created Method to click on Shipping Adress DropDown
    public WebElement ShippingAddress() {
    	DropDownSelectingShippingAddress();
		return  DropDownSelectingShippingAddress;
	}
    
    
  //Created Method to Click on continue Button two 
    public void ContinueSecond() {
    	CountinueTwo.click();
    }
    
    
    
  //Created Method to Click on Next Day on Air
    public void ClickonNextDayOnAir() {
    	NextDayAir.click();
    }
    
    
    //Created Method to Click on continue Button three
      public void ContinueThree() {
      	CountinueThree.click();
      }
      
    
    
    
    
    
    
    
	private void DropDownSelectingCountry() {
		// TODO Auto-generated method stub
		
	}


	private void DropDownSelectingAddress() {
		// TODO Auto-generated method stub
		
	}
    
	private void DropDownSelectingShippingAddress() {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    

}


