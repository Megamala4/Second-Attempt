package com.EBME_Batch_Record_Issuance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_B_PD_Reviewed_Review extends Mainpageclass {

@Test
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
        
		Login(password,login);
	
	

		driver.findElement(By.xpath("(//*[contains (text(),'01')])[5]")).click();Thread.sleep(2000);
		System.out.println("user clicked PD Reviewed");
		driver.findElement(By.xpath("(//*[@type='radio'])[3]")).click();Thread.sleep(2000);
		System.out.println("user clicked  radiobutton");
		driver.findElement(By.xpath("//*[@class='fa fa-comments']")).click();Thread.sleep(2000);
		System.out.println("user clicked Comments");
		driver.findElement(By.xpath("")).click();Thread.sleep(20000);
		System.out.println("user clicked close comments");
		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
		System.out.println("user clicked view ");
		scrollPagedown();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-arrow-left']")).click();Thread.sleep(2000);
		System.out.println("user clicked Back");
		driver.findElement(By.xpath("(//*[@type='radio'])[3]")).click();Thread.sleep(2000);
		System.out.println("user clicked  radiobutton");
		driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys();Thread.sleep(2000);
		System.out.println("user send Comments");
		driver.findElement(By.xpath("(//*[contains (text(),'Release')])[4]")).click();Thread.sleep(2000);
		System.out.println("user clicked  Review");
		

		
	}

}
}
