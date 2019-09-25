package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grid 
{
	DesiredCapabilities cap;
	@Parameters("browser")
	@Test
  public void gridexe(String Br) throws MalformedURLException
  {
		if (Br.equalsIgnoreCase("firefox")) 
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (Br.equalsIgnoreCase("chrome"))
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			
		}
			
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.122:4444/wd/hub"),cap);
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	String Til=driver.getTitle();
	System.out.println(Til);
	driver.findElement(By.partialLinkText("Gm")).click();
	
	
  }
}
