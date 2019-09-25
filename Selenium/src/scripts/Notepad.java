package scripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
		Lib LB=new Lib();
		LB.OpenGoogle();
	String Fread="C:\\Users\\santhosh.santhosh-PC\\Desktop\\Login.txt";
	String Fres="C:\\Users\\santhosh.santhosh-PC\\Desktop\\LoginRes.txt";
	String SD;
	
	FileReader FR=new FileReader(Fread);
	BufferedReader BR=new BufferedReader(FR);
	String Sread=BR.readLine();
    System.out.println(Sread);
   
    FileWriter FW=new FileWriter(Fres);
    BufferedWriter BW=new BufferedWriter(FW);
    BW.write(Sread);
    BW.newLine();
    
    while((SD=BR.readLine())!=null)
    {
	System.out.println(SD);
	String SR[]=SD.split("###");
	String Un=SR[0];
	System.out.println(Un);
    String Pwd=SR[1];
    System.out.println(Pwd);
    String Res=LB.Gmaillogin(Un,Pwd);
    BW.write(Un+"%%%"+Pwd+"$$$"+Res);
    BW.newLine();
    }
    BW.close();
    BR.close();
	}
      
}
