package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.Loginpage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps {
	
	WebDriver driver;
	Loginpage lp;
	
	
	@Given("User should access application url as {string}")
	public void user_should_access_application_url_as(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new Loginpage(driver);
		driver.manage().window().maximize();
		driver.get(url);
	    
	}

	@When("User should enter username as {string} and password as {string}")
	public void user_should_enter_username_as_and_password_as(String username, String passwd) {
		
		lp.Username(username);
		lp.Password(passwd);
	    
	}

	@Then("User should clcick on login button")
	public void user_should_clcick_on_login_button() {
		
		lp.Login();
	    
	}

	@And("User should verify homepage title as {string}")
	public void user_should_verify_homepage_title_as(String title) {
		
		if(driver.getPageSource().contains(title)) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}

	@And("User should verify errormessage as {string}")
	public void user_should_verify_errormessage_as(String msg) {
		
		if(driver.getPageSource().contains(msg)) {
			
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
	    
	}

}
