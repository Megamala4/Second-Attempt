package com.EBMR_OtherMasters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Common_XPATH {

	public WebDriver driver;
	public Common_XPATH(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);


	}

}