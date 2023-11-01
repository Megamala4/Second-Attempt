package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_DRY_Coating extends Mainpageclass {

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
		String Mpr = xls.getCellData("Template Creation", "droplist", i);
		String UOM = xls.getCellData("Template Creation", "UOM", i);
        String LOT = xls.getCellData("Template Creation", "LOT", i);
        String Less = xls.getCellData("Template Creation", "Percentageless", i);
        String More = xls.getCellData("Template Creation", "PercentageMore", i);
		String Frequnency = xls.getCellData("Template Creation", "Frequnency", i);	


		driver.findElement(By.xpath("//*[contains (text(),'Dry Granulation')]")).click();Thread.sleep(200);
		driver.findElement(By.xpath("//*[contains (text(),'Coating')]")).click();Thread.sleep(200);
		driver.findElement(By.xpath("//*[@formcontrolname='mprNoId']")).sendKeys(Mpr);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-angle-down float-right']")).click();Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@type='number']")).sendKeys();Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[3]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[4]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[5]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[6]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[7]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button [contains (text(),'Add')])[2]")).click();Thread.sleep(2000);
		scrollpageup();
        driver.findElement(By.xpath("//*[@placeholder='Enter LOT']")).sendKeys(LOT);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[36]")).sendKeys(Frequnency);Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@placeholder='UOM']")).sendKeys(UOM);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@placeholder='UOM'])[2]")).sendKeys(UOM);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@placeholder='UOM'])[3]")).sendKeys(UOM);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@placeholder='UOM'])[4]")).sendKeys(UOM);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[8]")).click();Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[9]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@formcontrolname='coatingYieldLessThen']")).sendKeys(Less);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='coatingYieldMoreThen']")).sendKeys("1");Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='coatingYieldMoreThen']")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='coatingYieldMoreThen']")).sendKeys(More);Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@formcontrolname='reconciliationLessThen']")).sendKeys(Less);Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='reconciliationMoreThen']")).sendKeys("1");Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='reconciliationMoreThen']")).clear();Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@formcontrolname='reconciliationMoreThen']")).sendKeys(More);Thread.sleep(2000);


		SYO( pin, passwordpin );
		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);

		UYSPS();
}}}}
