package RegistrationPackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationClass 

{  // Begining of the Class

	WebDriver ref;
	
	//Constructor
	public RegistrationClass(WebDriver ref)
	{
		this.ref=ref;
	}
	
	public WebElement Registrationlink()
	{
		return ref.findElement(By.xpath("//a[text()='Registration']"));
	}
	public WebElement Firstname()
	{
		return ref.findElement(By.id("name_3_firstname"));
	}
	public WebElement Lastname()
	{
		return ref.findElement(By.id("name_3_lastname"));
	}
	public WebElement MaritalStatus()
	{
		System.out.println("Please Enter the Marital Status 1.Single 2. Married 3. Divorced ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int MS=sc.nextInt();
		//Checking the input from user
		if(MS==1)
		return ref.findElement(By.xpath("//input[@value='single']"));
		else if(MS==2)
			return ref.findElement(By.xpath("//input[@value='married']"));
		else
			return ref.findElement(By.xpath("//input[@value='divorced']"));
			
	}
	public WebElement Hobby()
	{
		System.out.println("Please Enter the Marital Status 1.Single 2. Married 3. Divorced ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int Hb=sc.nextInt();
		//Checking the input from user
		if(Hb==1)
		return ref.findElement(By.xpath("//input[@value='dance']"));
		else if(Hb==2)
			return ref.findElement(By.xpath("//input[@value='reading']"));
		else
			return ref.findElement(By.xpath("//input[@value='cricket']"));
	}
	public void Country(String Countryname)
	{
	//Creating a select class for Drop down
		
	Select dd=new Select(ref.findElement(By.id("dropdown_7")));	
	dd.selectByVisibleText(Countryname);
	
	}
	
	public  void DateofBirth(String date,String Month, String year)
	
	{
		//To select Month 
		
		       Select mm=new Select(ref.findElement(By.id("mm_date_8")));
		       mm.selectByVisibleText(Month);
		
		//To select Date 
				
		        Select dd=new Select(ref.findElement(By.id("dd_date_8")));
				dd.selectByVisibleText(date);
		//To select year 
				
				Select yy=new Select(ref.findElement(By.id("yy_date_8")));
				yy.selectByVisibleText(year);
		
	}
	
	public WebElement PhoneNumber()
	
	{
	
		return ref.findElement(By.id("phone_9"));
	}
	
    public WebElement UserName()
	
	{
	
		return ref.findElement(By.id("username"));
	}

    public WebElement Email()
    {

	return ref.findElement(By.id("email_1"));
    }
    public WebElement AboutYourself()
	
	{
	
		return ref.findElement(By.id("description"));
	}
   public WebElement ConfirmPassword()
	
	{
	
		return ref.findElement(By.id("confirm_password_password_2"));
	}
   
   public WebElement Submit()
	
	{
	
		return ref.findElement(By.xpath("//input[@value='Submit']"));
	}
   public WebElement ProfielPicture()
	
	{
	
		return ref.findElement(By.id("profile_pic_10"));
	}
   
//End of the Class 
}

