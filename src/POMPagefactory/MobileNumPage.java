package POMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileNumPage 
{
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement enterNum;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement SignInPwd;
	
	public MobileNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EneterNumber()
	{
		enterNum.sendKeys("9960138174");
	}
	
	public void ClickSignINPwd()
	{
		SignInPwd.click();
	}
}
