package com.EBMR_TemplateApproval;

import org.openqa.selenium.By;

import Baseclass.Mainpageclass;

public class TC_5_PD_Initiator_Return extends Mainpageclass {

	public  void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
		
	
	driver.findElement(By.xpath("//*[contains (text(),'05')]")).click();Thread.sleep(2000);
	System.out.println("user clicked PD Initaitor");
	driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();Thread.sleep(2000);
	System.out.println("user clicked  Initaitor");
	driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
	System.out.println("user clicked Comments");
	driver.findElement(By.xpath("")).click();Thread.sleep(20000);
	System.out.println("user clicked close comments");
	driver.findElement(By.xpath("")).sendKeys();Thread.sleep(2000);
	System.out.println("user clicked  MPRNO");
	scrollPagedown();Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[contains (text(),'ReInitiate')]")).sendKeys();Thread.sleep(2000);
	System.out.println("user clicked ReInitiate");
	

	}

}}
