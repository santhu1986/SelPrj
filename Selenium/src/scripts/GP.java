package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GP 
{
@FindBy (xpath=".//*[@id='gbw']/div/div/div[1]/div[1]/a")
WebElement GLink;

@FindBy (id="gb_70")
WebElement signin;

public void Google()
{
	GLink.click();
}
public void sign()
{
	String Res=signin.getText();
	System.out.println(Res);

}
}
