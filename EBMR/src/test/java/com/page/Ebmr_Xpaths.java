package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Ebmr_Xpaths
{
	
   public WebDriver driver;
    public Ebmr_Xpaths(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='LoginId']")
    public WebElement Login;
    public void Login(String x) 
    {
    	//UserIdSK.click();
    	//UserIdSK.sendKeys(x);
    	Login.clear();
    	Login.sendKeys(x);
    	

    }
	
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='password']")
    public WebElement Password;
    public void Password(String x) 
    {
    	
    	Password.sendKeys(x);
    }
    
    @FindBy(how = How.XPATH,using ="//*[@class='tile purple']")
    public WebElement purple;
    public void purple() {
    	purple.click();
    }
    
   
    
    @FindBy(how  = How.XPATH,using="//*[contains (text(),'MASTERS')]")
    public WebElement Master;
    public void Master() {
    	Master.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    
    
    
    
    @FindBy(how = How.XPATH,using =" //*[contains (text(),' Product Details')]")
    public WebElement ProductDetails;
    public void ProductDetails()
    {
    	ProductDetails.click();
    	

    }
    
    
    @FindBy(how = How.XPATH,using ="//*[@type='radio']")
    public WebElement DRYRadioButton;
    public void DRYRadioButton()
    {
    	DRYRadioButton.click();
    	

    }
    
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='productName']")
    public WebElement ProductName;
    public void ProductName(String x) 
    {
    	
    	ProductName.clear();
    	ProductName.sendKeys(x);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='prefix']")
    public WebElement Prefix;
    public void Prefix(String x) 
    {
    	
    	Prefix.clear();
    	Prefix.sendKeys(x);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='strength']")
    public WebElement strength;
    public void strength(String x) 
    {
    	
    	strength.clear();
    	strength.sendKeys(x);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='strengthCode']")
    public WebElement strengthCode;
    public void strengthCode(String x,String y) 
    {
    	strengthCode.clear();
    	strengthCode.sendKeys(x);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	strengthCode.clear();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	strengthCode.sendKeys(y);

    }
    @FindBy(how = How.XPATH,using ="//*[contains (text(),'Search:')]")
    public WebElement Search;
    public void Search(String x) 
    {
    	Search.clear();
    	Search.sendKeys(x);
    	

    }
    @FindBy(how = How.XPATH,using ="//*[@class='fa fa-pencil']")
    public WebElement FFPAction1;
    public void FFPAction1() 
    {
    	FFPAction1.click();
    }
    
    @FindBy(how = How.XPATH,using ="(//*[@class='fa fa-pencil'])[2]")
    public WebElement FFPAction2;
    public void FFPAction2() 
    {
    	FFPAction1.click();
    }
    
    @FindBy(how = How.XPATH,using ="//*[contains (text(),'Update')]")
    public WebElement UpdateButton;
     @FindBy(how = How.XPATH,using="//*[contains (text(),'Ok')]")
     public WebElement OKButton;
    public void UpdateOk()
    {
    	UpdateButton.click();
    	OKButton.click();
    }
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}