package org.stedef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepAdactin {
	
	/*public static  WebDriver driver;
	@Given("User is on the adactin website")
	public void user_is_on_the_adactin_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("https://adactin.com/HotelApp/");   
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	    
	}

	@Then("user  click the login button")
	public void user_click_the_login_button() {
	driver.findElement(By.name("login")).click();
	}
	
	
	@Given("User is on the search hotel webpage")
	public void user_is_on_the_search_hotel_webpage() {
		System.out.println("search hotel");
	}

	@When("User enter the {string}  {string} {string} {string}  {string} {string} {string} {string}")
	public void user_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   

		
       WebElement loc = driver.findElement(By.id("location"));
	   Select s1=new Select(loc);
	   s1.selectByIndex(Integer.parseInt(string));
	   
	   WebElement hot = driver.findElement(By.id("hotels"));
	   Select s2=new Select(hot);
	   s2.selectByIndex(Integer.parseInt(string2));
	   
	   WebElement room_type = driver.findElement(By.id("room_type"));
	   Select s3=new Select(room_type);
	   s3.selectByIndex(Integer.parseInt(string3));
	   
	   WebElement room_nos = driver.findElement(By.id("room_nos"));
	   Select s4=new Select(room_nos);
	   s4.selectByIndex(Integer.parseInt(string4));
	   
	   driver.findElement(By.id("datepick_in")).sendKeys(string5);
	   driver.findElement(By.id("datepick_out")).sendKeys(string6);
	   
	   WebElement adult_room = driver.findElement(By.id("adult_room"));
	   Select s5=new Select(adult_room);
	   s5.selectByIndex(Integer.parseInt(string7));
	   
	   WebElement child_room = driver.findElement(By.id("child_room"));
	   Select s6=new Select(child_room);
	   s6.selectByIndex(Integer.parseInt(string8));
	   }

	@Then("user  click the search button")
	public void user_should_click_the_search_button() {
		driver.findElement(By.id("Submit")).click();
	    
	}

	@Given("User is on the select hotel webpage")
	public void user_is_on_the_select_hotel_webpage() {
		System.out.println("select hotel"); 
	}
	
	
	@When("User should select the hotel by pressing the radio button")
	public void user_should_select_the_hotel_by_pressing_the_radio_button() {
		 driver.findElement(By.id("radiobutton_0")).click(); 
	}

	@Then("user should click the continue button")
	public void user_should_click_the_continue_button() {
		driver.findElement(By.id("continue")).click();
	}

	@Given("User is on the Book a hotel webpage")
	public void user_is_on_the_Book_a_hotel_webpage() {
		System.out.println("Book a hotel");
	}
	
	
	@When("User entries {string}  {string} {string} {string}  {string} {string} {string} {string}")
	public void user_entries(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		 driver.findElement(By.id("first_name")).sendKeys(string);
		 driver.findElement(By.id("last_name")).sendKeys(string2);
		 driver.findElement(By.id("address")).sendKeys(string3);
		 driver.findElement(By.id("cc_num")).sendKeys(string4);
		
		   WebElement cc_type = driver.findElement(By.id("cc_type"));
		   Select s5=new Select(cc_type);
		   s5.selectByIndex(Integer.parseInt(string5));
		   WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		   Select s6=new Select(cc_exp_month);
		   s6.selectByIndex(Integer.parseInt(string6));
		   WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		   Select s7=new Select(cc_exp_year);
		   s7.selectByIndex(Integer.parseInt(string7));
		   
		   driver.findElement(By.id("cc_cvv")).sendKeys(string8);
		 
	}

	@Then("user should click the book now button")
	public void user_should_click_the_book_now_button() {
		driver.findElement(By.id("book_now")).click();
	}

	
	@Given("User is on the Booking confirmation webpage")
	public void user_is_on_the_Booking_confirmation_webpage() {
		System.out.println("Booking confirmation");
	}
	
	

	@When("User should get the order no")
	public void user_should_get_the_order_no() {
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println("****************");
		System.out.println(getAttributeValue(order, "value"));
		System.out.println("****************");
		
	    
	}

	@Then("user should click the logout button")
	public void user_should_click_the_logout_button() {
		driver.findElement(By.id("logout")).click(); 
	}

	

	*/
}
