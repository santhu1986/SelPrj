package scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class base 
{
   Lib1 LB=new Lib1();  
  @BeforeTest
  public void beforeTest() 
  {
  LB.Gmail("testmindq","mindqsystems");
  }

  @AfterTest
  public void afterTest() 
  {
  LB.Lout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  LB.Opengoogle("http://www.google.com");
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Aclose();
  }

}
