package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPagePOM {
	
	public WebDriver driver;
	
	public CheckOutPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	By cart=By.xpath("//*[@alt='Cart']");
	By checkout=By.xpath("//*[text()='PROCEED TO CHECKOUT']");
	By promoButton=By.cssSelector(".promoBtn");
	By placeOrder=By.xpath("//button[text()='Place Order']");
	
	public void checkoutPage() throws InterruptedException
	{
		System.out.println("__________________Checkout_____________");
		Thread.sleep(1000);
		driver.findElement(cart).click();
		Thread.sleep(1000);
		driver.findElement(checkout).click();
		Thread.sleep(1000);
	}
	
	public boolean verifyPromoButton()
	{
		return driver.findElement(promoButton).isDisplayed();
		
	}
	
	public boolean verifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
		
	}

}
