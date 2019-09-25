package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GMexe 
{
	@Test
public void Google()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	GP Googlep=PageFactory.initElements(driver,GP.class);
	Googlep.sign();
    Googlep.Google();
    Gmail GM=PageFactory.initElements(driver,Gmail.class);
    GM.login();
    
    
}
}
