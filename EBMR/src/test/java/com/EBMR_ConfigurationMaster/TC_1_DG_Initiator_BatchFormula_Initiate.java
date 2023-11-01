package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG_Initiator_BatchFormula_Initiate extends Mainpageclass {
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
			String Blending = xls.getCellData("Batch Formula", "Blending", i);
			String Dropdown = xls.getCellData("Batch Formula", "Dropdown", i);
			String A = xls.getCellData("Batch Formula", "points",i);
		    String BlendingADD = xls.getCellData("Batch Formula", "AddBlending", i);
		    String matrialcode = xls.getCellData("Batch Formula", "Flimcoatingmaterial", i);
		    String condition = xls.getCellData("Batch Formula", "condition", i);
		    String UOM = xls.getCellData("Batch Formula", "UOM", i);
		    String Quantity = xls.getCellData("Batch Formula", "Quantity", i);

			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(200);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(200);
			System.out.println("User Clicked Configuration Masters ");
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(Dropdown);Thread.sleep(2000);
			System.out.println("User Clicked select");
			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type='number'])[2]")).sendKeys(A);Thread.sleep(2000);
			System.out.println("user entered note keys");
			driver.findElement(By.xpath("(//*[@type='number'])[5]")).sendKeys(A);Thread.sleep(2000);
			System.out.println("user entered note keys");
			driver.findElement(By.xpath("(//*[@type='number'])[6]")).sendKeys(A);Thread.sleep(2000);
			System.out.println("user entered note keys");
			driver.findElement(By.xpath("(//*[@type='number'])[7]")).sendKeys(A);Thread.sleep(2000);
			System.out.println("user entered note keys");
			driver.findElement(By.xpath("(//*[@type='number'])[8]")).sendKeys(A);Thread.sleep(2000);
			System.out.println("user entered note keys");	
			driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(Blending);Thread.sleep(2000);
			System.out.println("user entered Blending ");
			driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")).sendKeys(matrialcode);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='fa fa-plus'])[3]")).click();
			driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(matrialcode);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(BlendingADD);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type='text'])[13]")).sendKeys(condition);Thread.sleep(2000);
			System.out.println("user entered  condition ");
			driver.findElement(By.xpath("(//*[@type='text'])[14]")).sendKeys(condition);Thread.sleep(2000);
			System.out.println("user entered  condition ");
			driver.findElement(By.xpath("(//*[@type='text'])[15]")).sendKeys(condition);Thread.sleep(2000);
			System.out.println("user entered  condition ");
			driver.findElement(By.xpath("(//*[@type='text'])[16]")).sendKeys(condition);Thread.sleep(2000);
			System.out.println("user entered  condition ");
			driver.findElement(By.xpath("//*[@type='number']")).clear();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='number']")).sendKeys(Quantity);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type='number'])[2]")).sendKeys(Quantity);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type='number'])[4]")).sendKeys(Quantity);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type='number'])[6]")).sendKeys(Quantity);Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")).sendKeys(UOM);Thread.sleep(2000);
			System.out.println("user entered  UOM ");
			SYPSO( pin, passwordpin );
		}	
	}
	}
}


