package com.EBMR_BatchRecord_NegativeFlow;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_B_PD_Initiator_Return extends Mainpageclass {

	@Test
	public  void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);
		
		
		driver.findElement(By.xpath("(//*[contains (text(),'05')])[2]")).click();Thread.sleep(2000);
		System.out.println("user clicked PD Initaitor");
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();Thread.sleep(2000);
		System.out.println("user clicked  Initaitor");
		driver.findElement(By.xpath("//*[@class='fa fa-comment']")).click();Thread.sleep(2000);
		System.out.println("user clicked comments");
		driver.findElement(By.xpath("")).click();Thread.sleep(2000);
		System.out.println("user clicked close comments");
		driver.findElement(By.xpath("(//*[@class='fa fa-eye'])[7]")).sendKeys();Thread.sleep(2000);
		System.out.println("user clicked  view");
		scrollPagedown();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Pending for Batch Record ReInitiation')]")).sendKeys();Thread.sleep(2000);
		System.out.println("user clicked  ReInitiate");
		driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys();Thread.sleep(2000);
		System.out.println("user keys Comments");
		driver.findElement(By.xpath("//*[contains (text(),'ReInitiate')]")).click();Thread.sleep(2000);
		System.out.println("user clcicked ReInitiate");
		
	}

}}
