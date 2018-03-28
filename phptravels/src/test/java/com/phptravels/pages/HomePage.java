package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	

	@FindBy(xpath="//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[1]/a/span")
	private WebElement lblHotels;
	
	

}
