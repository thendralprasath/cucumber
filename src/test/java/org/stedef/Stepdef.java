package org.stedef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdef {
	WebDriver driver;
	
	@Given("User is on the facebook website")
	public void user_is_on_the_facebook_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/" );
	  
	}

	@When("User should enter the username and password")
	public void user_should_enter_the_username_and_password() {
	   driver.findElement(By.cssSelector("input#email")).sendKeys("thendral");
	   driver.findElement(By.cssSelector("input#pass")).sendKeys("thendu");
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user should validate the jhome page is present or not")
	public void user_should_validate_the_jhome_page_is_present_or_not() {
	  System.out.println("validate ............."); 
	}



}
