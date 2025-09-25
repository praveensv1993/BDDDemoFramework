package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPagePOM {
	
	private By offerPageSearch=By.xpath("//input[@id='search-field']");
	private By OfferPageResult=By.xpath("//table[contains(@class,'table')]//td[1]");
	
	WebDriver driver;
	public OfferPagePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchTopDeal(String name)
	{
		driver.findElement(offerPageSearch).sendKeys(name);
	}
	
	public String getOfferPageName()
	{
		return driver.findElement(OfferPageResult).getText();
	}

}
