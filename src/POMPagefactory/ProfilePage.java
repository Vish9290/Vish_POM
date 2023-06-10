package POMPagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	@FindBy(xpath = "//input[@name='personName']") private WebElement Getname;
	WebDriver driver1;
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1 = driver;
	}
	
	public void SwitchToProgilePage()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}

	public void GetProfilePageGetname()
	{

		String ActString = Getname.getAttribute("value");
		String Expstr = "Vishal Bande";
		
		if(ActString.equals(Expstr))
		{
			System.out.println("TC Passed");
		}
		
		else
		{
			System.out.println("TC Failed");
		}
	}
}
