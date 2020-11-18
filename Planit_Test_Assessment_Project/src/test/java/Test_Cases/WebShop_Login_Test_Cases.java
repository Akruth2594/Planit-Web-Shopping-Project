package Test_Cases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Page_Object.Web_Shop_Base_Class;
import Pages.WebShop_LogIn_Page_Path;

public class WebShop_Login_Test_Cases extends Web_Shop_Base_Class{

	@Test
	public void LoginText() throws IOException {
		//Path for Property Files to Login details 
		Properties properties=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//Resources//confiq.properties");
		properties.load(file);
		
		//String StringUrl=properties.getProperty("URL");
		//driver.get(StringUrl);
		String Emaildeatails=properties.getProperty("Email");
		String Passworddeatails=properties.getProperty("Password");	
		
		//driver.get(StringUrl);
		
		WebShop_LogIn_Page_Path LoginPageReferences=new WebShop_LogIn_Page_Path(driver);
		
		LoginPageReferences.ClickL();
		logger.info("Login Message is opened");
		
		//Validate the Sign In message
		WebElement Validating=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
		if(Validating.isDisplayed())
		{
			System.out.println("Please Sign In is Present and Validated");
		}
		else {
			System.out.println("Please Sign In is not Present");
		}
		
		LoginPageReferences.OnlineShoppingEmail(Emaildeatails);
		logger.info("Login id is entered");
		
		LoginPageReferences.OnlineShoppingPassword(Passworddeatails);
		logger.info("Password id is entered");
		
		LoginPageReferences.ClickLogin();
		logger.info("Logged into Home Profile ");
		
		//Validating Id is on the right 
		WebElement ValidatingUserAccountId=driver.findElement(By.xpath("//a[contains(text(),'atest@gmail.com')]"));
		if(ValidatingUserAccountId.isDisplayed())
		{
			System.out.println("User Id is Present on the right and Validated");
		}
		else {
			System.out.println("User Id is not Present");
		}
		
		LoginPageReferences.ClickOnSimpleComputer();
		logger.info("Opened the Simple Computer page");
		
		LoginPageReferences.ClickonProccessor();
		logger.info("Selected the Proccessor");
		
		
		LoginPageReferences.ClickonSimpleComputertoTheCart();
		logger.info("Added Simple computer into the cart");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
