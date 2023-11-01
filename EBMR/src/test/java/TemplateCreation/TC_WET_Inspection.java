package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_WET_Inspection extends Mainpageclass {

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
		String Less = xls.getCellData("Template Creation", "Percentageless", i);
        String More = xls.getCellData("Template Creation", "PercentageMore", i);
		
		
		
		driver.findElement(By.xpath("//*[contains (text(),'Wet Granulation')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains (text(),' Inspection')])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='mprNumber_Id']")).sendKeys(Mpr);Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-angle-down float-right']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[3]")).click();Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[4]")).click();Thread.sleep(2000);
		System.out.println("user clicked Tablet Inspection Record");
		driver.findElement(By.xpath("//*[@class='dropdown-btn']")).click();Thread.sleep(2000);
		System.out.println("user entered Perform Tablet Inspection as per SOP No. ");
         driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("SOP");Thread.sleep(2000);
 		driver.findElement(By.xpath("(//*[contains (text(),'SOP-231')])[1]")).click();Thread.sleep(2000);
// 		driver.findElement(By.xpath("(//*[contains (text(),'SOP-54')])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dropdown-multiselect__caret']")).click();Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//*[@class='dropdown-btn'])[2]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@placeholder='Search'])[2]")).sendKeys("SOP-54");Thread.sleep(2000);
 		driver.findElement(By.xpath("(//*[contains (text(),'Sop-54')])[2]")).click();Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[5]")).click();Thread.sleep(2000);
		System.out.println("user clicked Yield and Reconciliation ");
		driver.findElement(By.xpath("//*[@formcontrolname='nmt']")).sendKeys("87");Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[6]")).click();Thread.sleep(2000);

		
        driver.findElement(By.xpath("//*[@formcontrolname='inspectionYieldLessThen']")).sendKeys(Less);Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='inspectionYieldMoreThen']")).sendKeys(More);Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='reconciliationLessThen']")).sendKeys(Less);Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='reconciliationMoreThen']")).sendKeys(More);Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='finalBatchLessThen']")).sendKeys(Less);Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@formcontrolname='finalBatchMoreThen']")).sendKeys(More);Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down float-right'])[7]")).click();Thread.sleep(2000);

		SYPSO( pin, passwordpin );
		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
//		UYSPS();

}}}}

