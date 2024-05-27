package mysoft.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mysoft.Basedriver.BaseDriver;
import mysoft.Basedriver.PageDriver;
import mysoft.Pages.LoginPage;

public class LoginTest extends BaseDriver {
	@BeforeClass
	public void  OpenUrl() {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	}
 @Test(priority=0)
	public void  loginTest() throws InterruptedException {
		LoginPage loginPage =new LoginPage();
		loginPage.login();
	}
}
