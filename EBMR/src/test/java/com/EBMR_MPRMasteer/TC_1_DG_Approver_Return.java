package com.EBMR_MPRMasteer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG_Approver_Return extends Mainpageclass {

	@Test

	public void A() throws Exception {
		Aprrover();
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("MRP");
		System.out.println(RowCount);
		for (int i=3;i <=3;i++)

		{
			String comments = xls.getCellData("MRP", "comments", i);

			
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' MPR Master')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Return')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys(comments);Thread.sleep(2000);

			RYSO();


}
	}
}
		
