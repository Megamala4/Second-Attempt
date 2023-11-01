package com.EBMR_TemplateApproval;

import org.openqa.selenium.By;

import Baseclass.Mainpageclass;

public class TC_4_QA_Approve_Return extends Mainpageclass {

	public void A() throws Exception{
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
		driver.findElement(By.xpath("//*[contains (text(),'03')]")).click();Thread.sleep(2000);
		System.out.println("user clicked QA Approver");
		driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
		System.out.println("user clicked Comments");
		driver.findElement(By.xpath("")).click();Thread.sleep(20000);
		System.out.println("user clicked close comments");
        driver.findElement(By.xpath("")).click();Thread.sleep(2000);
		System.out.println("user clicked  MPRNO");
		scrollPagedown();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Pending for QA Review')]")).click();Thread.sleep(2000);
		System.out.println("user clicked pending for PD Review ");
		driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys();Thread.sleep(2000);
		System.out.println("user send Comments");
		driver.findElement(By.xpath("")).click();Thread.sleep(2000);
		System.out.println("user clicked  Return");
		
	}

}}
