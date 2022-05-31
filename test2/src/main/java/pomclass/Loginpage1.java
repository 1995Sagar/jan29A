package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy (xpath = "(//input[@class='input_error form_input'])[1]")
	private WebElement username ;
	
	@FindBy (xpath = "(//input[@class='input_error form_input'])[2]")
	private WebElement password ;
	
	@FindBy (xpath ="//input[@type='submit']")
	private WebElement login;
	
	public Loginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void sendusername() {
			username.sendKeys("performance_glitch_user");
}
	public void sendpassword() {
		password.sendKeys("secret_sauce");
	}
	public void loginclick() {
	login.click();
		
	}
	
	}
