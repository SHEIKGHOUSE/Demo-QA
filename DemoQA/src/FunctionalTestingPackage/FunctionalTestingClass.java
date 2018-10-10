package FunctionalTestingPackage;

import FramesWindowsPacakge.FramesandWindowClass;
import RegistrationPackage.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FunctionalTestingClass 

{

	public static void main(String[] args) 
	{
		
//*************************  Basic Browser actions  ******************************************************************//
		
		System.setProperty("webdriver.chrome.driver", "C:\\Mobily Project\\Mobily Project data\\Hard Disk transfer\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demoqa.com");
		
//***************************************************************************************************************************//
		
//******************		Registration Func ***********************************************************************************//
		
	RegistrationClass rc=new RegistrationClass(driver);
	rc.Registrationlink().click();
		rc.MaritalStatus().click();
		rc.Country("India");
		rc.Submit().click();
		rc.ProfielPicture().click();
		
//****************************************************************************************************************************//

//*****************************Frames and Windows *****************************************************
		FramesandWindowClass fw=new FramesandWindowClass(driver);
		fw.FramesandWindowsFunction().click();
		//fw.FrameSet().click();
		//fw.NewbrowserTab().click();
		fw.OpenSeprateWindow().click();
	
	}

}
