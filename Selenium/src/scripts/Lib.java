package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Lib
{
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties PR;
	public static FileInputStream Fis;
	
public String OpenGoogle() throws IOException
{
	PR=new Properties();
	Fis=new FileInputStream("E:\\EveningBatch\\Selenium\\src\\scripts\\Rep.properties");
	PR.load(Fis);
	Expval="Sign in";
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Sleeper.sleepTightInSeconds(3);
Actval=driver.findElement(By.id(PR.getProperty("Signin"))).getText();
driver.findElement(By.linkText(PR.getProperty("maillink"))).click();
System.out.println(Actval);
if (Expval.equalsIgnoreCase(Actval)) 
{
// System.out.println("Google is launched");	
	return "Pass";
}
else
{
	//System.out.println("Google is not opened");
	return "Fail";
}
}
public String Gmaillogin(String EN,String Epwd)
{
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.id(PR.getProperty("Uname"))).clear();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys(EN);
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(PR.getProperty("next"))).click();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.name(PR.getProperty("Pwd"))).sendKeys(Epwd);
	
//driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	Sleeper.sleepTightInSeconds(4);
	//driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	//driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
   WebDriver.Navigation move=driver.navigate();
    move.back();
    return "Pass";
}
}
