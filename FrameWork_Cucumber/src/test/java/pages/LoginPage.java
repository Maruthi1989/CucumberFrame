package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	
	
	@FindBy(id="email")
	WebElement Email_Id;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement Sigin;
	
	@FindBy(xpath="//h3[text()='Successfully Logged in...']")
	WebElement Homepage;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void enteremailid(String emailid)
	{
		Email_Id.sendKeys(emailid);
	}
	
	//It will enter the passwword
	public void eneterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	//It will click on the signin button
	public void clickSignin()
	{
		Sigin.click();
	}
	
	//It will verify the Login Success
	public void verifyLoginSuccess()
	{
		Homepage.isDisplayed();
	}
	
}
