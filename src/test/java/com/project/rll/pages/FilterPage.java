package com.project.rll.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FilterPage {
	WebDriver driver;
	public FilterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locator
	@FindBy(using="//input[@class=\"main-search__input\"]",how=How.XPATH)
	private WebElement searchElment_text_box;
	
	
	@FindBy(using="//button[@type=\"submit\"]",how=How.XPATH)
	private WebElement search_button;
	
	@FindBy(using="//div[@class=\"cc-price-range__control cc-price-range__control--max\"]",how=How.XPATH)
	private WebElement dragElement_text_box;
	
	@FindBy(using="//label[@title=\"White\"]",how=How.XPATH)
	private WebElement choose_color_check_box;
	
	@FindBy(using="//span[@class=\"cc-checkbox__label\"]",how = How.XPATH)
    private WebElement choose_style_check_box;
	
	// Methods
	public void searchProduct() throws InterruptedException {
		searchElment_text_box.clear();
		searchElment_text_box.sendKeys("table");
		Thread.sleep(2000);
		search_button.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
	}
	public void drahPriceElement() throws InterruptedException {
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(dragElement_text_box, -20, 0).build().perform();
	}
	public void chooseColor() throws InterruptedException {
		Thread.sleep(3000);
		choose_color_check_box.click();
	}
	public void chooseStyle() throws InterruptedException {
		Thread.sleep(3000);
		choose_style_check_box.click();
	}

}
