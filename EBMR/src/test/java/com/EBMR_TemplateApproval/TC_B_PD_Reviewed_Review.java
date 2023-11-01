package com.EBMR_TemplateApproval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Baseclass.Mainpageclass;

public class TC_B_PD_Reviewed_Review extends Mainpageclass {
	public PD_Initiator_XPATH PD;
	

	@Test

	public void A() throws Exception {
		PD_Initiator_XPATH PD=new PD_Initiator_XPATH(driver);
		Actions act=new Actions(driver);

		for (int j=2;j<=2;j++) {
            String login = xls.getCellData("Credentials", "PD Reviewer",j);
			String password = xls.getCellData("Credentials", "Reviewerpassword",j);
            
			Login(login,password);		
		
			PD.EBMRHeteroUnit();
			PD.PDInitiation();
			
			int RowCount = xls.getRowCount("MRP");
			System.out.println(RowCount);
			for (int i=2;i <=2; i++)

			{
				
					String comments = xls.getCellData("MRP", "comments", i);
			
			WebElement ele = driver.findElement(By.xpath("/html/body/app-root/div/div/app-dashboard/div/div[1]/div/div/div/div/div/div/p[1]")); 
			act.doubleClick(ele).perform();
			PD.MprNumber();
			PD.PDReviewButton();
			PD.ReviewButton();
			PD.Comments(comments);
			RYPSO(login,password);
	
		

		}
}
}}
