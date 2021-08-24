package org.stedef;

import org.adactinlocators.Login;
import org.adactinlocators.SearchHotel;
import org.adactinlocators.SelectHotel;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SampleAdactin extends BaseClass {



		@Given("user is Adacting home page")
		public void user_is_Adacting_home_page() {
			getDriver("chrome");
			launchUrl("https://adactin.com/HotelApp/");
		}

		@When("user enter {string} and {string}")
		public void user_enter_and(String string, String string2) {
			Login l =new Login();
		    WebElement user =l.getUsername();
			typeText(user, string);
			WebElement pass =l.getPassword();
			typeText(pass, string2);
		    
		}

		@When("user should click login button")
		public void user_should_click_login_button() {
			Login l =new Login();
			WebElement log =l.getLogin();
			btnclick(log);
		    
		}

		@When("user should selec hotel and continue for booking")
		public void user_should_selec_hotel_and_continue_for_booking() {
			 SelectHotel s1=new SelectHotel();
			   s1.getRadiobutton_2().click();
			   s1.getBtncontinue().click();
			   
		}


	
}
