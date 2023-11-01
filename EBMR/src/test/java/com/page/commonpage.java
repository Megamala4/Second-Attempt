package com.page;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class commonpage
{
	
   public WebDriver driver;
    public commonpage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH,using ="//*[@class='tile purple']")
    public WebElement SubmitText1;
    public void Submit() {
    	SubmitText1.click();
    }
    
    
    @FindBy(how = How.XPATH,using ="//button[contains (text(),'Submit')]")
    public WebElement SubmitButton;
    @FindBy(how = How.XPATH,using = "//*[@formcontrolname='Password']")
    public WebElement Password;
    @FindBy(how = How.XPATH,using ="//*[contains (text(),'Login')]")
    public WebElement loginclick;
    @FindBy(how = How.XPATH,using = "//button[contains (text(),'Terminate Other Login')]")
    public WebElement otherloginclick;

    public void Loginpage(String x,String y) throws Exception 
    {
//    	UserIdSK.click();
    	SubmitButton.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Password.sendKeys(y);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
    	loginclick.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    	
    	otherloginclick.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    	
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
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='prefix']")
    public WebElement prefix;
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='strength']")
    public WebElement strength;
    @FindBy(how = How.XPATH,using ="//*[@formcontrolname='strengthCode']")
    public WebElement strengthCode;
    
    public void ProductDetails(String x,String y,String z,String S) 
    {
    	
    	ProductName.sendKeys(x);
    	prefix.sendKeys(y);
    	strength.sendKeys(z);
    	strengthCode.sendKeys(S);
    	strengthCode.clear();
    	strengthCode.sendKeys(S);
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}