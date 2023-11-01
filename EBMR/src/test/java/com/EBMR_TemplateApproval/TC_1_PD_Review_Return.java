package com.EBMR_TemplateApproval;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_PD_Review_Return extends Mainpageclass {

	@Test
	public  void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
	
	driver.findElement(By.xpath("(//*[contains (text(),'01')])[3]")).click();Thread.sleep(2000);
	System.out.println("user clicked PD Reviewed");
	driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
	System.out.println("user clicked Comments");
	driver.findElement(By.xpath("")).click();Thread.sleep(20000);
	System.out.println("user clicked close comments");
	driver.findElement(By.xpath("")).click();Thread.sleep(2000);
	System.out.println("user clicked  MPRNO");
	scrollPagedown();Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains (text(),'Pending for PD Review')]")).click();Thread.sleep(2000);
	System.out.println("user clicked pending for PD Review ");
	driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys();Thread.sleep(2000);
	System.out.println("user send Comments");
	driver.findElement(By.xpath("")).click();Thread.sleep(2000);
	System.out.println("user clicked  Review");
	
	}
	}
}
