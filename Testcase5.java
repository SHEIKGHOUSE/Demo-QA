package in.amazon.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.amazon.config.TestConfiguration;
import in.amazon.pages.Registration;

public class Testcase5 {
	
	WebDriver driver;
	Registration register=new Registration();
@BeforeMethod
public WebDriver beforeMethod() {
	
	driver=TestConfiguration.getDriverInstance();
	driver.manage().window().maximize();
			
			return driver;	
}
@Test
public void TC5() throws Exception {
	
	Registration wps=PageFactory.initElements(driver, Registration.class);
	//Registration register=new Registration();
	wps.amazonregistration();
}

}
