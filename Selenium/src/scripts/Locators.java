package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Locators 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.id("Email")).sendKeys("testmindq");
	driver.findElement(By.xpath(".//*[@id='next']")).click();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.name("Passwd")).sendKeys("mindqsystems");
	driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	Sleeper.sleepTightInSeconds(6);
	/*driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
*/	//driver.findElement(By.cssSelector("#u_0_1")).sendKeys("Mind Q");
    //driver.findElement(By.name("lastname")).sendKeys("Systems");
	}

}
