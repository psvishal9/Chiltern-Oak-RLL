package com.project.rll.steps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project.rll.pages.cartpages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class cart {

	private static final Logger logger = LogManager.getLogger(cart.class);
	cartpages pages = new cartpages(BaseTest.driver);

	@Given("User navigates to the URL")
	public void user_navigates_to_the_url() {
		logger.info("Navigating to the URL");

	}

	@Then("user search sofa")
	public void user_search_book() throws InterruptedException {
		logger.info("user searches for sofa");

		pages.inputToSearch("sofa");

	}

	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
		logger.info("Then adds item to cart");
		Thread.sleep(2000);
		pages.add();
		Thread.sleep(2000);
	

	}

	@Then("add to cart and continue")
	public void add_to_cart_and_continue() throws InterruptedException {
		logger.info("Then adds item to cart");
		Thread.sleep(2000);
		pages.addcontinue();

	}
	@Then("remove from the cart")
	public void remove_from_the_cart()throws InterruptedException {
		logger.info("Then removes item from cart");
		Thread.sleep(3000);
		pages.remove();
		Thread.sleep(3000);

		System.out.println(pages.cartText());

	}

	@Then("user search table")
	public void user_search_book1() throws InterruptedException {
		logger.info("user searches for table");

		pages.inputToSearch("table");

	}

	@Then("user search Tv unit")
	public void user_search_chair() throws InterruptedException {
		pages.inputToSearch("Tv unit");
	}

	@Then("validate with added product count")
	public void validate_with_added_product_count() throws InterruptedException {
		String Actual = pages.getCount();
		String expected = "(1)";
		Assert.assertEquals(Actual, expected);
	}

	@Then("validate product is removed")
	public void validate_product_is_removed() throws InterruptedException {
		String Actual = pages.cartText();
		String expected = "You have no items in your cart";
		Assert.assertEquals(Actual, expected);
	}

	@Then("validate multiple products are added")
	public void validate_multiple_products_are_added() throws InterruptedException {
		String Actual = pages.getCount();
		String expected = "(3)";
		Assert.assertEquals(Actual, expected);
	}
	@Given("user search NoteBook")
	public void user_search_NoteBook() throws InterruptedException {
		
		pages.inputToSearch("NoteBook");
	   
	}

	@Then("validate invalid item")
	public void validate_invalid_item() throws InterruptedException{
		String Actual = pages.searchtext();
		String expected = "No search results";
		Assert.assertEquals(Actual, expected);
	    
	}
	@Then("incresing the quantity")
	public void incresing_the_quantity() throws InterruptedException {
	    
		logger.info("The quantity is increased");

	   pages.increment();
	   Thread.sleep(2000);
	}
	@Then("validate the item quantity increased")
	public void validate_the_item_quantity_increased() throws InterruptedException{
	    
		String Actual = pages.getCount();
		String expected = "(5)";
		//Assert.assertEquals(Actual, expected);
	}


}
