package mysoft.Basedriver;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import io.github.bonigarcia.wdm.WebDriverManager;



public class PageDriver{
    public static final ThreadLocal <WebDriver> webDriver = new ThreadLocal<WebDriver>();
    private static PageDriver instance = null;
    private  PageDriver () {
    	
    }
    public static PageDriver getInstance() {
       if(instance==null) {
    	   instance=new PageDriver ();
       }
       return instance;
    }
  
    public WebDriver getDriver() {
    	
    	return webDriver.get();
    }
      public void setDriver(WebDriver driver) {
    	
    	webDriver.set(driver);
    }
      public static WebDriver getCurrentDriver() {
    	
    	return getInstance().getDriver();
            
    }
}