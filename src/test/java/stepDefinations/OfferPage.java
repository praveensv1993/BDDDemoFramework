package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.LandingPagePOM;
import pageObject.OfferPagePOM;
import pageObject.PageObjectManager;
import utils.TestContextSetup;

public class OfferPage {
	WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	public OfferPagePOM offerPagePOM;

	public OfferPage(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.offerPagePOM = testContextSetup.pageObjectManager.getOfferPagePOM();
	}

	@Then("^user search for same shortname (.+) in offers page to check if product exist$")
	public void user_search_for_same_shortname_in_offers_page_to_check_if_product_exist(String str) throws InterruptedException {

		// testContextSetup.pageObjectManager.getLandingPagePOM();
		Thread.sleep(10000);
		testContextSetup.pageObjectManager.getLandingPagePOM().clickTopDeal();

		testContextSetup.genericUtils.switchToChildWindow();

		testContextSetup.pageObjectManager.getOfferPagePOM().searchTopDeal(str);

		offerPageProductName=testContextSetup.pageObjectManager.getOfferPagePOM().getOfferPageName();
	}

	@And("compare landing page and offer page product name")
	public void compare_productName() {
		Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductName);
	}

}
