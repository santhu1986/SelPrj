package scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Testng 
{
public static WebDriver driver;
//public static String Expval,Actval;
//public static Properties PR;
//public static FileInputStream Fis;

     @Test(priority=0)
     public void OpenGoogle() throws IOException
	{
	//	PR=new Properties();
		//Fis=new FileInputStream("E:\\EveningBatch\\Selenium\\src\\scripts\\Rep.properties");
		//PR.load(Fis);
		//Expval="Sign in";
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Sleeper.sleepTightInSeconds(3);
	//Actval=driver.findElement(By.id(PR.getProperty("Signin"))).getText();
	driver.findElement(By.linkText("Gmail")).click();
//	System.out.println(Actval);
	/*if (Expval.equalsIgnoreCase(Actval)) 
	{
	System.out.println("Google is launched");	
		//return "Pass";
	}
	else
	{
		System.out.println("Google is not opened");
		//return "Fail";
	}*/
	}
     @Test(priority=1)
    public void Glogin()
	{
	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("santhumiryala");
	driver.findElement(By.xpath(".//*[@id='next']")).click();
	}
	}
