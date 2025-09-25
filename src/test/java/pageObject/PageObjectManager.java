package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPagePOM landingPagePOM;
	public OfferPagePOM offerPagePOM;
	public CheckOutPagePOM checkOutPagePOM;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPagePOM getLandingPagePOM()
	{
		return landingPagePOM=new LandingPagePOM(driver);
	}
	
	public OfferPagePOM getOfferPagePOM()
	{
		return offerPagePOM=new OfferPagePOM(driver);
	}
	public CheckOutPagePOM getcheckOutPagePOM()
	{
		return checkOutPagePOM= new CheckOutPagePOM(driver);
	}

}
