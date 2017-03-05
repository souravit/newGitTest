package GenricConstant;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
 
	//public static WebDriver driver;
	
	public static JavascriptExecutor driver;

	public static void getDriver(String URL){
		WebDriver driver;
		String exePath = "/Users/souravsingh/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get(URL);
		
		
//		WebDriver driver;
//    	System.setProperty("webdriver.gecko.driver","/Users/souravsingh/Downloads/geckodriver");
//    	driver =new FirefoxDriver();
//    	driver.get(URL);
	}
}
