package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG__Initiator_Material extends Mainpageclass {
	@Test

	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);
		
		
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("DG");
		System.out.println(RowCount);
		for (int i=2;i<=3; i++)

		{
			String Name = xls.getCellData("DG", "MateriaCode ",i);
			String code = xls.getCellData("DG", "MaterialName ",i);
			String CodeEdit = xls.getCellData("DG", "CodeEdit", i);
			String NameEdit = xls.getCellData("DG", "MateriaCodeEdit", i);
		
		
		driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
		System.out.println("User CLicked on MAster");
		driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(2000);
		System.out.println("User Clicked Configuration Masters ");
		driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(2000);Thread.sleep(2000);
		System.out.println("User Clicked DG ");
		
		
		//*******************************************************************************************************
		Select selectBox = new Select(driver.findElement(By.xpath("WorkHard"))); 
		int selectOptions = selectBox.getOptions().size(); 
		selectBox.selectByIndex(selectOptions - 1);
		
		
		
		
		
		
		
		
		
		
		//**********************************************************************************************************
//		driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys("Material");Thread.sleep(2000);
//		System.out.println("User Clicked select");
		driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
		System.out.println("User Clicked create");
		
		
		
		driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).sendKeys(Name);Thread.sleep(2000);
		System.out.println("UserKeys of Material code");
		driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
		System.out.println("User Clicked create");
		driver.findElement(By.xpath("//*[@formcontrolname='materialName']")).sendKeys(code);Thread.sleep(2000);
		System.out.println("UserKeys of MaterialName");
		
		CYPSO();

	    driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
	    System.out.println("User Clicked Action");
	    driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).clear();Thread.sleep(2000);
		System.out.println("UserKeys updayed of Material code");
	    driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).sendKeys(CodeEdit);Thread.sleep(2000);
		System.out.println("UserKeys updayed of Material code");
		driver.findElement(By.xpath("//*[@formcontrolname='materialName']")).clear();Thread.sleep(2000);
		System.out.println("UserKeys updated of MaterialName");
		driver.findElement(By.xpath("//*[@formcontrolname='materialName']")).sendKeys(NameEdit);Thread.sleep(2000);
		System.out.println("UserKeys updated of MaterialName");
	    
		UYSPS();
		driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).sendKeys(CodeEdit);Thread.sleep(2000);
		System.out.println("UserKeys of Material code");
		driver.findElement(By.xpath("//*[@formcontrolname='materialName']")).sendKeys(NameEdit);Thread.sleep(2000);
		System.out.println("UserKeys of MaterialName");
		driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
		System.out.println("User Clicked create");
		driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click()
;	
//		driver.findElement(By.xpath("( //*[contains (text(),'Template')])[2]")).click();Thread.sleep(20000);Thread.sleep(20000);
//		Thread.sleep(2000);
//		
//		AttachFile();
//		 UploadFile("C:\\Users\\megamala.burra\\Downloads");//xlsx Upload		
//		  Thread.sleep(2000);Thread.sleep(2000);
//		//Viewing File For the First Time    
//
//		
		driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();Thread.sleep(2000);
}
}
}}
