package com.project.rll.pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Searchpage {
		WebDriver driver;
		public Searchpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(this.driver, this);
		}
	    @FindBy(xpath="//input[@type='text']")
	    public WebElement searchBar;

	    @FindBy(xpath="//button[@type='submit']")
	    public WebElement searchButton;
	    
	

	    public void enterSearchTerm(String productName) {
	        searchBar.sendKeys(productName);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }
	    
	    public String checkTitle() {
	    	return driver.getTitle();
	    }

		

	    public boolean isResultFound(String searchTerm) {
	        
	        if (performSearch(searchTerm)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	   
	    public boolean performSearch(String searchTerm) {
	       
	        return searchTerm.equals("existingTerm");
	    }
		
		
	
	}

