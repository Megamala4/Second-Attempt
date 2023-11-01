package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_DRY_ShiftingAndBlending extends Mainpageclass {

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
		String Mpr = xls.getCellData("Template Creation", "droplist", i);
		String LOT = xls.getCellData("Template Creation", "LOTNumber", i);
		String Qunatity = xls.getCellData("Template Creation", "Qunatity", i);
		String usd = xls.getCellData("Template Creation", "usd", i);
		String YeildLess = xls.getCellData("Template Creation", "YeildLess", i);
		String YeildMore = xls.getCellData("Template Creation", "YeildMore", i);
		String ReConciliationLess = xls.getCellData("Template Creation", "ReConciliationLess", i);
		String ReConciliationMore = xls.getCellData("Template Creation", "ReConciliationMore", i);
		String SeiveNumber = xls.getCellData("Template Creation", "SeiveNumber", i);

		driver.findElement(By.xpath("//*[contains (text(),'Dry Granulation')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath(" //*[contains (text(),' Sifting & Blending')]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys(Mpr);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-angle-down float-right font20']")).click();Thread.sleep(2000);
		
		System.out.println("user clicked on Material Verification");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[2]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Sifting Instructions");

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[3]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Line Clearance for Sifting");

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[4]")).click();Thread.sleep(2000);

		System.out.println("user clicked on Sieve Integrity Test");
		scrollPagedown();
		driver.findElement(By.xpath("//*[@class='ng-untouched ng-pristine ng-valid']")).sendKeys(SeiveNumber);Thread.sleep(2000);

		System.out.println("user clicked on Select dropdown");
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[5]")).click();Thread.sleep(2000);

		System.out.println("user clicked on Sifting Activity");
       
		driver.findElement(By.xpath("(//*[@type='text'])[40]")).sendKeys(LOT);Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[6]")).click();Thread.sleep(2000);
		
		System.out.println("user clicked on Blending Instructions");
        driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[7]")).click();Thread.sleep(2000);
		
		System.out.println("user clicked on Blending Instructions");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[8]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Line Clearance for Blending");
		scrollPagedown();
        driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[9]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Blending Activity");
       
		driver.findElement(By.xpath("(//*[@type='text'])[50]")).sendKeys(LOT);Thread.sleep(2000);
		
		System.out.println("user entered Lubrication Process Instructions");
		
		driver.findElement(By.xpath("(//*[@type='text'])[57]")).sendKeys(Qunatity);Thread.sleep(2000);
		System.out.println("user entered Qunatity");
		scrollPagedown();
		driver.findElement(By.xpath("//*[@id='usd']")).sendKeys(usd);Thread.sleep(2000);
		System.out.println("user entered usd");
         
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[10]")).click();Thread.sleep(2000);
		
		System.out.println("user clicked on Mass of Blend");

	
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right font20'])[11]")).click();
		Thread.sleep(2000);
		System.out.println("user clicked on Yield & Reconciliation");
		
		
		driver.findElement(By.xpath("//*[@formcontrolname='YeildLess']")).sendKeys(YeildLess);Thread.sleep(2000);
		
		System.out.println("user entered on YeildLess");
		
         driver.findElement(By.xpath("//*[@formcontrolname='YeildMore']")).sendKeys(YeildMore);Thread.sleep(2000);
		
		System.out.println("user entered on YeildMore");
		scrollPagedown();
		driver.findElement(By.xpath("//*[@formcontrolname='ReConciliationLess']")).sendKeys(ReConciliationLess);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='ReConciliationMore']")).sendKeys(ReConciliationMore);Thread.sleep(2000);
		SYO( pin, passwordpin );

		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
		scrollpageup();
		driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[@class='fa fa-plus'])[3]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@type='text'])[58]")).sendKeys(LOT);Thread.sleep(2000);
		
		UYSPS();
		
		
}}}}
