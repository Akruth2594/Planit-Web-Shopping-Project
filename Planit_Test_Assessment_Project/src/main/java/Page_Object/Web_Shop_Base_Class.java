package Page_Object;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

     
public class Web_Shop_Base_Class {

	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Resources//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger=logger.getLogger("Online Shopping");
		PropertyConfigurator.configure("log4j2.properties");

	}
	
	
	
	
	
	
	
	
	@AfterTest
    public static void Teardown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
}
