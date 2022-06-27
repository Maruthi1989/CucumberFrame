package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class Login 
{
	WebDriver driver=null;
	LoginPage login;
	
	
	@Before
	@Given("browser is open")
	public void browser_is_open() 
	{
	
		String strpath=System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strpath);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() 
	{
	    driver.get("https://demo.guru99.com/test/login.html");
	}
	
	
	

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		login=new LoginPage(driver);
		
	   login.enteremailid("harish@gmail.com");
	   login.eneterPassword("harish123");
	}

	@And("user clicks on login")
	public void user_clicks_on_login() 
	{
	    login.clickSignin();
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() 
	{
	   login.verifyLoginSuccess();
	}

	
	
	

}//main class close
