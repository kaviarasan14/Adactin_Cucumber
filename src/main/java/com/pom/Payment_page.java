package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lasttname;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardnum;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expirymonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknowbtn;
	
	public Payment_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLasttname() {
		return lasttname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknowbtn() {
		return booknowbtn;
	}
	
	
}
