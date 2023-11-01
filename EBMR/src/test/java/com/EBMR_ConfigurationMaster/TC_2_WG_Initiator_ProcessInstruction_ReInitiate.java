package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_WG_Initiator_ProcessInstruction_ReInitiate extends Mainpageclass  {

	@Test

	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "Password", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(20);
		
		int RowCount = xls.getRowCount("Process Instruction");
		System.out.println(RowCount);
		for (int i=5;i <=5; i++)

		{
			String add = xls.getCellData("Process Instruction", "addInstructionpoints ",i);
			String search = xls.getCellData("Process Instruction", "SelectDropdown", i);
			String addpoints = xls.getCellData("Process Instruction", "Addsubpoint", i);
			String addprocessPoint = xls.getCellData("Process Instruction", "Addprocesspoints", i);



			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");

			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(20);
			System.out.println("User Clicked Configuration Masters ");
			
			driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(20);
			System.out.println("User Clicked DG ");
			
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(search);Thread.sleep(2000);
			System.out.println("User Clicked select");

			driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);


			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			
			driver.findElement(By.xpath(" //*[contains (text(),'Add Points')]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			driver.findElement(By.xpath("//*[@formcontrolname='processInstruction']")).sendKeys(add);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@formcontrolname='processInstructionSubPoint']")).sendKeys(addpoints);Thread.sleep(2000);
			System.out.println("UserKeys of process instruction subpoint");
			
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[3]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@formcontrolname='processPoint']")).sendKeys(addprocessPoint);Thread.sleep(2000);
			System.out.println("UserKeys of process point");
			driver.findElement(By.xpath("(// *[contains (text(),'Add')])[4]")).click();
			Thread.sleep(2000);

			SYPSO( pin, passwordpin );

		}
}
	}
}
		





