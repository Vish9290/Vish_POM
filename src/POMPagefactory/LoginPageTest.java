package POMPagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		SiginPage sign = new SiginPage(driver);
		sign.ClickOnSignIn();
		
		Thread.sleep(2000);
		
		MobileNumPage enterNum = new MobileNumPage(driver);
		enterNum.EneterNumber();
		enterNum.ClickSignINPwd();
		Thread.sleep(2000);
		
		PasswordPage pwd = new PasswordPage(driver);
		pwd.EneterPWD();
		pwd.ClickPwdbtn();
		Thread.sleep(2000);
		
		AccountPage accpage = new AccountPage(driver);
		accpage.DropDownAccountPageMoveToMyacc();
		Thread.sleep(2000);
		
		ProfileButtonPage profilebtn = new ProfileButtonPage(driver);
		profilebtn.ClickProfileButtonPageprofileBtn();
		Thread.sleep(2000);
		
		ProfilePage proPage = new ProfilePage(driver);
		proPage.SwitchToProgilePage();
		Thread.sleep(2000);
		proPage.GetProfilePageGetname();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
