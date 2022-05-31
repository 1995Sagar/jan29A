package test123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.base;
import pomclass.Homepage1;
import pomclass.Loginpage1;

public class Testclass {
	WebDriver driver;
	Loginpage1 loginpage1; 
	Homepage1 homepage1;
	@Parameters("browser")
	@BeforeTest
	public void lanchBrowser(String browser) {
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
			driver = base.openChromeBrowser();
		}
		if(browser.equals("Edge"))
		{
			driver = base.openOperaBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}	
	@BeforeClass
	public void lanuchthebrow()  {
		 
		//System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
				
				// driver = new ChromeDriver();
			//	driver.get("https://www.saucedemo.com");
	}
	@BeforeMethod 
	public void loginpage1() {
		driver.get("https://www.saucedemo.com");
		loginpage1 = new Loginpage1(driver);
				loginpage1.sendusername();
				loginpage1.sendpassword();
				loginpage1.loginclick();
	}
	@Test
	public void homepage1() throws InterruptedException {
		System.out.println("test");
	}
	@AfterMethod
	public void logout() throws InterruptedException {
				//WebDriver driver = null;
		 homepage1 = new Homepage1(driver);
			homepage1.manuclick();
			homepage1.logoutclick();
	}

}

	
	
	
	
	
	
	
	
	
	
	

