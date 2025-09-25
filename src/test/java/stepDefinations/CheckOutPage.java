package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.CheckOutPagePOM;
import utils.TestContextSetup;

public class CheckOutPage {
	
	public TestContextSetup testContextSetup;
	
	public CheckOutPage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		
	}
	
	@And("verify user have option to enter the promo code in checkout page")
	public void verify_user_has_ability_to_enter_promo_code()
	{
		Assert.assertTrue(testContextSetup.pageObjectManager.getcheckOutPagePOM().verifyPromoButton());
		Assert.assertTrue(testContextSetup.pageObjectManager.getcheckOutPagePOM().verifyPlaceOrder());
		
	}
	@Then("^user proceeds to checkout Page and verify (.+) items in the checkout page$")
	public void verify_product_in_checkoutPage(String name) throws InterruptedException
	{
		System.out.println("user proceeds to checkout Page and verify (.+) items in the checkout page");
		testContextSetup.pageObjectManager.getcheckOutPagePOM().checkoutPage();
	}
	
}
