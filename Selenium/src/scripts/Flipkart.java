package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Flipkart {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
	  Sleeper.sleepTightInSeconds(6);
		 Actions act= new Actions(driver);
		 Sleeper.sleepTightInSeconds(6);
	     act.moveToElement(driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"))).build().perform();
	 Sleeper.sleepTightInSeconds(4);
	  driver.findElement(By.partialLinkText("Mi")).click();
	}

}
