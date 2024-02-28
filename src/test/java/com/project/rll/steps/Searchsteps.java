package com.project.rll.steps;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project.rll.pages.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Searchsteps {
	Logger logger = LogManager.getLogger(Searchsteps.class);
	
     Searchpage searchPage=new Searchpage(BaseTest.driver);
    
    
    
    @Given("I open the browser and enter the URL")
    public void iOpenTheBrowserAndEnterTheURL() {
    	logger.info("Chilternoak Furniture Homepage");
        
    }

    @When("I enter a  product name as {string} in the search bar")
    public void iEnterAValidProductNameInTheSearchBar(String productName) {
    	logger.info( "entering valid product name");
        searchPage.enterSearchTerm(productName);
       
        
    }

    @When("I click on the search button")
    public void iClickOnTheSearchButton() {
    	logger.info("clicking on search button");
        searchPage.clickSearchButton();
        
    }
    @Then("validate {string} are found or not")
    public void validateresults_are_found_or_not(String string) {
       
        
        String actualTitle = searchPage.checkTitle();
 
       assertTrue(actualTitle.contains(string));
    }

  
}
