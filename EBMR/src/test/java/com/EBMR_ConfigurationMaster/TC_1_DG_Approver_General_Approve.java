package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG_Approver_General_Approve extends Mainpageclass {

	@Test

	public void A() throws Exception {
		Aprrover();
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("GeneralSafety");
		System.out.println(RowCount);
		for (int i=2;i <=2; i++)

		{
			
			String comments = xls.getCellData("MRP", "comments", i);
			String B = xls.getCellData("GeneralSafety", "Dropdown", i);
			
				driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
				System.out.println("User CLicked on MAster");

				driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(2000);
				System.out.println("User Clicked Configuration Masters ");
				
				driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);Thread.sleep(2000);
				System.out.println("User Clicked DG ");
				
				driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(B);Thread.sleep(2000);
				Thread.sleep(2000);Thread.sleep(2000);Thread.sleep(2000);
				System.out.println("User Clicked select");

				driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys(comments);Thread.sleep(2000);
				AYSO();

	}
		}

	}
			










