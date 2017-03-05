package GenricConstant;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genric {

	WebDriver driver;
	 public static final String URL ="http://www.makemytrip.com";
		public static void clickUsingjsClick(WebElement elementToClick) {
			// Scroll the browser to the element's Y position
			((JavascriptExecutor) Driver.driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
			((JavascriptExecutor) Driver.driver).executeScript("arguments[0].click();", elementToClick);
		}
}
