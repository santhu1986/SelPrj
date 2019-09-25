package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	public static void main(String[] args) throws IOException 
	{
	Lib Lb=new Lib();
	Lb.OpenGoogle();
		FileInputStream Fis=new FileInputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\Gmail.xlsx");	
	
	//Work book
	
	XSSFWorkbook WB=new XSSFWorkbook(Fis);	
	
	//Sheet
	
	XSSFSheet WS=WB.getSheet("GmailData");
	
	//Row count
	int Rc=WS.getLastRowNum();
	
System.out.println(Rc);

//loop

for (int i =1; i<=Rc; i++) 
{
	//row
	XSSFRow WR=WS.getRow(i);
	//cell
	XSSFCell WC=WR.getCell(0);
	XSSFCell WC1=WR.getCell(1);
	XSSFCell WC2=WR.createCell(2);
	String Ename=WC.getStringCellValue();
	System.out.println(Ename);
	String Epw=WC1.getStringCellValue();
	System.out.println(Epw);
	String Res=Lb.Gmaillogin(Ename,Epw);
	WC2.setCellValue(Res);
}
FileOutputStream Fos=new FileOutputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\GmailRes.xlsx");
WB.write(Fos);
WB.close();

//get cell data
/*
//row
XSSFRow WR=WS.getRow(1);
//cell
XSSFCell WC=WR.getCell(1);
String Ename=WC.getStringCellValue();
System.out.println(Ename);
*/	}

}
