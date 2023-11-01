package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_WET_Granulation extends Mainpageclass{
	@Test
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "username",j);
		String password = xls.getCellData("Credentials", "PasswordApprover",j);
		String passwordpin = xls.getCellData("Credentials", "PasswordApprover", j);
		String pin = xls.getCellData("Credentials","pin",j);
		Login(login,password);	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);
		
		int RowCount = xls.getRowCount("Template Creation");
		System.out.println(RowCount);
		for(int i=2;i<=2;i++) {
		String Mpr = xls.getCellData("Template Creation", "MprNoWG", i);
		String Materialcode = xls.getCellData("Template Creation", "Materialcode", i);
		String LOTNumber = xls.getCellData("Template Creation", "LOTNumber", i);
		String EqipNo = xls.getCellData("Template Creation", "EqipNo", i);
		String EquipName = xls.getCellData("Template Creation", "EquipName", i);
		String SOP = xls.getCellData("Template Creation","SOP" , i);
		String Less = xls.getCellData("Template Creation", "Percentageless", i);
	    String More = xls.getCellData("Template Creation", "PercentageMore", i);
	    String containerno = xls.getCellData("Template Creation","containerno" , i);
	    		
		
		
		driver.findElement(By.xpath("//*[contains (text(),'Wet Granulation')]")).click();Thread.sleep(200);
		driver.findElement(By.xpath("( //*[contains (text(),' Granulation')])[3]")).click();Thread.sleep(200);
    	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(200);

		driver.findElement(By.xpath("//*[@formcontrolname='mprNo']")).sendKeys(Mpr);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-angle-down float-right']")).click();Thread.sleep(2000);
		System.out.println("user clicked on material verificatio");
		
		
		driver.findElement(By.xpath("//*[@formcontrolname='materialCodeId']")).sendKeys(Materialcode);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='containerNo']")).sendKeys(containerno);Thread.sleep(200);
		driver.findElement(By.xpath("//*[@formcontrolname='lotNo']")).sendKeys(LOTNumber);Thread.sleep(2000);
		
	
		
		driver.findElement(By.xpath("//*[contains (text(),'Purified Water Dispensing')]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Purified Water Dispensing");
		
		
		driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[8]")).sendKeys(Materialcode);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[10]")).sendKeys(LOTNumber);Thread.sleep(200);
		
		
		
		driver.findElement(By.xpath("//*[contains (text(),'Sifting Instructions')]")).click();Thread.sleep(2000);
		System.out.println("user clicked on  Sifting Instructions");
		scrollPagedown();
		driver.findElement(By.xpath("//*[contains (text(),'Line Clearance for Sifting ')]")).click();Thread.sleep(2000);
		System.out.println("user clicked on  Line Clearance for Sifting");
			
		driver.findElement(By.xpath("//*[contains (text(),'Sieve Integrity Test ')]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='Sievint']/div/div/table/tbody/tr/td[1]/select")).click();Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='Sievint']/div/div/table/tbody/tr/td[1]/select")).sendKeys("eqip");Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[contains (text(),'Sifting Activity ')]")).click();Thread.sleep(2000);
		System.out.println("user clicked on  Sifting Activity ");
		
		
		driver.findElement(By.xpath("//*[contains (text(),'Screen Integrity ')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-tc-wet-granulation[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]")).click();

		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-tc-wet-granulation[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]")).sendKeys(EquipName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-tc-wet-granulation[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/select[1]")).click();

		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-tc-wet-granulation[1]/section[1]/div[1]/div[2]/div[6]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/select[1]")).sendKeys(EquipName);
		Thread.sleep(2000);
		
	
		
		driver.findElement(By.xpath("//*[contains (text(),'Filter Integrity Test ')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dropdown-btn']")).click();Thread.sleep(2000);
		System.out.println("user clicked on  Filter Integrity ");

		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys(SOP);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'SOP-231')])[1]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='dropdown-multiselect__caret']")).click();Thread.sleep(2000);
		
		
        driver.findElement(By.xpath("//*[contains(text(),'Granualtion Instructions ')]")).click();Thread.sleep(2000);
		System.out.println("user clicked  Granualtion Instructions");
		
		driver.findElement(By.xpath("//*[contains(text(),'Line Clearance for Granulation ')]")).click();Thread.sleep(2000);
		System.out.println("user clicked Line Clearance for Granulation");

		driver.findElement(By.xpath("//*[contains(text(),'Granulation Activity ')]")).click();Thread.sleep(2000);
		System.out.println("user clicked Granulation Activity ");

		driver.findElement(By.xpath("//*[@formcontrolname='granulationActivitylotNo']")).sendKeys(LOTNumber);Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//*[contains (text(),'Yield and Reconciliation')]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@formcontrolname='yieldLessthan']")).sendKeys(Less);Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@formcontrolname='yieldMoreThan']")).sendKeys(More);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='reconciliationLessthan']")).sendKeys(Less);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='reconciliationMoreThan']")).sendKeys(More);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[213]")).sendKeys(Materialcode);Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[contains (text(),'Result of Lubrication Blend')]")).click();Thread.sleep(2000);

		SYPSO( pin, passwordpin );

		
		driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
		UYSPS();
		
		
}

}}}


