package POMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage
{
	@FindBy(xpath = "//div[text()='My Account']") private WebElement moveToMyacc;
	WebDriver driver1;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1 = driver;
	}
	
	
	public void DropDownAccountPageMoveToMyacc()
	{
		Actions act = new Actions(driver1);
		act.moveToElement(moveToMyacc).perform();
	}
}
