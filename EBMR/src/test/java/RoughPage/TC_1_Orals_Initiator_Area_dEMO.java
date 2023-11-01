package RoughPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_1_Orals_Initiator_Area_dEMO extends Mainpageclass {
	@Test
	
	public void A() throws Exception{
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		int RowCount = xls.getRowCount("Sheet2");
		System.out.println(RowCount);
		for (int i=2;i <=4; i++)

		{
			String Name = xls.getCellData("Sheet2", "Areaedit", i);
			String DropdownSelection = xls.getCellData("Sheet2", "select", i);

	
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' Other Masters')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on Other Masters");
			driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked Radio Button Orals ");
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(DropdownSelection);
			driver.findElement(By.xpath("//*[@class='form-control']")).click();
			driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);	
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
		}
	}
}}



			
			