package com.cleartrip.com.cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cleartrippage.HomePage;

import GenricConstant.Driver;
import GenricConstant.Genric;

public class ClearTrip {
	@BeforeClass
	public void LaunchBrowser(){
		
		Driver.getDriver(Genric.URL);
	}
@Test
public void Flow() throws InterruptedException{
	WebDriver driver = null;
	System.out.println("done");
	Thread.sleep(5000);
	//HomePage.clickRoundTrip().click();
	//HomePage.clickRoundTrip().sendKeys("Bengalore");
	Genric.clickUsingjsClick(HomePage.clickRoundTrip());
	//driver.findElement(By.xpath(".//*[@id='js-switch__option']//following::div[1]//label[@for='switch__input_2']")).sendKeys(Keys.ENTER);
	
	//WebElement webElement = driver.findElement(By.xpath("//*[@id='js-switch__option']/div[2]/label"));
	//webElement.sendKeys(Keys.TAB);
	//webElement.sendKeys(Keys.ENTER);
	//System.out.println("fuckedup");
	Thread.sleep(5000);
}
}
