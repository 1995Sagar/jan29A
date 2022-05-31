package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	 @FindBy(xpath="//button[@id='react-burger-menu-btn']")
	    private WebElement manu;
	    
	    @FindBy(xpath="//a[@id='logout_sidebar_link']")
	    private WebElement logout;
	    
		public Homepage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void manuclick() {
		manu.click();
		
	   }
		public void logoutclick() throws InterruptedException {
			Thread.sleep(2000);
			logout.click();
			
	}	    

}
