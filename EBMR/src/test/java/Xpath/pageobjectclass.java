package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectclass {

	WebDriver driver;
	
	 public pageobjectclass(WebDriver d) {
		driver=d;
	}
	
	
//	public void MASTERS() {
//		driver.findElement(By.xpath("//*[contains (text(),'MASTERS')]")).click();
//
//	}
	
	
	
	
	
	
	public void Submit() {
		driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
	}
	public void productName(String PN) {
		driver.findElement(By.xpath("//*[@formcontrolname='productName']")).sendKeys(PN);
	}
	public void Prefix(String PFX) {
		driver.findElement(By.xpath("//*[@formcontrolname='prefix']")).sendKeys( PFX);
	}
	public void strength(String Sgth)
	{
		driver.findElement(By.xpath("//*[@formcontrolname='strength']")).sendKeys(Sgth);
	}
	public void strengthCode(String SC) {
		driver.findElement(By.xpath("//*[@formcontrolname='strengthCode']")).sendKeys(SC);
	}
}



