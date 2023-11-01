package com.EBMR_ConfigurationMaster;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_DG_Initiator_Processparameters_Initiate extends Mainpageclass {
	@Test
	
	public void A() throws Exception {
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "Password", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);

		int RowCount = xls.getRowCount("procressparameter");
		System.out.println(RowCount);
		for (int i=4;i <=4; i++)

		{
			String Name = xls.getCellData("procressparameter", "mprNo ",i);
			String stage = xls.getCellData("procressparameter", "stage ",i);
			String title = xls.getCellData("procressparameter", "processParametersTitle", i);
			String parameters = xls.getCellData("procressparameter","parameter",i);
			String points = xls.getCellData("procressparameter","points",i);
			String Dropdown = xls.getCellData("procressparameter", "Dropdownselect", i);


			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(200);
			System.out.println("User CLicked on MAster");

			driver.findElement(By.xpath(" //*[contains (text(),'Configuration Masters')]")).click();Thread.sleep(200);
			System.out.println("User Clicked Configuration Masters ");
			
			driver.findElement(By.xpath("//*[@name='nameTXT']")).click();Thread.sleep(200);
			System.out.println("User Clicked DG ");
			
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(Dropdown);Thread.sleep(2000);
			
			System.out.println("User Clicked select");
					
			driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("UserKeys of productName");
			
			driver.findElement(By.xpath("//*[@formcontrolname='stage']")).sendKeys(stage);Thread.sleep(2000);
			System.out.println("UserKeys of stage");
			
			driver.findElement(By.xpath("//*[@formcontrolname='processParametersTitle']")).sendKeys(title);Thread.sleep(2000);
			
			
			driver.findElement(By.xpath(" //*[contains (text(),'Add Points')]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			driver.findElement(By.xpath("//*[@formcontrolname='parameter']")).sendKeys(parameters);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@formcontrolname='specification']")).sendKeys(points);Thread.sleep(2000);
			System.out.println("UserKeys of process instruction subpoint");
			
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			driver.findElement(By.xpath("//*[@formcontrolname='parameter']")).sendKeys(parameters);
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@formcontrolname='specification']")).sendKeys(points);Thread.sleep(2000);
			System.out.println("UserKeys of process instruction subpoint");
			
			driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]")).click();Thread.sleep(2000);
			System.out.println("User Clicked Add");
			
			SYPSO( pin, passwordpin );
			driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();Thread.sleep(2000);

}
}
}}
