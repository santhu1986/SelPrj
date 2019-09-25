package scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Lib1 
{
		public static WebDriver driver;
		public static String Expval,Actval;
		
	public void Opengoogle(String Url) throws IOException
	{
		Expval="Google";
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		screenSnap(driver,"RFB27");
		
		
		/*Actval=driver.getTitle();
		driver.findElement(By.partialLinkText("Gmail")).click();
		screenSnap(driver,"gmail27");
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("google launched");
			return "pass";
		}
		else
		{
			System.out.println("google not launched");
			return "fail";
		}*/
	}
	  public void Gmail(String EN,String EP)
	  {
		  Sleeper.sleepTightInSeconds(4);
	       //driver.findElement(By.partialLinkText("Gmail")).click();
	       driver.findElement(By.id("Email")).clear();
	       driver.findElement(By.id("Email")).sendKeys(EN);
	       driver.findElement(By.xpath(".//*[@id='next']")).click();
	       Sleeper.sleepTightInSeconds(4);
	       driver.findElement(By.id("Passwd")).sendKeys(EP);
	      Sleeper.sleepTightInSeconds(4);
	      driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	       Sleeper.sleepTightInSeconds(4);
	       //driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	       
	       //Sleeper.sleepTightInSeconds(4);
	       //driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	      //WebDriver.Navigation move=driver.navigate();
	     // move.back();
	  }
	  public void Compgmail()
	  {
		  Sleeper.sleepTightInSeconds(4);
		  driver.findElement(By.xpath(".//*[@id=':3m']/div/div")).click();
		  Sleeper.sleepTightInSeconds(6);
		 // driver.findElement(By.id(":5o")).click();
	  }
	  public void Lout()
	  {
		  //Sleeper.sleepTightInSeconds(4);
	      driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	      
	      Sleeper.sleepTightInSeconds(4);
	      driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	    
	  }
	  public void screenSnap(WebDriver driver,String ScreenName) throws IOException {
	 		{		
	  			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  		    
	  			FileUtils.copyFile(src,new File("E:\\sai\\Ebank\\src\\com\\ebank\\result\\"+ScreenName+".jpg"));
	 		}
	  		}
	  public void getTit()
	  {
		  String GT=driver.getTitle();
		  System.out.println(GT);
	  }
	  public void Aclose()
	  {
		  driver.close();
	  }
	}
