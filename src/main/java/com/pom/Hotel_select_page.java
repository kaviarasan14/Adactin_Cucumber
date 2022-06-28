package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotel_select_page {

	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement hotelslct;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebtn;

	public Hotel_select_page(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement getHotelslct() {
		return hotelslct;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
}
