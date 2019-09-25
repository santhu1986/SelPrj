package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gmail 
{
@FindBy (id="Email")
WebElement EID;

@FindBy (id="next")
WebElement Next;

public void login()
{
	EID.sendKeys("santhumiryala");
	Next.click();
}
}
