package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_WET_Dispensing extends Mainpageclass {

	@Test
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "username",j);
		String password = xls.getCellData("Credentials", "PasswordApprover",j);
		String passwordpin = xls.getCellData("Credentials", "PasswordApprover", j);
		String pin = xls.getCellData("Credentials","pin",j);
		Login(login,password);	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("Template Creation");
		System.out.println(RowCount);
		for(int i=2;i<=2;i++) {
		String Mpr = xls.getCellData("Template Creation", "MprNoWG", i);
		String Quantity = xls.getCellData("Template Creation", "RequiredQuantity", i);
		String LOTNumber = xls.getCellData("Template Creation", "LOTNumber", i);	
		String Materialcode = xls.getCellData("Template Creation", "Materialcode", i);

		driver.findElement(By.xpath("//*[contains (text(),'Wet Granulation')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("( //*[contains (text(),'Dispensing')])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Mpr);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-angle-down float-right font20']")).click();Thread.sleep(2000);
		System.out.println("user clicked Dispensing Activity");
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[3]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")).sendKeys(Materialcode);Thread.sleep(2000);
		System.out.println("user entered 	Material Code");
	    driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys(Quantity);Thread.sleep(2000);
		System.out.println("user entered Required Qunatity");
	   driver.findElement(By.xpath("(//*[@type='text'])[6]")).sendKeys(LOTNumber);Thread.sleep(2000);	
	   driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")).sendKeys(Materialcode);Thread.sleep(2000);	
		System.out.println("user entered Inter Grnaular agent(Material Code)");
		
	   driver.findElement(By.xpath("(//*[@type='text'])[17]")).sendKeys(Quantity);Thread.sleep(2000);	
		System.out.println("user entered Required Qunatity");
		
	   driver.findElement(By.xpath("(//*[@type='text'])[19]")).sendKeys(LOTNumber);Thread.sleep(2000);	
		System.out.println("user entered LOT");
	   driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")).sendKeys(Materialcode);Thread.sleep(2000);	
		System.out.println("user entered  Grnaular agent(Material Code)");
	   driver.findElement(By.xpath("(//*[@type='text'])[28]")).sendKeys(Quantity);Thread.sleep(2000);
		System.out.println("user entered Required Qunatity");
	   driver.findElement(By.xpath("(//*[@type='text'])[30]")).sendKeys(LOTNumber);Thread.sleep(2000);	
		System.out.println("user entered LOT");
	   driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")).sendKeys(Materialcode);Thread.sleep(2000);	
		System.out.println("user entered Extra Grnaular agent(Material Code)");
	   driver.findElement(By.xpath("(//*[@type='text'])[39]")).sendKeys(Quantity);Thread.sleep(2000);	
		System.out.println("user entered Required Qunatity");
	   driver.findElement(By.xpath("(//*[@type='text'])[41]")).sendKeys(LOTNumber);Thread.sleep(2000);	
		System.out.println("user entered LOT");
	   driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")).sendKeys(Materialcode);Thread.sleep(2000);
		System.out.println("user entered Flim coating(Material code)");
	   driver.findElement(By.xpath("(//*[@type='text'])[50]")).sendKeys(Quantity);Thread.sleep(2000);	
		System.out.println("user entered Required Qunatity");
	   driver.findElement(By.xpath("(//*[@type='text'])[52]")).sendKeys(LOTNumber);Thread.sleep(2000);	
		System.out.println("user entered LOT");
//
		SYPSO( pin, passwordpin );

		driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-plus'])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//* [contains (text(),'Add row')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[5]")).sendKeys(Materialcode);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[16]")).sendKeys(Quantity);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[19]")).sendKeys(LOTNumber);Thread.sleep(2000);		
		UYSPS() ;
		
		
		
		
		
		
		
		
		

}}}}
