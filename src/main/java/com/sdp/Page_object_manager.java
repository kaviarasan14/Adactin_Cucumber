package com.sdp;

import org.openqa.selenium.WebDriver;
import com.pom.Hotel_select_page;
import com.pom.Login_page;
import com.pom.Logout_page;
import com.pom.Payment_page;
import com.pom.Searching_hotel_page;

public class Page_object_manager {
	//adactin
	public static WebDriver driver;
	
	
	public Login_page getLp() {
		lp = new Login_page(driver);
		return lp;
	}
    public Page_object_manager(WebDriver driver) {
    	this.driver = driver;
    }
	public Searching_hotel_page getSh() {
		sh = new Searching_hotel_page(driver);
		return sh;
	}

	public Hotel_select_page getHs() {
		hs = new Hotel_select_page(driver);
		return hs;
	}

	public Payment_page getPp() {
		pp = new Payment_page(driver);
		return pp;
	}

	public Logout_page getLo() {
		lo = new Logout_page(driver);
		return lo;
	}
	
	private Login_page lp;
	
	private Searching_hotel_page sh;
	
	private Hotel_select_page hs;
	
	private Payment_page pp;
	
	private Logout_page lo;
	

}
