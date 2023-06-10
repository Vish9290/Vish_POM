package POMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage 
{
	
	@FindBy(xpath = "//input[@name='password']") private WebElement enterPwd;
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement pwdSignIn;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EneterPWD()
	{
		enterPwd.sendKeys("Vish@9092");
	}
	
	public void ClickPwdbtn()
	{
		pwdSignIn.click();
	}

}
