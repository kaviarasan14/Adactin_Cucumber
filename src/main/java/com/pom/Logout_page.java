package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_page {
	
	public static WebDriver driver;
	
	public Logout_page(WebDriver driver) {
	this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logoutbtn;

}
