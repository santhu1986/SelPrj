package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FirstSelProg {

	public static void main(String[] args) 
	{
	
		//Firefox driver
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//WebDriver.Navigation move=driver.navigate();
		driver.get("http://www.google.com");
	
		String id=driver.findElement(By.xpath(".//*[@id='gb_70']")).getTagName();
		System.out.println(id);
		//driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		driver.findElement(By.partialLinkText("Gmail")).click();
		driver.findElement(By.id("Email")).sendKeys("santhumiryala");
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.id("next")).click();
		//driver.findElement(By.id("Email")).clear();
		System.out.println(driver.getTitle());
		//move.back();
		//Sleeper.sleepTightInSeconds(3);
		//move.forward();
		//Sleeper.sleepTightInSeconds(4);
		//move.refresh();
		//driver.close();
		//maximise the firefox
		//driver.manage().window().maximize();
		//URL
		//driver.get("http://www.google.com");
		//clicking gmail link
		//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	   
	}

}
