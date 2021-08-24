package org.stedef;

import org.adactinlocators.BookConfirmation;
import org.adactinlocators.BookaHotel;
import org.adactinlocators.Login;
import org.adactinlocators.SearchHotel;
import org.adactinlocators.SelectHotel;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefBase extends BaseClass{

	
	@Given("User is on the adactin website")
	public void user_is_on_the_adactin_website() {
	getDriver("chrome");
	launchUrl("https://adactin.com/HotelApp/");
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String string, String string2) {
		Login l =new Login();
	    WebElement user =l.getUsername();
		typeText(user, string);
		WebElement pass =l.getPassword();
		typeText(pass, string2);
		
		
	    
	}

	@Then("user  click the login button")
	public void user_click_the_login_button() {
		Login l =new Login();
		WebElement log =l.getLogin();
		btnclick(log);
	}
	
	
	@Given("User is on the search hotel webpage")
	public void user_is_on_the_search_hotel_webpage() {
		System.out.println("search hotel");
	}

	@When("User enter the {string}  {string} {string} {string}  {string} {string} {string} {string}")
	public void user_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   
		 SearchHotel s =new  SearchHotel();
	     WebElement location = s.getLocation();
	     selectByDropDown(location, "index", string);
	     
	     WebElement hotel = s.getHotels();
	     selectByDropDown(hotel, "index", string2);
	     
	     WebElement rtype = s.getRoom_type();
	     selectByDropDown(rtype, "index", string3);
	     
	     WebElement rnos = s.getRoom_nos();
	     selectByDropDown(rnos, "index", string4);
	     
	     WebElement datein = s.getDatepick_in();
	     typeText(datein, string5);
	     
	     
	     WebElement dateout = s.getDatepick_in();
	     typeText(dateout, string6);
	     
	     WebElement adultr = s.getChild_room();
	     selectByDropDown(adultr, "index", string7);
	     
	     
	     WebElement childr = s.getChild_room();
	     selectByDropDown(childr, "index", string8);
	     
	   }

	@Then("user  click the search button")
	public void user_should_click_the_search_button() {
		 SearchHotel s =new  SearchHotel();
		 s.getSubmit().click();
	    
	}

	@Given("User is on the select hotel webpage")
	public void user_is_on_the_select_hotel_webpage() {
		System.out.println("select hotel"); 
	}
	
	
	@When("User should select the hotel by pressing the radio button")
	public void user_should_select_the_hotel_by_pressing_the_radio_button() {
		 SelectHotel s1=new SelectHotel();
		   s1.getRadiobutton_2().click();
		  
	}

	@Then("user should click the continue button")
	public void user_should_click_the_continue_button() {
		 SelectHotel s1=new SelectHotel();
		 s1.getBtncontinue().click();
		
	}

	@Given("User is on the Book a hotel webpage")
	public void user_is_on_the_Book_a_hotel_webpage() {
		System.out.println("Book a hotel");
	}
	
	
	@When("User entries {string}  {string} {string} {string}  {string} {string} {string} {string}")
	public void user_entries(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		BookaHotel b=new BookaHotel();
		   
		   WebElement first_name = b.getFirst_name();
		   typeText(first_name, string);
		   
		   WebElement last_name = b.getLast_name();
		   typeText(last_name, string2);
		   
		   WebElement address = b.getAddress();
		   typeText(address,string3);
		   
		   WebElement cc_num = b.getCc_num();
		   typeText(cc_num, string4);
		   
		   WebElement cc_type =b.getCc_type();
		   selectByDropDown(cc_type, "index", string5);
		     
		     WebElement cc_exp_month =b.getCc_exp_month();
		     selectByDropDown(cc_exp_month, "index", string6);
		     
		     WebElement cc_exp_year =b.getCc_exp_year();
		     selectByDropDown(cc_exp_year, "index",string7);
		   
		     
		     WebElement cc_cvv = b.getCc_cvv();
			 typeText(cc_cvv, string8);
		   
		     
	}

	@Then("user should click the book now button")
	public void user_should_click_the_book_now_button() {
		BookaHotel b=new BookaHotel();
		b.getBook_now().click();
	}

	
	@Given("User is on the Booking confirmation webpage")
	public void user_is_on_the_Booking_confirmation_webpage() {
		System.out.println("Booking confirmation");
	}
	
	

	@When("User should get the order no")
	public void user_should_get_the_order_no() {
		 BookConfirmation b1=new BookConfirmation();
		   WebElement order_no = b1.getOrder_no();
		   System.out.println(getAttributeValue(order_no, "value"));    
	}

	@Then("user should click the logout button")
	public void user_should_click_the_logout_button() {
		BookConfirmation b1=new BookConfirmation();
		 b1.getLogout().click();
		
	}

	
}
