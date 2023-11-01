package com.EBMR_MPRMasteer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_WG_Initiator_Re_Initiate extends Mainpageclass {

	@Test

	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
		
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("MRP");
		System.out.println(RowCount);
		for (int i=3;i <=3; i++)

		{
			String refMFCNo = xls.getCellData("MRP", "refMFCNoedit", i);
			String Market = xls.getCellData("MRP", "MarketEdit", i);

			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' MPR Master')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("(//*[@class='fa fa-pencil'])[2]")).click();Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains (text(),'Re-Initiate')]")).click();Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='refMFCNo']")).clear();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='refMFCNo']")).sendKeys(refMFCNo);Thread.sleep(2000);
			System.out.println("Userkeys of  cno ");
			driver.findElement(By.xpath("//*[@formcontrolname='market_Id']")).clear();Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='market_Id']")).sendKeys(Market);Thread.sleep(2000);
			UYSPS();

}
	}
}}
		






