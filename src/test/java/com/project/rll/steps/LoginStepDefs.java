package com.project.rll.steps;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.project.rll.pages.LoginPage;
import com.project.rll.utility.XLUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefs {
	private static final Logger logger = LogManager.getLogger(LoginStepDefs.class);
	String path = "./TestData/loginData.xlsx";

	XLUtility util = new XLUtility(path);
	WebDriver driver;
	BaseTest test;
	LoginPage lp = new LoginPage(BaseTest.driver);

	@Given("user navigates to the login page")
	public void user_navigates_to_the_login_page() {
		logger.info("User navigates to the loginpage");

		lp.click_Login();

	}

	@When("user enters username and password by giving {string} and {int}")
	public void user_enters_and(String sheetname, int row) throws IOException, InterruptedException {
		logger.info("user enters username and password");
		String id = util.getCellData(sheetname, row, 0);
		String pwd = util.getCellData(sheetname, row, 1);
		lp.enter_Credentials(id, pwd);
		lp.click_LoginBtn();
		if (lp.validateUrl().equals("https://www.chilternoakfurniture.co.uk/account")
				) {
			util.setCellData(sheetname, row, 2, "Valid");
		} else {
			util.setCellData(sheetname, row, 2, "Invalid");
		}

	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		logger.info("clicks the login button");

	}

	@Then("verify user is able to login checking {string}")
	public void verify_user_is_able_to_login_checking(String loginDetails) {
		logger.info("Message Should Be Displayed");

		Assert.assertEquals(lp.validateUrl(), loginDetails);
	}

}
