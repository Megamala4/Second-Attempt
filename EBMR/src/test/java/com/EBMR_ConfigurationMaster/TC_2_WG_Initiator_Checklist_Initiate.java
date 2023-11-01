package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_WG_Initiator_Checklist_Initiate extends Mainpageclass {

@Test
	
	public void A() throws Exception {
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
		String passwordpin = xls.getCellData("Credentials", "Password", j);
		String pin = xls.getCellData("Credentials","pin",j);
		Login(login,password);	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);

		int RowCount = xls.getRowCount("ckecklist");
		System.out.println(RowCount);
		for (int i=5;i <=6; i++)

		{
			String Name = xls.getCellData("ckecklist", "mprNo ",i);
			String stage = xls.getCellData("ckecklist", "stage ",i);
			String checklistpoint = xls.getCellData("ckecklist", "checklistPoints ",i);
			String A = xls.getCellData("ckecklist", "Dropdown", i);
	
			
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(200);
			System.out.println("User CLicked on MAster");

			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(200);
			System.out.println("User Clicked Configuration Masters ");
			
			driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(A);Thread.sleep(2000);
			System.out.println("User Clicked select");
					
			driver.findElement(By.xpath("//*[@formcontrolname='mprno']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("UserKeys of productName");
			
			driver.findElement(By.xpath("//*[@formcontrolname='stage']")).sendKeys(stage);Thread.sleep(2000);
			System.out.println("UserKeys of stage");
			driver.findElement(By.xpath(" //*[contains (text(),'Add Points')]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");	
	     	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
	 	    driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='checklistPoints']")).sendKeys(checklistpoint);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='checklistPoints']")).sendKeys(checklistpoint);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			SYPSO( pin, passwordpin );
			driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();Thread.sleep(2000);

}
}
}}


			

		

