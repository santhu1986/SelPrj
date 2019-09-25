package scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NG 
{
	Lib LB=new Lib();
@Test	
public void Google() throws IOException
{
	LB.OpenGoogle();
}
@Test(dataProvider="Gdata")
public void Login(String Gname,String Gpwd)
{
	LB.Gmaillogin(Gname,Gpwd);
}

@DataProvider

public Object[][] Gdata()
{
	Object[][] Obj=new Object[3][2];
	
	Obj[0][0]="testmindq";
	Obj[0][1]="mindqsystems";

	Obj[1][0]="selenium";
	Obj[1][1]="mindqsystems12";

	Obj[2][0]="sunil.beemanathi";
	Obj[2][1]="mindqsystems";

	return Obj;
}



}
