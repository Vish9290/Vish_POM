package POMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiginPage
{
	
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIn;
	
	public SiginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignIn()
	{
		signIn.click();
	}

}
