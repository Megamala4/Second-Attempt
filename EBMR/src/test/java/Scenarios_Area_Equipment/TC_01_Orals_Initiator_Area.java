package Scenarios_Area_Equipment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_01_Orals_Initiator_Area extends Mainpageclass {
	@Test
	
	public void A() throws Exception{
		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "login",j);
			String password = xls.getCellData("Credentials", "Password",j);
            
			Login(login,password);		
		driver.findElement(By.xpath("//*[@class='tile purple']")).click();Thread.sleep(2000);
		int RowCount = xls.getRowCount("Sheet2");
		System.out.println(RowCount);
		for (int i=3;i <=3; i++)

		{
			String Name = xls.getCellData("Sheet2", "Areaname", i);
			String Number = xls.getCellData("Sheet2", "Areanumber",i);
			String Edit = xls.getCellData("Sheet2","Areaedit" , i);
			String DropdownSelection = xls.getCellData("Sheet2", "select", i);
			String NumberEdit = xls.getCellData("Sheet2", "AreanumberEdit",i);

			
			driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on MAster");
			driver.findElement(By.xpath(" //*[contains (text(),' Other Masters')]")).click();Thread.sleep(2000);
			System.out.println("User CLicked on Other Masters");
			driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();Thread.sleep(2000);Thread.sleep(2000);
			System.out.println("User Clicked Radio Button Orals ");
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(DropdownSelection);
			driver.findElement(By.xpath("//*[@class='form-control']")).click();
			driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
			System.out.println("User clicked create");//VALIDATION
			scrollPagedown();
			
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomName']")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("User Keys Arearoomname");
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomNumber']")).sendKeys(Number);Thread.sleep(2000);
			System.out.println("user keys Arearoomnumber");
			
//			driver.findElement(By.xpath("//*[@formcontrolname='arearoomName']")).clear();Thread.sleep(2000);
//		    driver.findElement(By.xpath("//*[@formcontrolname='arearoomNumber']")).clear();Thread.sleep(2000);	 
//		    driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
//		    //Validation
//			driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
//
//
//			driver.findElement(By.xpath("//*[@formcontrolname='arearoomName']")).sendKeys(Name);Thread.sleep(2000);
//			System.out.println("User Keys Arearoomname");
//
//			driver.findElement(By.xpath("//*[@formcontrolname='arearoomNumber']")).sendKeys(Number);Thread.sleep(2000);
//			System.out.println("user keys Arearoomnumber");
			CYPSO();
			driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Name);Thread.sleep(2000);
			System.out.println("user clicked serach");
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);	
			System.out.println("user clicked Action");
			driver.findElement(By.xpath("//*[contains (text(),'Close')]")).click();Thread.sleep(2000);
			System.out.println("user clicked close");
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			System.out.println("user clicked Action");
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
			System.out.println("user clicked update");//VALIDATION
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomName']")).clear();Thread.sleep(2000);
			System.out.println("user cleared name");
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomName']")).sendKeys(Edit);Thread.sleep(2000);
			System.out.println("user keys updated Areaname ");
	        driver.findElement(By.xpath("//*[@formcontrolname='arearoomNumber']")).clear();Thread.sleep(2000);
			System.out.println("user cleared number");
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomNumber']")).sendKeys(NumberEdit);Thread.sleep(2000);
			System.out.println("user keys updated Areanumber ");
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			System.out.println("Disbled Sucessfully");
			UYSPS();
			driver.findElement(By.xpath("//*[contains (text(),'Search:')]")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(2000);
			System.out.println("Enable Sucessfully");
			UYSPS();

//Already exists
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomName']")).sendKeys(Name);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='arearoomNumber']")).sendKeys(Number);Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
			
			//Re_Uploading File 
			driver.findElement(By.xpath(" //*[contains (text(),'Template')]")).click();Thread.sleep(20000);Thread.sleep(20000);
			Thread.sleep(20000);
//			   AttachFile(); 
//		      UploadFile("C:\\Users\\megamala.burra\\Downloads\\AreaorroomMaster");
//		      Thread.sleep(1000);//Incomplete Data
//		      driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(20000);Thread.sleep(20000);
//			  Thread.sleep(20000);
//		     
//			driver.findElement(By.xpath(" //*[contains (text(),'Template')]")).click();Thread.sleep(20000);Thread.sleep(20000);
//			Thread.sleep(20000);Thread.sleep(20000);
		      AttachFile(); 
	   	     UploadFile("C:\\Users\\megamala.burra\\Downloads\\AreaorroomMaster");
		     Thread.sleep(1000);//Saved Successfully
		     Bulkupload();
			     
		    AttachFile(); 
     	     UploadFile("C:\\Users\\megamala.burra\\Downloads\\AreaorroomMaster");
		     Thread.sleep(1000);//Already Exists
		    driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
			   
			 driver.findElement(By.xpath(" //*[contains (text(),'Print')]")).click();
			  Thread.sleep(2000);
			
		}
		}
			
	}
			
}
