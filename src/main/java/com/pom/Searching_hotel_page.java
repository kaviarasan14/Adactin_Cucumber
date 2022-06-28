package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searching_hotel_page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	
	public Searching_hotel_page(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement numofrooms;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adults;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement children;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement searchbtn;

}
