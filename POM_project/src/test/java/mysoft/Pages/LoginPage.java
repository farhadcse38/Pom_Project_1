package mysoft.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import mysoft.Basedriver.PageDriver;
import mysoft.Utilities.CommonMethods;

public class LoginPage extends CommonMethods {
	public LoginPage() {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}

	@FindBys({
		@FindBy(xpath="//input[@placeholder='Username']")
	})
	
	WebElement userName;
	
	@FindBys({
		@FindBy(xpath="//input[@placeholder='Password']")
	})
	
	WebElement Password;

	
	@FindBys({
		@FindBy(xpath="//button[normalize-space()='Login']")
	})
	
	WebElement Login;
	
	public void login() throws InterruptedException {
		timeout();
		try {
			
			if(userName.isDisplayed()) {
				userName.sendKeys("Admin");
				timeout();
				
			}
		}	catch (Exception e)
			{
				System.out.println(e);
			}
		
		   try {
				
				if(Password.isDisplayed()) {
					Password.sendKeys("admin123");
					timeout();
				}
		   }	catch (Exception e)
				{
					System.out.println(e);
				}
		   
		   try {
				
				if(Login.isDisplayed()) {
					Login.click();
					timeout();
				}
		   }	catch (Exception e)
				{
					System.out.println(e);
				}
	}
}
	


