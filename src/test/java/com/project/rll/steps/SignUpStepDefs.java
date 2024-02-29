package com.project.rll.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.project.rll.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDefs {
	SignUpPage sp=new SignUpPage(BaseTest.driver);
	
	private static final Logger logger = LogManager.getLogger(SignUpStepDefs.class);
	
	@Given("user navigates to the signup page")
	public void user_navigates_to_the_signup_page() throws InterruptedException {
		logger.info("User navigates to the signuppage");
		sp.clicSignUpLink();
	}

	@When("the user enters their first name as {string}")
	public void the_user_enters_their_first_name_as(String string) throws InterruptedException {
		logger.info("the user enters their first name ");
		sp.enter_fname(string);
		System.out.println("User enters First name");
	}
	
	@When("the user enters their last name as {string}")
	public void the_user_enters_their_last_name_as(String string) throws InterruptedException {
		logger.info("the user enters their last name ");
		sp.enter_lname(string);
		System.out.println("User enters Last name");
	}
	
	@When("the user enters their email as {string}")
	public void the_user_enters_their_email_as(String string) throws InterruptedException {
		logger.info("the user enters their email ");
		sp.enter_email(string);
		System.out.println("User enters email");
	}
	
	@When("the user enters their password as {string}")
	public void the_user_enters_their_password_as(String string) throws InterruptedException {
		logger.info("the user enters their password ");
		sp.enter_password(string);	
		System.out.println("User enters password");
	}
	
	@When("the user click on create botton")
	public void the_user_click_on_create_botton() throws InterruptedException {
		logger.info("the user click on create botton ");
		sp.click_Create();
	}
	
	@Then("the user should see the status as {string}")
	public void the_user_should_see_the_status_as(String string) throws InterruptedException {
		logger.info("the user should be registered successfully ");
		
		String expectedText = string;
		String actualText = sp.validate_confirm();
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
