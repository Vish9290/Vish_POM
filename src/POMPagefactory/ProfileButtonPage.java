package POMPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileButtonPage
{
	
	@FindBy(xpath = "//span[text()=' My profile ']") private WebElement profileBtn;

	public ProfileButtonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickProfileButtonPageprofileBtn()
	{
		profileBtn.click();
	}
}
