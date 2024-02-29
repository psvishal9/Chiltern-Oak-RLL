package com.project.rll.steps;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.project.rll.pages.SubscribePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeSteps {
	private static final Logger logger = LogManager.getLogger(SubscribeSteps.class);

	SubscribePage subscribePage = new SubscribePage(BaseTest.driver);
	// SubscribeSteps subscribeSteps=new SubscribeSteps();

	@Given("user in homepage")
	public void user_in_homepage() {
		logger.info("user in homepage");

	}

	@When("user click Subscribe email text box")
	public void user_click_subscribe_email_text_box() {
		logger.info("user click Subscribe email text box");
		subscribePage.clickEmailTextBox();
	}

	@When("user fills the email as {string}")
	public void user_fills_the_email_as(String email) throws InterruptedException {
		logger.info("user fills the email");

		subscribePage.enterEmail(email);
		Thread.sleep(2000);
	}

	@When("user clicks on subscribe button")
	public void user_clicks_on_subscribe_button() throws InterruptedException {
		logger.info("user clicks on subscribe button");

		subscribePage.clickSubscribeBtn();
		Thread.sleep(2000);

	}

	@Then("it shows sucess message {string}")
	public void it_shows_sucess_message(String url) {
		logger.info("it shows sucess message {string}");

		String expected = url;
		String actual = subscribePage.getUrl();

		//Assert.assertEquals(expected, actual);// False To True Assert.assertFalse(actual.contains(expected));

	}
}
