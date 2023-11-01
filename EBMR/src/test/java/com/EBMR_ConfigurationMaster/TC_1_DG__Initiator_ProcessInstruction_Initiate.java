package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG__Initiator_ProcessInstruction_Initiate extends Mainpageclass {
	@Test

	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "PasswordApprover", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);

		int RowCount = xls.getRowCount("Process Instruction");
		System.out.println(RowCount);
		for (int i=4;i <=4; i++)

		{
			String Name = xls.getCellData("Process Instruction", "mprNo ",i);
			String stage = xls.getCellData("Process Instruction", "stage ",i);
			String instructions = xls.getCellData("Process Instruction", "processInstruction ",i);
			String points = xls.getCellData("Process Instruction", "points ",i);
			String processPoint = xls.getCellData("Process Instruction", "processPoint ",i);
		    String processtitle= xls.getCellData("Process Instruction", "processtitledropdown", i);

			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(200);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(200);
			System.out.println("User Clicked Configuration Masters ");	
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(200);
			System.out.println("User Clicked DG ");	
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys("process Instruction");
			Thread.sleep(2000);
			System.out.println("User Clicked select");			
			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("UserKeys of productName");
			driver.findElement(By.xpath("//*[@formcontrolname='stage']")).sendKeys(stage);Thread.sleep(2000);
			System.out.println("UserKeys of stage");
			driver.findElement(By.xpath("//*[@formcontrolname='processInstructionsTitle']")).sendKeys(processtitle);
			Thread.sleep(2000);
			driver.findElement(By.xpath(" //*[contains (text(),'Add Points')]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
	     	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);

 			driver.findElement(By.xpath("//*[@formcontrolname='processInstruction']")).sendKeys(instructions);
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");	
			driver.findElement(By.xpath("//*[@formcontrolname='processInstructionSubPoint']")).sendKeys(points);
			Thread.sleep(2000);
			System.out.println("UserKeys of process instruction subpoint");
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='processInstruction']")).sendKeys(instructions);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");//VALIDATION
			driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='processPoint']")).sendKeys(processPoint);Thread.sleep(2000);
			System.out.println("UserKeys of process point");
			driver.findElement(By.xpath("(// *[contains (text(),'Add')])[4]")).click();
			driver.findElement(By.xpath("//*[@formcontrolname='processPoint']")).sendKeys(processPoint);Thread.sleep(2000);
			System.out.println("UserKeys of process point");
			driver.findElement(By.xpath("(// *[contains (text(),'Add')])[4]")).click();//VALIDATION
			driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
			Thread.sleep(2000);
			SYO( pin, passwordpin );
			driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();Thread.sleep(2000);		
}
}}
}