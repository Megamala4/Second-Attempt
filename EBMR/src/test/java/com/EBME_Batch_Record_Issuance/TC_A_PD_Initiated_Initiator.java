package com.EBME_Batch_Record_Issuance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_A_PD_Initiated_Initiator extends Mainpageclass {

	@Test()

	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(password,login);
		
		
		
	
		
		driver.findElement(By.xpath("(//*[contains (text(),'05')])[2]")).click();Thread.sleep(2000);
		System.out.println("user clicked PD Initaitor");
		System.out.println("user clicked PD Initaitor");
		System.out.println("user clicked PD Initaitor");
		driver.findElement(By.xpath("//*[@type='radio']")).click();Thread.sleep(2000);
		System.out.println("user clicked  Initaitor");
		driver.findElement(By.xpath("//*[contains (text(),'--select--')]")).sendKeys();Thread.sleep(2000);
		System.out.println("user select  MPRNO");
		driver.findElement(By.xpath("//*[contains (text(),'Get')]")).click();Thread.sleep(2000);
		System.out.println("user clicked  Get");
		driver.findElement(By.xpath("//*[@class='fa fa-comment']")).click();Thread.sleep(2000);
		System.out.println("user clicked comments");
		driver.findElement(By.xpath("")).click();Thread.sleep(2000);
		System.out.println("user clicked close comments");
		driver.findElement(By.xpath("")).sendKeys();Thread.sleep(2000);
		System.out.println("user clicked  MPRNO");
		scrollPagedown();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains (text(),'Initiate')])[3]")).sendKeys();Thread.sleep(2000);
		System.out.println("user clicked  Initiate");
		


}
}
}
