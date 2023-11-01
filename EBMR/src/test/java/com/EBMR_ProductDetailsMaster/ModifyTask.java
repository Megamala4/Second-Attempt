 package com.EBMR_ProductDetailsMaster;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.page.Ebmr_Xpaths;

import Baseclass.Mainpageclass;

public class ModifyTask extends Mainpageclass  {
public Ebmr_Xpaths ebmr;

	@Test

	public void A() throws Exception {
		Ebmr_Xpaths ebmr=new Ebmr_Xpaths(driver);
		
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "Password", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
			
			ebmr.purple();
			ebmr.Master();
//		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);Thread.sleep(2000);
//		System.out.println("User CLicked on MAster");
//		
		int RowCount = xls.getRowCount("PD&WG");
		System.out.println(RowCount);
		for (int i=2;i <=2; i++)

		{
			String Name = xls.getCellData("PD&WG", "Productname" ,i);
			String Prefix = xls.getCellData("PD&WG", "Prefix", i);
			String strength = xls.getCellData("PD&WG", "strength", i);
			String code = xls.getCellData("PD&WG", "Strengthcode", i);
			String strengthcode = xls.getCellData("PD&WG", "code", i);
			String NameEdit = xls.getCellData("PD&WG","Productedit" , i);
			String PrefixEdit = xls.getCellData("PD&WG", "PrefixEdit", i);
			String strengthEdit = xls.getCellData("PD&WG","strengthEdit",i);
			String codeEdit = xls.getCellData("PD&WG", "StrengthcodeEdit", i);
	
//			
		ebmr.ProductDetails();
		ebmr.DRYRadioButton();
//		ebmr.ProductName(Name);	
//		ebmr.Prefix(Prefix);
//		ebmr.strength(strengthEdit);
//		ebmr.strengthCode(code,strengthcode);		
//		SYPSO( pin, passwordpin );
			
			
			
			// TIll here only
//			driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Name);Thread.sleep(2000);
//			System.out.println("User clicked search  ");
//		    driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
//			System.out.println("User clicked Action   ");
//		    driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
//			System.out.println("User clicked Update  ");
//			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);
//			System.out.println("User clicked  code ");
//		    driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
//		    System.out.println("Userclicked Action  ");
		    
//		    ebmr.Search(Name);
		    ebmr.FFPAction1();
		    ebmr.UpdateOk();
		    ebmr.ProductName(NameEdit);	
		    ebmr.Prefix(PrefixEdit);
			ebmr.strength(strength);
			ebmr.strengthCode(code,codeEdit);
			
			System.out.println("User keys Product name ");
			driver.findElement(By.xpath("//*[@formcontrolname='prefix']")).clear();Thread.sleep(2000);
			System.out.println("User clear code ");
			driver.findElement(By.xpath("//*[@formcontrolname='prefix']")).sendKeys(PrefixEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='strength']")).clear();Thread.sleep(2000);
			System.out.println("User clear code ");
			driver.findElement(By.xpath("//*[@formcontrolname='strength']")).sendKeys(strengthEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='strengthCode']")).clear();Thread.sleep(2000);
			System.out.println("User clear code ");
			driver.findElement(By.xpath("//*[@formcontrolname='strengthCode']")).sendKeys(codeEdit);Thread.sleep(2000);
			UYSPS();
			    driver.findElement(By.xpath("//*[@formcontrolname='productName']")).sendKeys(NameEdit);Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@formcontrolname='prefix']")).sendKeys(PrefixEdit);Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@formcontrolname='strength']")).sendKeys(strengthEdit);Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@formcontrolname='strengthCode']")).sendKeys(codeEdit);Thread.sleep(2000);
		     	driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);

			
//			 driver.findElement(By.xpath(" //*[contains (text(),'Template')]")).click();
//			 driver.findElement(By.xpath(" //*[contains (text(),'Bulk Upload')]")).click();
////		      Thread.sleep(3000);
		   	
//			 UploadFile("C:\\Users\\megamala.burra\\Downloads\\ProductDetailsMaster");	
//			 Thread.sleep(2000);//FILL DATA
//			 System.out.println("User clicked  code ");
//			 driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(20000);
//		  
			  //Re_Uploading File 
//			 driver.findElement(By.xpath(" //*[contains (text(),'Template')]")).click();Thread.sleep(20000);Thread.sleep(20000);
//	    	 AttachFile();
//			 
//			 driver.findElement(By.xpath(" //*[contains (text(),'Bulk Upload')]")).click();
//		      Thread.sleep(3000);
//		      
//		      UploadFile("D:\\OneDrive - Audree Infotech Pvt Ltd\\Bulk Upload eBMR");
//		      Thread.sleep(1000);//Incomplete Data
//		      driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
//		      
//		      driver.findElement(By.xpath(" //*[contains (text(),'Template')]")).click();Thread.sleep(20000);Thread.sleep(20000);
//		    
//		      AttachFile(); 
//	   	     UploadFile("C:\\Users\\megamala.burra\\Downloads\\ProductDetailsMaster");
//	   	     Thread.sleep(1000);//Saved Successfully
//		     Bulkupload();
//			     
//		     AttachFile(); 
//     	     UploadFile("C:\\Users\\megamala.burra\\Downloads\\ProductDetailsMaster");
//		     Thread.sleep(1000);//Already Exists
//		    driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();
			Thread.sleep(2000);
		}
	}
}
}


			
			
	