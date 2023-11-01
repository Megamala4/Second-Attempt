package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG_BatchFormula_ReInitiate extends Mainpageclass {

	@Test

	public void A() throws Exception{
		
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);

		int RowCount = xls.getRowCount("Batch Formula");
		System.out.println(RowCount);
		for (int i=4;i <=4; i++)

		{
			String Blending = xls.getCellData("Batch Formula", "Blending", i);
			String Dropdown = xls.getCellData("Batch Formula", "Dropdown", i);
			String comments = xls.getCellData("MRP", "comments", i);

			
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Configuration Masters ");
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(Dropdown);Thread.sleep(2000);
			System.out.println("User Clicked select");
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();
			driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[6]")).sendKeys(Blending);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='form-control mb-3 ng-untouched ng-pristine ng-valid']")).sendKeys(comments);Thread.sleep(2000);

			UYSPS();
			
	
}
	}
}}
