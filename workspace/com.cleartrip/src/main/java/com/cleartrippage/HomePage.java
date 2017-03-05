package com.cleartrippage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

	@FindBy(xpath="//*[contains(text(),'round trip')]")
	private static WebElement roundTrip;
	
	public static WebElement clickRoundTrip(){
		return roundTrip;
	}
}
