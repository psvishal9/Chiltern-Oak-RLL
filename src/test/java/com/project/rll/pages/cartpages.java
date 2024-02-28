package com.project.rll.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpages {

	private final WebDriver driver;

	@FindBy(xpath = "//input[@class='main-search__input']")
	private WebElement Input;

	@FindBy(xpath = "//input[@name='q']")
	private WebElement search;

	@FindBy(xpath = "//button[@class='btn product-add']")
	private WebElement addtocartbutton;

	@FindBy(xpath = "//a[@class='cart-summary__close toggle-cart-summary']")
	private WebElement continuebutton;
	

	@FindBy(xpath = "//button[@class=\"qty-adjuster__down\"]")
	private WebElement removefromcartbutton;

	@FindBy(xpath = "//button[@fdprocessedid='104bzk']")
	private WebElement addtocart;

	
	@FindBy(xpath = "//small[@class='cart-summary__item-list-header__count']")
	private WebElement addcount;

	

	@FindBy(xpath = "//div[@class='cart-summary__section']//p")
	private WebElement emptycart;;
	
	@FindBy(xpath ="//p[@class='section align-center mt-0']")
	private WebElement invalidsearch;
	
	@FindBy(xpath="//input[@class='qty-adjuster__value']")
	//@FindBy(xpath="//input[@name='updates[]']")
	private WebElement quntityincrement;

	public cartpages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void navigateToURL(String url) {
		driver.get(url);
	}

	public void inputToSearch(String value) throws InterruptedException {
		Input.sendKeys(value);
		
		Input.submit();

		Thread.sleep(2000);

		Input.clear();
	}

	public void add() {
		addtocartbutton.click();

	}

	public void addcontinue() throws InterruptedException {
		
		addtocartbutton.click();

		Thread.sleep(3000);

		continuebutton.click();
		
		Thread.sleep(3000);

	}

	public void remove() throws InterruptedException {
		removefromcartbutton.click();

	}

	public void inputToSearch1(String value) {
		Input.click();
		Input.sendKeys(value);

		search.click();
	}

	public String getCount() {
		return addcount.getText();

	}

	public String cartText() {
		return emptycart.getText();
	}
	public String searchtext() {
		return invalidsearch.getText();
	}
	
public void increment() throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		
		quntityincrement.clear();
		
		
		quntityincrement.sendKeys("5");
	}


}