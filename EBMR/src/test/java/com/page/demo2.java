package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class demo2
{
	
   public WebDriver driver;
    public demo2(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH,using ="//*[@class='tile purple']")
    public WebElement SubmitText1;
    public void Submit() {
    	SubmitText1.click();
    }
	
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='LoginId']")
    public WebElement UserIdSK;
    public void UserIdSK(String x) 
    {
    	//UserIdSK.click();
    	//UserIdSK.sendKeys(x);
    	UserIdSK.clear();
    	UserIdSK.sendKeys(x);
    	

    }
	
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='password']")
    public WebElement password;
    public void password(String x) 
    {
    	password.click();
    	password.sendKeys(x);
    	password.clear();
    	password.sendKeys(x);

    }
    
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='productName']")
    public WebElement ProductName;
    public void ProductName(String x) 
    {
    	
    	password.sendKeys(x);
    	password.clear();
    	password.sendKeys(x);

    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}