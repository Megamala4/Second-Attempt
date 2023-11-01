package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_WG_Initiator_Genereal_Initiate extends Mainpageclass {

@Test
	
	public void A() throws Exception {
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
		String passwordpin = xls.getCellData("Credentials", "Password", j);
		String pin = xls.getCellData("Credentials","pin",j);
		Login(login,password);	
	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);

		int RowCount = xls.getRowCount("GeneralSafety");
		System.out.println(RowCount);
		for (int i=5;i <=5; i++)

		{
			String B = xls.getCellData("GeneralSafety", "Dropdown", i);
			String Name = xls.getCellData("GeneralSafety", "mprNo ",i);
			String stage = xls.getCellData("GeneralSafety", "stage ",i);
			String title = xls.getCellData("GeneralSafety", "title ",i);
			String generalpoints = xls.getCellData("GeneralSafety","generalpoints" , i);

			
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(200);
			System.out.println("User CLicked on MAster");

			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(200);
			System.out.println("User Clicked Configuration Masters ");
			
			driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(200);
			System.out.println("User Clicked DG ");
			
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(B);Thread.sleep(2000);
			System.out.println("User Clicked select");
			
			driver.findElement(By.xpath("//*[@formcontrolname='mprNumber_Id']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("UserSendkeys MrpNo");
			
			driver.findElement(By.xpath("//*[@formcontrolname='stageId']")).sendKeys(stage);Thread.sleep(2000);
			System.out.println("UserSendkeys stage");

			driver.findElement(By.xpath("//*[@formcontrolname='generalAndSafetyPrecautionsTitle']")).sendKeys(title);Thread.sleep(2000);
			System.out.println("UserSendkeys general");
			driver.findElement(By.xpath("// *[contains (text(),' Add Points')]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
		 	driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@formcontrolname='generalSafetyPrecautionPoints']")).sendKeys(generalpoints);Thread.sleep(2000);
			System.out.println("UserSendkeys points ");

			driver.findElement(By.xpath("(//*[contains (text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			driver.findElement(By.xpath("//*[@formcontrolname='generalSafetyPrecautionPoints']")).sendKeys(generalpoints);Thread.sleep(2000);
			System.out.println("UserSendkeys points ");

			driver.findElement(By.xpath("(//*[contains (text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");//VALIDATION
			SYPSO( pin, passwordpin );
			
//			driver.findElement(By.xpath("//*[contains (text(),'Template')]")).click();Thread.sleep(2000);
//
//			driver.findElement(By.xpath("//*[contains (text(),'Bulk Upload')]")).click();Thread.sleep(2000);
//
			driver.findElement(By.xpath("//*[contains (text(),'Print')]")).click();Thread.sleep(2000);
//
//			
}}
}
}
