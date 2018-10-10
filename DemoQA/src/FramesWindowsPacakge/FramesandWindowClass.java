package FramesWindowsPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesandWindowClass 

{	//Beginning of the class
	
	WebDriver ref;
	
	//Constructor
	
	public FramesandWindowClass(WebDriver ref)
	{
		this.ref=ref;
	}
	
	public WebElement FramesandWindowsFunction()
	{
		return ref.findElement(By.xpath("//a[text()='Frames and windows']"));
	}
	
	public WebElement NewbrowserTab()
	{
		
		return ref.findElement(By.xpath("//a[text()='New Browser Tab']"));
	}
	public WebElement OpenSeprateWindow()
	{
		ref.findElement(By.xpath("//a[text()='Open Seprate New Window']")).click();	//Click the Open Seprate New Window Tab
		return ref.findElement(By.xpath("//a[text()='Open New Seprate Window']"));
	}
	
	public WebElement FrameSet()
	{
		ref.findElement(By.xpath("//a[text()='Frameset']")).click();	//click the FrameSet tab
		return ref.findElement(By.xpath("//a[text()='Open Frameset Window']"));
	}

} //End of the Class
