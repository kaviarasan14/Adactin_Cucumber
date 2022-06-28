package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.Base_Class;
import com.adactin.runner.Runner_Class;
import com.pom.Login_page;
import com.sdp.Page_object_manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step_Definition extends Base_Class{
	
	public static WebDriver driver = Runner_Class.driver;
	
	//public static Login_page lp= new Login_page(driver); //login page obj ref
	
	public static Page_object_manager pom = new Page_object_manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	    get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	    sendingKeys(pom.getLp().getUsername(), "kavi1234");
	}

	@When("^user Enter Password in Password Field$")
	public void user_Enter_Password_in_Password_Field() throws Throwable {
	    sendingKeys(pom.getLp().getPassword(), "password1234");
	}

	@Then("^user Click the Login Button$")
	public void user_Click_the_Login_Button() throws Throwable {
	    clickonELement(pom.getLp().getLogin_button());
	}

	@When("^user Selecting Location In The Dropdown$")
	public void user_Selecting_Location_In_The_Dropdown() throws Throwable {
	   // Assert.fail();
	}

	@When("^user Selecting Hotel In The Dropdown$")
	public void user_Selecting_Hotel_In_The_Dropdown() throws Throwable {
	    
	}

	@When("^user Selecting Room Type In The Dropdwon$")
	public void user_Selecting_Room_Type_In_The_Dropdwon() throws Throwable {
	   
	}

	@When("^user Selecting Number of Rooms In The Dropdown$")
	public void user_Selecting_Number_of_Rooms_In_The_Dropdown() throws Throwable {
	    
	}

	@When("^user Selecting Entering Check In Date In Check In Field$")
	public void user_Selecting_Entering_Check_In_Date_In_Check_In_Field() throws Throwable {
	    
	}

	@When("^user Selecting Entering Check Out Date In Check Out Field$")
	public void user_Selecting_Entering_Check_Out_Date_In_Check_Out_Field() throws Throwable {
	    
	}

	@When("^user Selecting Number of Adults Per Room In The Dropdown$")
	public void user_Selecting_Number_of_Adults_Per_Room_In_The_Dropdown() throws Throwable {
	    
	}

	@When("^user Selecting Childrens Per Room In The Dropdown$")
	public void user_Selecting_Childrens_Per_Room_In_The_Dropdown() throws Throwable {
	    
	}

	@Then("^user Click The Search Button$")
	public void user_Click_The_Search_Button() throws Throwable {
	    
	}

	@When("^user Selecting The Hotel$")
	public void user_Selecting_The_Hotel() throws Throwable {
	    
	}

	@Then("^user Click Continue Button$")
	public void user_Click_Continue_Button() throws Throwable {
	   
	}

	@When("^user Enters First Name In The First Name Field$")
	public void user_Enters_First_Name_In_The_First_Name_Field() throws Throwable {
	    
	}

	@When("^user Enters Last Name In The Last Name Field$")
	public void user_Enters_Last_Name_In_The_Last_Name_Field() throws Throwable {
	    
	}

	@When("^user Enters Billing Address In The Adress Field$")
	public void user_Enters_Billing_Address_In_The_Adress_Field() throws Throwable {
	    
	}

	@When("^user Enters The Credit Card Number In the Credit Card Number Field$")
	public void user_Enters_The_Credit_Card_Number_In_the_Credit_Card_Number_Field() throws Throwable {
	    
	}

	@When("^user Selects Credit Card Type In The Credit Card Type Dropdown$")
	public void user_Selects_Credit_Card_Type_In_The_Credit_Card_Type_Dropdown() throws Throwable {
	    
	}

	@When("^user Selects Expiry Month In The Expiry Month Dropdown$")
	public void user_Selects_Expiry_Month_In_The_Expiry_Month_Dropdown() throws Throwable {
	    
	}

	@When("^user selects Expiry Year In The Expiry Year Dropdown$")
	public void user_selects_Expiry_Year_In_The_Expiry_Year_Dropdown() throws Throwable {
	    
	}

	@When("^user Enters The Cvv Number In The Cvv Number Field$")
	public void user_Enters_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
	    
	}

	@Then("^user Clicks The Book Now Field$")
	public void user_Clicks_The_Book_Now_Field() throws Throwable {
	    
	}

	@Then("^user Clicks The Logout Button$")
	public void user_Clicks_The_Logout_Button() throws Throwable {
	   
	}
	
}
