package com.cleartrip.com.cleartrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) 
    {
    			// Create a new instance of the Firefox driver 
//    	WebDriver driver;
//    	System.setProperty("webdriver.gecko.driver","/Users/souravsingh/Downloads/geckodriver");
//    	driver =new FirefoxDriver();
//    	
    	WebDriver driver;
		String exePath = "/Users/souravsingh/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://www.cleatrip.com");
    	        //Launch the Online Store Website
    			driver.get("http://www.cleatrip.com");
    	 
    	        // Print a Log In message to the screen
    	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
    	 
    			//Wait for 5 Sec
    			try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    	        // Close the driver
    	        driver.quit();
    	    }
    }

