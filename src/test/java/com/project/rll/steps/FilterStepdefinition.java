package com.project.rll.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project.rll.pages.FilterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FilterStepdefinition {

	FilterPage page=new FilterPage(BaseTest.driver);
	private static final Logger logger = LogManager.getLogger(FilterStepdefinition.class);
	
	@Given("user navigates to the website chilternoakfurniture.co.uk")
	public void user_navigates_to_the_website_chilternoakfurniture_co_uk() {
		logger.info("User navigate to product catlog page");
	}

	@Given("search the product")
	public void search_the_product() throws InterruptedException {
		logger.info("Item searched");
		page.searchProduct();
	}

	@Then("added filter successfully")
	public void added_filter_successfully() {
		logger.info("Filter operation performed successfully.");
	}

	@Given("drag the price element")
	public void drag_the_price_element() throws InterruptedException{
		logger.info("Drag item price element");
		page.drahPriceElement();
	}

	@Given("choose the color")
	public void choose_the_color() throws InterruptedException {
		logger.info("User choose the color of product");
		page.chooseColor();
	}
	
	@Given("choose the style")
	public void choose_the_style() throws InterruptedException {
		logger.info("User choose the color of product");
		page.chooseStyle();
	}
}
