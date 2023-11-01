package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_WET_BatchFormula extends Mainpageclass {

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
		String Assay = xls.getCellData("Template Creation", "Assaycalculation", i);
		String Theoritical = xls.getCellData("Template Creation", "Theoritical", i);
		
		String LOTNumber = xls.getCellData("Template Creation", "LOT", i);

		driver.findElement(By.xpath("//*[contains (text(),'Wet Granulation')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Batch Formula')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Mpr);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[21]")).sendKeys(Assay);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[5]")).sendKeys(Theoritical);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[23]")).sendKeys(LOTNumber);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[6]")).sendKeys(Theoritical);Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@type='text'])[32]")).sendKeys(Assay);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[7]")).sendKeys(Theoritical);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='number'])[8]")).sendKeys(Theoritical);Thread.sleep(2000);

		SYO( pin, passwordpin );
		

}}}}
