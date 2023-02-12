import java.io.*;
import java.util.Scanner;
class CsvFile{
    public static void main(String[] args)
  {
     String line=null;
	 int TotalTxn=0;
     int TotalBillAmount=0;
     float maximum=0;
	 float minimum=99999;
     try   
	{  
	  BufferedReader buffrd = new BufferedReader(new FileReader("datanotepad.csv"));  
        while ((line = buffrd.readLine()) != null)   
        {  
	    	String[] TransactionID = line.split(",");  
	    	TotalBillAmount+=Float.parseFloat(TransactionID[3]);
	    	TotalTxn++;
		if(Float.parseFloat(TransactionID[3])>maximum)
		{
			maximum=Float.parseFloat(TransactionID[3]);
		}
		if(Float.parseFloat(TransactionID[3])<minimum)
		{
			minimum=Float.parseFloat(TransactionID[3]);
		}

	   }  
	}   
	catch (IOException e)   
	{  
		e.printStackTrace();  
	}  
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter your any one Option from below");
    System.out.println("1.Total No.of Txns: ");
	System.out.println("2.Total BillAmount: ");
	System.out.println("3.Maximum BillAmount: ");
	System.out.println("4.Minimum BillAmount");
	int N=scr.nextInt();
	scr.close();
	if(N==1)
	{
		System.out.println("Total no.of Txns: "+TotalTxn);
	}
	if(N==2)
	{
		System.out.println("Total BillAmount: "+TotalBillAmount);
	}
	if(N==3)
	{
		System.out.println("Maximum BillAmount: "+maximum);
	}
	if(N==4)
	{
		System.out.println("Minimum BillAmount: "+minimum);
	}
  }
}
