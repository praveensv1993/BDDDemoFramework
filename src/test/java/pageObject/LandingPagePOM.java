package pageObject;
import org.openqa.selenium.*;

import utils.TestContextSetup;

public class LandingPagePOM {
	private By search =By.xpath("//input[@class='search-keyword']");
	private By productName=By.xpath("//h4[@class='product-name']");
	private By topDeal =By.xpath("//a[text()='Top Deals']");
	private By addToCart=By.xpath("//button[text()='ADD TO CART']");
	private By quantityIncrement=By.cssSelector("a.increment");
	WebDriver driver;
	public LandingPagePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProduct()
	{
		return driver.findElement(productName).getText().split("-")[0].toString().trim();
	}
	public void clickTopDeal()
	{
		driver.findElement(topDeal).click();
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public void addQty(int q)
	{
		while(q>0)
		{
			driver.findElement(quantityIncrement).click();
			q--;
		}
	}

}
