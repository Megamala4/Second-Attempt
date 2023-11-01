package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_WG_Initiator_BatchFormula_Initiate extends  Mainpageclass {

	@Test

	public void A() throws Exception{
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "PasswordApprover", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
	driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);

	int RowCount = xls.getRowCount("Batch Formula");
	System.out.println(RowCount);
	for (int i=4;i <=4; i++)

	{
		String Name = xls.getCellData("Batch Formula", "mprNo ",i);
		String Granular = xls.getCellData("Batch Formula", "Granular", i);
		String Dropdown = xls.getCellData("Batch Formula", "Dropdown", i);
		String A = xls.getCellData("Batch Formula", "points",i);
	    String GranulationAgent = xls.getCellData("Batch Formula", "GranulationAgent", i);
	    String ExtraGranulationAgent =xls.getCellData("Batch Formula", "ExtraGranulationAgent", i);
	    String FlimCoating = xls.getCellData("Batch Formula", "Flimcoating", i);
	    String condition = xls.getCellData("Batch Formula", "condition", i);
	    String UOM = xls.getCellData("Batch Formula", "UOM", i);
	    String Quantity = xls.getCellData("Batch Formula", "Quantity", i);


		driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(200);
		System.out.println("User CLicked on MAster");
		driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(200);
		System.out.println("User Clicked Configuration Masters ");
		driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(200);
		System.out.println("User Clicked DG ");
		driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(Dropdown);Thread.sleep(2000);
		System.out.println("User Clicked select");
		driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Name);Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@type='number'])[4]")).sendKeys(A);Thread.sleep(2000);
		System.out.println("user entered note keys");
		driver.findElement(By.xpath("(//*[@type='number'])[6]")).sendKeys(A);Thread.sleep(2000);
		System.out.println("user entered note keys");
		driver.findElement(By.xpath("(//*[@type='number'])[7]")).sendKeys(A);Thread.sleep(2000);
		System.out.println("user entered note keys");
		driver.findElement(By.xpath("(//*[@type='number'])[8]")).sendKeys(A);Thread.sleep(2000);
		System.out.println("user entered note keys");
		driver.findElement(By.xpath("(//*[@type='number'])[9]")).sendKeys(A);Thread.sleep(2000);
		System.out.println("user entered note keys");
		
		driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-plus'])[3]")).click();
		
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(Granular);Thread.sleep(2000);
		System.out.println("user entered Blending ");
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")).sendKeys(GranulationAgent);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[5]")).sendKeys(ExtraGranulationAgent);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[5]")).sendKeys(FlimCoating);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(Granular);Thread.sleep(2000);
		System.out.println("user entered Blending ");
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(ExtraGranulationAgent);Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@type='text'])[19]")).sendKeys(condition);Thread.sleep(2000);
		System.out.println("user entered  condition ");
		driver.findElement(By.xpath("(//*[@type='text'])[20]")).sendKeys(condition);Thread.sleep(2000);
		System.out.println("user entered  condition ");
		driver.findElement(By.xpath("(//*[@type='text'])[21]")).sendKeys(condition);Thread.sleep(2000);
		System.out.println("user entered  condition ");
		driver.findElement(By.xpath("(//*[@type='text'])[22]")).sendKeys(condition);Thread.sleep(2000);
		System.out.println("user entered  condition ");
		driver.findElement(By.xpath("(//*[@type='text'])[23]")).sendKeys(condition);Thread.sleep(2000);
		System.out.println("user entered  condition ");
		driver.findElement(By.xpath("(//*[@type='text'])[24]")).sendKeys(condition);Thread.sleep(2000);
		System.out.println("user entered  condition ");
		driver.findElement(By.xpath("//*[@type='number']")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys(Quantity);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[2]")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[2]")).sendKeys(Quantity);Thread.sleep(2000);	
		driver.findElement(By.xpath("(//*[@type='number'])[3]")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[3]")).sendKeys(Quantity);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[4]")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[4]")).sendKeys(Quantity);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[5]")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[5]")).sendKeys(Quantity);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[7]")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[7]")).sendKeys(Quantity);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(UOM);Thread.sleep(2000);
		System.out.println("user entered  UOM ");
		SYPSO( pin, passwordpin );
		

	}	
}
}
}





