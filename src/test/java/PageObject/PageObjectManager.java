package PageObject;

import org.openqa.selenium.WebDriver;
// factory design pattern

import Utils.GenericUtils;
public class PageObjectManager {
	 public Landingpage landingpage;
	 public Offerpage offerpage;
	 public CheckoutPage checkoutpage;
	 public WebDriver driver;
	 public GenericUtils generic;
	public Flightpage flightpage;

	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	public Landingpage getlandingpage()
	{
		landingpage=new Landingpage(driver);
		return landingpage;
	}
	public Offerpage getofferpage()
	{
		offerpage=new Offerpage(driver);
		return offerpage;
	}
	public CheckoutPage getcheckoutpage()
	{
		checkoutpage=new CheckoutPage(driver);
		return checkoutpage;
	}
	public Flightpage getflightpage()
	{
		flightpage=new Flightpage(driver);
		return flightpage;

	}
}
