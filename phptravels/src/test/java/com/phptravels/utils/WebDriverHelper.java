package com.phptravels.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class WebDriverHelper {
	
	
	@BeforeClass
	public void createDriver( String Browser){
		WebDriver driver ;

		String browser = "Chrome";
		switch (browser){
		
		case "Chrome":
		System.setProperty("webdriver.chrome.driver", "C://Users//Hp//Appium_Demo//phptravels//src//test//java//resources//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		break;
		case "FF":
		break;
		default:
		
		break;
		
		
		
		driver.get("http://phptravels.net");
		}
	
	

}
