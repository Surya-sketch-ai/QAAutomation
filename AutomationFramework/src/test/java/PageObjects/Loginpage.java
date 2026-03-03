package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="user-name")
	WebElement txtusername;
	
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	
	@FindBy(id="login-button")
	WebElement btn;
	
	
	
	public void Username(String uname) {
		
		txtusername.sendKeys(uname);
	}
	
	public void Password(String passwd) {
		
		txtpassword.sendKeys(passwd);
	}
	
	
	public void Login() {
		
		btn.click();
	}

}
