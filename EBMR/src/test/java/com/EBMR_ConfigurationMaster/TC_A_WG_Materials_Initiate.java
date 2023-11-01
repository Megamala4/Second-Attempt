package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_A_WG_Materials_Initiate extends Mainpageclass {

@Test
	
	public void A() throws Exception {
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
        
		Login(login,password);	
	driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
	
	int RowCount = xls.getRowCount("DG");
	System.out.println(RowCount);
	for (int i=2;i <=3; i++)

	{
		String Name = xls.getCellData("DG", "MateriaCode ",i);
		String code = xls.getCellData("DG", "MaterialName ",i);
		String CodeEdit = xls.getCellData("DG", "CodeEdit", i);
		String NameEdit = xls.getCellData("DG", "MateriaCodeEdit", i);
	
		
	driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
	System.out.println("User CLicked on MAster");

	driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(2000);
	System.out.println("User Clicked Configuration Masters ");
	
	driver.findElement(By.xpath("(//*[@name='nameTXT'])[2]")).click();Thread.sleep(2000);Thread.sleep(2000);
	System.out.println("User Clicked DG ");
	
	
	driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys("Material");Thread.sleep(2000);
	System.out.println("User Clicked select");
	

	driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();

	driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).sendKeys(Name);Thread.sleep(2000);
	System.out.println("UserKeys of Material code");
	driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();

	driver.findElement(By.xpath("//*[@formcontrolname='materialName']")).sendKeys(code);Thread.sleep(2000);
	System.out.println("UserKeys of MaterialName");
	
	
	CYPSO();

    driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).clear();Thread.sleep(2000);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).sendKeys(CodeEdit);Thread.sleep(2000);
    Thread.sleep(2000);
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
	




	}
}
}
}
