package com.EBMR_TemplateApproval;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PD_Initiator_XPATH {

	 public WebDriver driver;
	    public PD_Initiator_XPATH(WebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	    @FindBy(how = How.XPATH,using="//*[@class='tile purple']")
	    public WebElement EBMRHeteroUnit;
	    public void EBMRHeteroUnit() throws Exception{
	    	EBMRHeteroUnit.click();
	    	Thread.sleep(4000);
	    }
	    
	    
	    
	    @FindBy(how = How.XPATH,using="\"/html/body/app-root/div/div/app-dashboard/div/div[1]/div/div/div/div/div/div/p[1]\"")
	    
	    public WebElement PDInitiation;
	    public void PDInitiation() throws Exception 
	    {
	    	PDInitiation.click();
	    	Thread.sleep(4000);
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    
	    @FindBy(how = How.XPATH,using="//*[@type='radio']")
	    public WebElement InitaitionRadioButton;
	    public void InitaitionRadioButton() {
	    	InitaitionRadioButton.click();
	    }
	    
	    @FindBy(how = How.XPATH,using="//button[normalize-space()='Get']")
	    public WebElement Get;
	    public void Get() {
	    	Get.click();
	    }
	    @FindBy(how = How.XPATH,using="//*[@formcontrolname='mprNo']")
	    public WebElement SelectMprNo;
	    public void SelectMprNo(String x) {
	    	SelectMprNo.clear();
	    	SelectMprNo.sendKeys(x);
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    }
	    @FindBy(how = How.XPATH,using="/html/body/app-root/div/div/app-template-approval-table/html/section/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]")
	    public WebElement MprNumberHyperlink;
	    public void MprNumber() {
	    	MprNumberHyperlink.click();
	    	
	    }
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Back']")
	    public WebElement BackButton;
	    public void BackButton() {
	    	BackButton.click();
	    }
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Export']")
	    public WebElement ExportButton;
	    public void ExportButton() {
	    	ExportButton.click();
	    } 
	    
	    @FindBy(how = How.XPATH,using="//button[normalize-space()='Send to Review']")
	    public WebElement SendToReviewButton;
	    public void SendToReviewButton() {
	    	SendToReviewButton.click();
	    }
	    
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Pending for PD Review']")
	    public WebElement PendingforPDReviewButton;
	    public void PDReviewButton() {
	    	PendingforPDReviewButton.click();
	    }
	    
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Summary']")
	    public WebElement Summary;
	    public void SummaryButton() {
	    	Summary.click();
	    }
	    
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Review']")
	    public WebElement ReviewButton;
	    public void ReviewButton() {
	    		ReviewButton.click();
	    }
	    
	    @FindBy(how = How.XPATH,using="//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")
	    public WebElement Comments;
	    public void Comments(String x) {
	    		Comments.sendKeys(x);
	    }
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Pending for QA Review']")
	    public WebElement PendingforQAReviewButton;
	    public void QAReviewButton() {
	    	PendingforQAReviewButton.click();
	    }
	    
	    @FindBy(how = How.XPATH,using="//a[normalize-space()='Pending for RA Review']")
	    public WebElement PendingforRAReviewButton;
	    public void RAReviewButton() {
	    	PendingforQAReviewButton.click();
	    }
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

}
