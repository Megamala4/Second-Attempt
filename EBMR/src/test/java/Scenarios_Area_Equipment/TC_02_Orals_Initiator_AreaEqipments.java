package Scenarios_Area_Equipment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_02_Orals_Initiator_AreaEqipments extends Mainpageclass {
	@Test

	public void A() throws Exception{
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
			String passwordpin = xls.getCellData("Credentials", "PasswordApprover", j);
			String pin = xls.getCellData("Credentials","pin",j);
			Login(login,password);		
		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		
		int RowCount = xls.getRowCount("AreaEuipment");
		System.out.println(RowCount);
		for(int i=3; i<=3;i++)
		{
			//DataMapping 
			String Edit = xls.getCellData("Sheet2","Areaedit" , i);
			 String DropdownSelection = xls.getCellData("AreaEuipment", "dropdown", i);
			 String number = xls.getCellData("AreaEuipment", "euipmentnumber", i);
			 String Name = xls.getCellData("AreaEuipment", "euipmentName", i);
			 String size = xls.getCellData("AreaEuipment", "capacitysize", i);
			 String uom = xls.getCellData("AreaEuipment", "UomId", i);
			 String sop = xls.getCellData("AreaEuipment", "SopNumber", i);
			 String sizeEdit = xls.getCellData("AreaEuipment", "capacitysizeEdit", i);

			 
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");		
			driver.findElement(By.xpath(" //*[contains (text(),' Other Masters')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on Other Masters");
			driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked Radio Button Orals ");		
			
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(DropdownSelection);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='form-control']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='areaRoomNumber_Id']")).sendKeys(Edit);Thread.sleep(2000);
			System.out.println("user entered Area/Room");
			driver.findElement(By.xpath("//*[@formcontrolname='equipmentNumber']")).sendKeys(number);Thread.sleep(2000);
			System.out.println("user entered euipment number");
			driver.findElement(By.xpath("//*[@formcontrolname='equipmentName']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("user entered euipment name");
			
			driver.findElement(By.xpath("//*[@formcontrolname='capacitySize']")).sendKeys(size);Thread.sleep(2000);
			System.out.println("user entered capacity size");
			
			driver.findElement(By.xpath("//*[@formcontrolname='uoM_Id']")).sendKeys(uom);Thread.sleep(2000);
			System.out.println("user entered uomid");
			
			driver.findElement(By.xpath("//*[@formcontrolname='sopNumber_Id']")).sendKeys(sop);Thread.sleep(2000);
			System.out.println("user entered sopid");
			SYPSO( pin, passwordpin );
			driver.findElement(By.xpath("//*[@type='search']")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='capacitySize']")).sendKeys(sizeEdit);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
		    System.out.println("Disable sucessfully");
			UYSPS();
			driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			System.out.println("User clicked checkbox Enable");
			UYSPS();
				
}
		
	}
	}
}
