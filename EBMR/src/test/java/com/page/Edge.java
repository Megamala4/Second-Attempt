package com.page;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;



public class Edge {

	
	public static void main(String[] args) {

		
		
		WebDriver  driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		driver.get("http://172.16.5.167/EBMRSpectrum/Test/");


	}}
