package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class base {
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91823\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver ;
		
	}
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91823\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver ;
	}
}

