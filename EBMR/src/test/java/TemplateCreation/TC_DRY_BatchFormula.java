package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_DRY_BatchFormula extends Mainpageclass {
	@Test
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "login",j);
		String password = xls.getCellData("Credentials", "Password",j);
		String pin = xls.getCellData("Credentials","pin",j);
		Login(login,password);	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);
		
		int RowCount = xls.getRowCount("Template Creation");
		System.out.println(RowCount);
		for(int i=2;i<=2;i++) {
		String Mpr = xls.getCellData("Template Creation", "droplist", i);
		
		
		driver.findElement(By.xpath("//*[contains (text(),'Dry Granulation')]")).click();Thread.sleep(200);
		driver.findElement(By.xpath("//*[contains (text(),' BatchFormula')]")).click();Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Mpr);Thread.sleep(2000);
		SYO( pin, password );
		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);

	}
}
	}
	}