package com.EBMR_OtherMasters;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_Orals_Initiator_Sop extends Mainpageclass {

@Test
	
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
        
		Login(login,password);	
	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		int RowCount = xls.getRowCount("Sop");
		System.out.println(RowCount);
		for(int i=3; i<=3; i++)
		{
			String Name = xls.getCellData("Sop", "sop", i);
			String Number = xls.getCellData("Sop", "sopnumber", i);
			String Edit = xls.getCellData("Sop","sopedit" , i);
			String search = xls.getCellData("Sop", "search", i);
			String NumberEdit = xls.getCellData("Sop", "sopnumberEdit", i);

			
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' Other Masters')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(search);Thread.sleep(2000);Thread.sleep(2000);
			Thread.sleep(2000);
			
//			scrollPagedown();
			
			driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
			//		    //Validation
		    driver.findElement(By.xpath("//*[@formcontrolname='sopName']")).sendKeys(Name);Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='sopNo']")).sendKeys(Number);Thread.sleep(2000);
			
			CYPSO();
		
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);	
			driver.findElement(By.xpath("//*[contains (text(),'Close')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='sopName']")).clear();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='sopName']")).sendKeys(Edit);Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@formcontrolname='sopNo']")).clear();Thread.sleep(2000);	 
			driver.findElement(By.xpath("//*[@formcontrolname='sopNo']")).sendKeys(NumberEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			UYSPS();

     		driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Edit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Close')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			UYSPS();
			driver.findElement(By.xpath("//*[@formcontrolname='sopName']")).sendKeys(Edit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='sopNo']")).sendKeys(NumberEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
			
			
			 driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();
			  Thread.sleep(2000);
		}
}
}}
			


			
			


			
		



