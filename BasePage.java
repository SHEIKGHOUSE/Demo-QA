package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void WaitForObject(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
		wait=new WebDriverWait(driver,60);

	}
	

}
