package TemplateCreation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_WET_Compression extends Mainpageclass {

	@Test
	public void A() throws Exception{
	for (int j=2;j<=2;j++) {
        String login = xls.getCellData("Credentials", "username",j);
		String password = xls.getCellData("Credentials", "PasswordApprover",j);
		String passwordpin = xls.getCellData("Credentials", "Password", j);
		String pin = xls.getCellData("Credentials","pin",j);
		Login(login,password);	
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(200);
		
		int RowCount = xls.getRowCount("Template Creation");
		System.out.println(RowCount);
		for(int i=2;i<=2;i++) {
		String Mpr = xls.getCellData("Template Creation", "MprNoWG", i);
		String UOM = xls.getCellData("Template Creation", "UOM", i);
		String SamplingQuantity = xls.getCellData("Template Creation", "SamplingQuantity", i);	
		   String Less = xls.getCellData("Template Creation", "Percentageless", i);
	        String More = xls.getCellData("Template Creation", "PercentageMore", i);
			String Frequnency = xls.getCellData("Template Creation", "Frequnency", i);	
		
		driver.findElement(By.xpath("//*[contains (text(),'Wet Granulation')]")).click();Thread.sleep(200);
		driver.findElement(By.xpath("(//*[contains (text(),' Compression')])[2]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@formcontrolname='MPRNo']")).sendKeys(Mpr);Thread.sleep(2000);
		System.out.println("user entered MPRNO..");
		driver.findElement(By.xpath("//*[@formcontrolname='MPRNo']")).sendKeys(Mpr);Thread.sleep(2000);
		System.out.println("user entered MPRNO..");
		driver.findElement(By.xpath("//*[@formcontrolname='MPRNo']")).sendKeys(Mpr);Thread.sleep(2000);
		System.out.println("user entered MPRNO..");
		driver.findElement(By.xpath("//*[@class='fa fa-angle-down font20 float-right']")).click();Thread.sleep(2000);
		System.out.println("user clicked on Compression Instructions");

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[2]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Mass of Blend Verification");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[3]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Line Clearance for Compression");

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[4]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Compression Activity");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[5]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Setting up of Compression Machine and Metal Detector");

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[6]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Metal Detector Challenging Test");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[7]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Compression Parameters");
		

		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[8]")).click();Thread.sleep(2000);
		System.out.println("user clicked on Inprocess Check Records");
		//rAHUL
		
		
//		driver.findElement(By.xpath("//*[@class='dropdown-btn']")).click();Thread.sleep(2000);Thread.sleep(20000);
//		System.out.println("user selected Inprocess Check Records ");
		
//		driver.findElement(By.xpath("//*[@placeholder='Search']")).clear();Thread.sleep(2000);Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("QA");Thread.sleep(2000);Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//*[contains (text(),'QA-0989')])[1]")).click();Thread.sleep(2000);Thread.sleep(2000);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@class='dropdown-btn']")).click();Thread.sleep(2000);Thread.sleep(2000);
//		System.out.println("user selected Inprocess Check Records Dropdown selected sucessfully ");
		driver.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys(SamplingQuantity);Thread.sleep(2000);
		System.out.println("user entered Sampling qunatity ");
		driver.findElement(By.xpath("(//*[@type='text'])[6]")).sendKeys(SamplingQuantity);Thread.sleep(2000);
		System.out.println("user entered Sampling qunatity ");

		driver.findElement(By.xpath("//table[@class='table table-bordered table-responsive table-blu text-left']//th[2]//select[1]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered Mass individual Tablet ");

		driver.findElement(By.xpath("//table[@class='table table-bordered table-responsive table-blu text-left']//th[3]//select[1]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered Thickness ");

		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-compression[1]/form[1]/div[1]/div[2]/div[9]/div[1]/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[4]/select[1]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered Resistance to Crushing");

		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-compression[1]/form[1]/div[1]/div[2]/div[9]/div[1]/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[5]/select[1]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered Mass of 10 Tablets ");

		driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-compression[1]/form[1]/div[1]/div[2]/div[9]/div[1]/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[6]/select[1]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered DT");
		driver.findElement(By.xpath("(//select)[11]")).sendKeys(UOM);Thread.sleep(2000);
		System.out.println("user entered Friability ");

		driver.findElement(By.xpath("(//select)[12]")).sendKeys(UOM);Thread.sleep(2000);
		System.out.println("user entered Mass ");
		
		driver.findElement(By.xpath("(//*[@class='ng-untouched ng-pristine ng-valid'])[45]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered Thicknesss ");

		driver.findElement(By.xpath("(//*[@class='ng-untouched ng-pristine ng-valid'])[76]")).sendKeys(UOM);
		Thread.sleep(2000);
		System.out.println("user entered Resistance to Crushing ");

//		driver.findElement(By.xpath("(//*[@class='dropdown-btn'])[2]")).click();Thread.sleep(2000);Thread.sleep(2000);
//		System.out.println("user dropdown select Physical Defects");
//		scrollpageup();
//		driver.findElement(By.xpath("(//*[@placeholder='Search'])[2]")).sendKeys("QA");Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[contains (text(),'QA-0989')])[5]")).click();Thread.sleep(2000);
//
//
//		driver.findElement(By.xpath("(//*[@class='dropdown-btn'])[2]")).click();Thread.sleep(2000);Thread.sleep(2000);
//		System.out.println("user selected Inprocess Check Records Dropdown selected sucessfully ");

		
		driver.findElement(By.xpath("(//*[@type='text'])[103]")).sendKeys(SamplingQuantity);Thread.sleep(2000);
		System.out.println("user entered Total sampling Quantity");
		
		driver.findElement(By.xpath("(//*[@type='text'])[114]")).sendKeys(Frequnency);Thread.sleep(2000);
		System.out.println("user entered Frequency(Group mass Variation)");
		
		driver.findElement(By.xpath("(//*[@type='text'])[119]")).sendKeys(Frequnency);Thread.sleep(2000);
		System.out.println("user entered Frequency(Mass Of Inidividual Tablet)");

		driver.findElement(By.xpath("(//*[@style='width: 70px;'])[16]")).sendKeys(UOM);Thread.sleep(2000);
       
		driver.findElement(By.xpath("(//*[@type='text'])[130]")).sendKeys(Frequnency);Thread.sleep(2000);
		driver.findElement(By.xpath("(//select)[22]")).sendKeys(UOM);Thread.sleep(2000);
		System.out.println("user select dropdown UOM Thickness)");

		driver.findElement(By.xpath("(//*[@type='text'])[141]")).sendKeys(Frequnency);Thread.sleep(2000);
		System.out.println("user entered Frequency Resistance to Crushing, Fraibility and DT)");

		driver.findElement(By.xpath("(//*[@style='width: 70px;'])[18]")).sendKeys(UOM);Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//*[@class='fa fa-angle-down font20 float-right'])[9]")).click();Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@type='text'])[177]")).sendKeys(Less);Thread.sleep(2000);
		System.out.println("user Entered Investigation percentage");

		driver.findElement(By.xpath("(//*[@type='text'])[178]")).sendKeys(More);Thread.sleep(2000);
		System.out.println("user Entered Investigation percentage");

		driver.findElement(By.xpath("(//*[@type='text'])[179]")).sendKeys(Less);Thread.sleep(2000);
		System.out.println("user Entered Investigation percentage");

		driver.findElement(By.xpath("(//*[@type='text'])[180]")).sendKeys(More);Thread.sleep(2000);
		System.out.println("user Entered Investigation percentage");

		SYO( pin, passwordpin );
		driver.findElement(By.xpath("//*[@class='fa fa-eye']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
		UYSPS();


}}}}
