package xNEW_Baseclass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.model.Test;

import Baseclass.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MYNEWBC {

	public static WebDriver driver;
	protected static Properties Pro;
//	 UploadFile(System.getProperty("user.dir")+"\\Excel\\login.xlsx");
//	             Thread.sleep(1000);
	
//	public static Xls_Reader xls = new Xls_Reader("C:\\Users\\megamala.burra\\eclipse-workspace\\EBMR\\src\\test\\resources\\Excel\\login.xlsx");

	
	public static Xls_Reader xls = new Xls_Reader("C:\\Users\\megamala.burra\\eclipse-workspace\\EBMR\\src\\test\\resources\\Excel\\login.xlsx");
	@BeforeMethod(alwaysRun = true)
	
	public void URL_Load() throws Exception {
	Properties Pro = new Properties();
	FileInputStream ip = new FileInputStream(
	"C:\\Users\\megamala.burra\\eclipse-workspace\\EBMR\\src\\test\\resources\\Propertyfile\\config.properties");
	Pro.load(ip);
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Pro.getProperty("url"));
	Thread.sleep(2000);
	}


	public static void Login(String login,String password) throws Exception {
		
	driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(login);
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(password);
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[contains (text(),'Login')]")).click();
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[contains (text(),'Terminate Other Login')]")).click();	
	Thread.sleep(2000);
	}
		
	//Scrolling page
	
	public static void scrollPagedown() throws Exception 
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");}
	
	public static void scrollpageup() throws Exception{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)");
	}

	// Approver login
	public static void Aprrover() throws Exception{
		
		for (int i=2;i <=2; i++)

		{
		String login = xls.getCellData("Credentials", "LoginApprover ",i);
		String password = xls.getCellData("Credentials","PasswordApprover",i);
		
		driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(login);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Terminate Other Login')]")).click();
		Thread.sleep(2000);Thread.sleep(2000);
		}}
	
	//Updating method
    public static void UYSPS() throws Exception{
		for (int i=2;i <=2; i++)

		{
		String password = xls.getCellData("Credentials","Password",i);
  		String pin = xls.getCellData("Credentials", "pin", i);
  		
		
			try {
				driver.findElement(By.xpath("//button[contains (text(),'Update')]")).click();Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			driver.findElement(By.xpath("//button[contains (text(),'Re-Initiate')]")).click();Thread.sleep(2000);
	    	driver.findElement(By.xpath("(//button[contains (text(),'No')])[3]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			try {
				driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(pin);Thread.sleep(2000);
			try {
				driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
     	    driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);
			try {
				driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);	 
}
	}
    //Creating Method
    public static void CYPSO() throws Exception{
  		
  		for (int i=2;i <=2; i++)

  		{
  		String password = xls.getCellData("Credentials","Password",i);
  		String pin = xls.getCellData("Credentials", "pin", i);
	
	    driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[contains (text(),'No')])[3]")).click();Thread.sleep(2000);
	 	driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
	try {
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[1]")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}

	try {
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@formcontrolname='password' or @formcontrolname='Password']")).sendKeys(pin);
	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains (text(),'OK')]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);
    driver.findElement(By.xpath("//*[contains (text(),'Create')]")).click();Thread.sleep(2000);
    try {
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[1]")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}

	try {
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@formcontrolname='password' or @formcontrolname='Password']")).sendKeys(password);
	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);
}
    }
    
    //Submit Method
    
    public static void SYPSO(String pin,String passwordpin  ) throws Exception{

     	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
        try {
			driver.findElement(By.xpath("(//button[contains (text(),'No')])[3]")).click();Thread.sleep(2000);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
        try {
			driver.findElement(By.xpath("(//button[contains (text(),'No')])[6]")).click();Thread.sleep(2000);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
        
     	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();Thread.sleep(2000);Thread.sleep(2000);
		

	   try {
		driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
	} catch (Exception e) {
	
		e.printStackTrace();
	}
		try {
			driver.findElement(By.xpath("//button[contains (text(),'Submit')]")).click();Thread.sleep(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	   driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(pin);Thread.sleep(2000);

	   try {
			driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
			try {
				driver.findElement(By.xpath("//button[contains (text(),'Submit')]")).click();Thread.sleep(2000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
	   driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@class='close'])[2]")).click();Thread.sleep(2000);
	   try {
		driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
	} catch (Exception e1) {
		
		e1.printStackTrace();
	}
	   try {
			driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	   
	try {
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[1]")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}

	try {
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}

	driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(passwordpin);Thread.sleep(2000);

	 try {
			driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
			try {
				driver.findElement(By.xpath("//button[contains (text(),'Submit')]")).click();Thread.sleep(2000);
            } catch (Exception e) {
				
				e.printStackTrace();
			}	driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);}
	

    //Return Method
    
    public static void RYSO() throws Exception{
      	
  		for (int i=2;i <=2; i++)

  		{
  		String password = xls.getCellData("Credentials","PasswordApprover",i);
  		String pin = xls.getCellData("Credentials", "pin", i);

  		driver.findElement(By.xpath("//*[contains (text(),'Return')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[contains (text(),'No')])[3]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains (text(),'Return')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(pin);
    	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
     	driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
     	try {
			driver.findElement(By.xpath("(//*[@class='close'])[2]")).click();Thread.sleep(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
//     	try {
//			driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
  		driver.findElement(By.xpath("//*[contains (text(),'Return')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);}
}
    //Approver Method
    
  public static void AYSO() throws Exception
  {    	
  		for (int i=2;i <=2; i++)
  		{
  		String password = xls.getCellData("Credentials","PasswordApprover",i);
  		String pin = xls.getCellData("Credentials", "pin", i);

    driver.findElement(By.xpath("//button[contains (text(),'Approve')]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains (text(),'No')])[3]")).click();Thread.sleep(2000);
    driver.findElement(By.xpath("//button[contains (text(),'Approve')]")).click();Thread.sleep(2000);
    try
    {
		driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
	} catch (Exception e) 
    {
		e.printStackTrace();
	}

	try 
	{
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
	driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(pin);
	driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
 	driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
 	try {
		driver.findElement(By.xpath("(//*[@class='close'])[2]")).click();Thread.sleep(2000);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
// 	try {
//		driver.findElement(By.xpath("//*[@class='close']")).click();Thread.sleep(2000);
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//	}
    driver.findElement(By.xpath("//button[contains (text(),'Approve')]")).click();Thread.sleep(2000);
    try
    {
		driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
	} catch (Exception e) 
    {
		e.printStackTrace();
	}

	try 
	{
		driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
    driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);
    driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();Thread.sleep(2000);
    driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);}}
    
    

public static void AttachFile() throws Exception
   {
//      WebElement Color = driver.findElement(By.xpath(" //*[contains (text(),'Bulk Upload')]"));
//      JavascriptExecutor Js = (JavascriptExecutor) driver;
//      Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;'c;", Color);
//        driver.findElement(By.xpath(" //*[contains (text(),'Bulk Upload')]")).click();
//      Thread.sleep(3000);
//      Actions action = new Actions(driver);
//      action.click(AttachFile).perform();
//       Thread.sleep(2000);
 }
   
   public static void UploadFile(String path) throws Exception
{
   Robot r = new Robot();
   r.delay(3000); 
   StringSelection s = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.delay(3000);
    r.keyRelease(KeyEvent.VK_V);
    r.delay(3000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.delay(6000);
   System.out.println("uploaded Successfully");
}
   
  
   public static void Bulkupload() throws Exception{
 	
 		for (int i=2;i <=2; i++)

 		{
 		String password = xls.getCellData("Credentials","Password",i);
		driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			driver.findElement(By.xpath("//button[contains (text(),'Submit')]")).click();Thread.sleep(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		try {
			driver.findElement(By.xpath("//button[contains (text(),'Submit')]")).click();Thread.sleep(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	 	driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);
 		}
}
   public static void EYSPS() throws Exception{
 		for (int i=2;i <=2; i++)

 		{
 		String password = xls.getCellData("Credentials","PasswordApprover",i);
   		String pin = xls.getCellData("Credentials", "pin", i);
   		
 		
 	   driver.findElement(By.xpath("//* [contains (text(),'Edit')]")).click();Thread.sleep(2000);
 	   driver.findElement(By.xpath("(//button[contains (text(),'No')])[3]")).click();Thread.sleep(2000);
 	   driver.findElement(By.xpath("//* [contains (text(),'Edit')]")).click();Thread.sleep(2000);
 		
 		try {
 			driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		try {
 			driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(pin);
 		driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
      	driver.findElement(By.xpath("//button[contains (text(),'OK')]")).click();Thread.sleep(2000);
 	    driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);
 		driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]")).click();Thread.sleep(2000);
 	    driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();Thread.sleep(2000);	 
 }
 	}
   
	}









