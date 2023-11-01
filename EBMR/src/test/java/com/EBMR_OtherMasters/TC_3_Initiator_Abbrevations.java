package com.EBMR_OtherMasters;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_3_Initiator_Abbrevations extends Mainpageclass {
@Test
	
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
        
		Login(login,password);	
	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		int RowCount = xls.getRowCount("Sop");
		System.out.println(RowCount);
		for(int i=2; i<=3; i++)
		{
			String Name = xls.getCellData("Sop", "shortdescrption", i);
			String Number = xls.getCellData("Sop", "longdescrption", i);
			String Edit = xls.getCellData("Sop","shortdescrptionedit" , i);
			String NumberEdit = xls.getCellData("Sop", "longdescrptionEdit", i);
			String search = xls.getCellData("Sop", "select", i);

			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' Other Masters')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(search);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
			System.out.println("User click create ");
	    //Validation 
		    driver.findElement(By.xpath("//*[@formcontrolname='shortDescription']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("User keys shortDescription ");
			driver.findElement(By.xpath("//*[@formcontrolname='longDescription']")).sendKeys(Number);Thread.sleep(2000);
			System.out.println("User keys longDescription");
			
			CYPSO();
			driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);	
			driver.findElement(By.xpath("//*[contains (text(),'Close')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='longDescription']")).clear();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='longDescription']")).sendKeys(NumberEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='shortDescription']")).clear();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='shortDescription']")).sendKeys(Edit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			System.out.println("Disable sucessfully");
			UYSPS();

			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Close')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			System.out.println("Enable sucessfully");
			UYSPS();
//Already exists
			driver.findElement(By.xpath("//*[@formcontrolname='shortDescription']")).sendKeys(Edit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='longDescription']")).sendKeys(NumberEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);

		}
}}
}
			

	


