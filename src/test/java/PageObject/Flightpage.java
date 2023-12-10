package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.DeepInjection;
import Utils.GenericUtils;

public class Flightpage {
	public  DeepInjection di;
	public WebDriverWait wait;
	WebDriver driver;
	public Flightpage flightpage;
	Select select;
	public Flightpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='autosuggest']") WebElement auto;
	@FindBy(css  = "ul>li.ui-menu-item>a") List<WebElement> li;
	@FindBy(xpath  = "/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/span") WebElement Fromdrop;
	@FindBy(css  = "select#ctl00_mainContent_ddl_destinationStation1") WebElement Todrop;
	@FindBy(id = "ctl00_mainContent_btn_FindFlights") WebElement search;
	
	public void waitcondition()
	{	
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']")));
	}

	public void autosuggestion(String ind,String country)
	{
		auto.sendKeys(ind,Keys.RETURN);
		
		for(WebElement aa:li)
		{
			if(aa.getText().equalsIgnoreCase(country))
			{
			aa.click();
			break;
			}
		}
	}
	public void dropdownvisibletext(WebElement element,String text)
	{
		try {
			try {
				select=new Select(element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			select.selectByValue(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void destination(String name)
	{
		//(Fromdrop);
		waitcondition();
		dropdownvisibletext(Fromdrop, name);
	}
	public void reachplace(String place)
	{
		dropdownvisibletext(Todrop, place);
	}
	public void search()
	{
		search.click();
	}

}
