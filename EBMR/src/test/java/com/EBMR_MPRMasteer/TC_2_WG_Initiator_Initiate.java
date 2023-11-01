package com.EBMR_MPRMasteer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_2_WG_Initiator_Initiate extends Mainpageclass {


	@Test

	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "Password", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("MRP");
		System.out.println(RowCount);
		for (int i=4;i <=5; i++)

		{
			String Number = xls.getCellData("MRP", "mprNo", i);
			String code = xls.getCellData("MRP", "Blendcode", i);
			String storagecondition = xls.getCellData("MRP", "storagecondition", i);
			String size = xls.getCellData("MRP", "Batchsize", i);
			String sizekg = xls.getCellData("MRP", "kg", i);
			String label = xls.getCellData("MRP", "labelclaim", i);
			String Ref = xls.getCellData("MRP", "Ref", i);
			String productid = xls.getCellData("MRP","ProductId",i);
			String market = xls.getCellData("MRP","market",i);
			String shelf = xls.getCellData("MRP","	Shelf",i);

			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' MPR Master')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked DG ");
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Number);Thread.sleep(2000);
			System.out.println("UserKeys of mprNo ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='blend_BulkCode']")).sendKeys(code);Thread.sleep(2000);
			System.out.println("userkeys of bulkcode ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='productName_Id']")).sendKeys(productid);Thread.sleep(2000);
			System.out.println("UserKeys of Id ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='storageConditions']")).sendKeys(storagecondition);Thread.sleep(2000);
			System.out.println("Userkeys of storageConditions ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='batchSizeNo']")).sendKeys(size);Thread.sleep(2000);
			System.out.println("Userkeys  batchsize ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='batchSizeKG']")).sendKeys(sizekg);Thread.sleep(2000);
			System.out.println("Userkeys of batchkg ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='market_Id']")).sendKeys(market);Thread.sleep(2000);Thread.sleep(2000);
			Thread.sleep(2000);
			System.out.println("Userkeys of marketid ");

			driver.findElement(By.xpath("//*[@formcontrolname='shelfLife_Id']")).sendKeys(shelf);Thread.sleep(2000);Thread.sleep(2000);
			Thread.sleep(2000);
			System.out.println("Userkeys of shelfLife ");

			driver.findElement(By.xpath("//*[@formcontrolname='labelClaim']")).sendKeys(label);Thread.sleep(2000);
			System.out.println("Userkeys of label");
			
			driver.findElement(By.xpath("//*[@formcontrolname='refMFCNo']")).sendKeys(Ref);Thread.sleep(2000);
			System.out.println("Userkeys of  cno ");
			
		    driver.findElement(By.xpath("//*[contains (text(),'Clear')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);

			
			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Number);Thread.sleep(2000);
			System.out.println("UserKeys of mprNo ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='blend_BulkCode']")).sendKeys(code);Thread.sleep(2000);
			System.out.println("userkeys of bulkcode ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='productName_Id']")).sendKeys(productid);Thread.sleep(2000);
			System.out.println("UserKeys of Id ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='storageConditions']")).sendKeys(storagecondition);Thread.sleep(2000);
			System.out.println("Userkeys of storageConditions ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='batchSizeNo']")).sendKeys(size);Thread.sleep(2000);
			System.out.println("Userkeys  batchsize ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='batchSizeKG']")).sendKeys(sizekg);Thread.sleep(2000);
			System.out.println("Userkeys of batchkg ");
			
			driver.findElement(By.xpath("//*[@formcontrolname='market_Id']")).sendKeys(market);Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("Userkeys of marketid ");

			driver.findElement(By.xpath("//*[@formcontrolname='shelfLife_Id']")).sendKeys(shelf);Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("Userkeys of shelfLife ");

			driver.findElement(By.xpath("//*[@formcontrolname='labelClaim']")).sendKeys(label);Thread.sleep(2000);
			System.out.println("Userkeys of label");
			
			driver.findElement(By.xpath("//*[@formcontrolname='refMFCNo']")).sendKeys(Ref);Thread.sleep(2000);
			System.out.println("Userkeys of  cno ");
			SYPSO( pin, passwordpin );
			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Number);Thread.sleep(2000);
			System.out.println("UserKeys of mprNo ");
			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).clear();Thread.sleep(2000);
			System.out.println("UserKeys of mprNo ");
			
			

}
}
}}





