package stepDefinations;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPagePOM;
import pageObject.PageObjectManager;
import utils.TestContextSetup;

public class LandingPage {
	WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	public LandingPagePOM landingPage;
	public LandingPage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		//landingPage=testContextSetup.pageObjectManager.getLandingPagePOM();
	}
	
	@Given("user is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		//System.out.println(testContextSetup.driver.getCurrentUrl());
	}
	@When("^user searched with shortname (.+) and extract the actual name of the product$")
	public void user_searched_with_shortname_and_extract_the_actual_name_of_the_product(String string) throws InterruptedException {
		
		
		testContextSetup.pageObjectManager.getLandingPagePOM().searchItem(string);
		Thread.sleep(1000);
		testContextSetup.landingPageProductName=testContextSetup.pageObjectManager.getLandingPagePOM().getProduct();
		
		System.out.println(testContextSetup.landingPageProductName);
	}
	
	@And("^Add (.+) items selected product to the cart$")
	public void addItemsToCart(Integer qty)
	{
		//System.out.println("____________________");
		testContextSetup.pageObjectManager.landingPagePOM.addQty(qty);
		testContextSetup.pageObjectManager.landingPagePOM.addToCart();
		//System.out.println("____________________Complete______________________________________");
	}
	
}
