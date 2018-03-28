package com.phptravels.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {
	
	
	@Test
	public void verify_LoginPage(){
		System.setProperty("webdriver.chrome.driver", "C://Users//Hp//Appium_Demo//phptravels//src//test//java//resources//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://phptravels.net");
		
		System.out.println("Test Run");
		
		
		
	}

}
